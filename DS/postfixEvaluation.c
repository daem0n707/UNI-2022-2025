#include <stdio.h>
#include <ctype.h>
#include <math.h> //During compilation, use -lm to include math library
#define MAX 20

float stack[MAX];
int top = -1;

void push(float n)
{
	if(top<MAX-1)
	{
		stack[++top] = n;	
	}
	else
	{
		printf("\n[!] Stack Overflow!");
	}
}

float pop()
{
	if(top == -1)
	{
		printf("\n[!] Stack Underflow");
	}
	else
	{
		float item = stack[top--];
		return item;
	}
}

float evaluate(char symbol, float op1, float op2)
{
	switch(symbol)
	{
		case '+': 
			return op1 + op2;
		case '-' :
			return op1 - op2;
		case '*' :
			return op1 * op2;
		case '/' :
			return op1 / op2;
		case '%' :
			return fmod(op1, op2);
		case '^' :	
			return pow(op1,op2);
		default :
			printf("\n[!] Invalid operation");
	}	
}

int main()
{
	char post[50];
	printf("Enter a postfix expression: ");
	scanf("%s", post);
	int res;char symbol;
	for(int i=0; post[i]!='\0'; i++)
	{
		symbol = post[i];
		if(isdigit(symbol))
		{
			push(symbol - '0'); // - '0' converts the variable symbol which is stored as character to integer.
			// printf("\n[~] Pushed %d to stack", symbol - '0');
		}
		else
		{
			int op1 = pop();
			int op2 = pop();
			res = evaluate(symbol, op2, op1); // Note how op1 and op2 is passed into the function
			// printf("\n[+] Calculated %d %c %d = %d", op2, symbol, op1, res);
			push(res);
			// printf("\n[~] Pushed %d to stack", res);
		}
	}
	res = pop();
	printf("\nResult: %d\n", res);	
}
//Uncomment the lines 67, 74, and 76 to print each operation
//INPUT: 632-5*+1^7+
//OUTPUT: 18.00