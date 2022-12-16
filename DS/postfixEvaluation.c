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
		}
		else
		{
			int op2 = pop();
			int op1 = pop();
			res = evaluate(symbol, op1, op2);
			push(res);
		}
	}
	res = pop();
	printf("\nResult: %d", res);	
}
//INPUT: 632-5*1^7+
//OUTPUT: 18.00
