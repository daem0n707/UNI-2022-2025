#include<stdio.h>
#include<ctype.h> // Includes isalnum(), isdigit() functions
#define MAX 20

char stack[MAX];
int top = -1;

char pop()
{
	if(top == -1)
	printf("\n[!] Stack underflow");	
	else
	{
		char ele =  stack[top--]; // top-- => top = top - 1
		return ele;
	}
}
void push(char a)
{
	if(top == MAX-1)
	printf("\n[!] Stack overflow");
	else
	{
		stack[++top] = a;
	}
}
int priority(char c)
{
	if(c == '#')
		return 0;
	else if(c == '(')
		return 1;
	else if(c == '+' || c == '-')
		return 2;
	else if(c == '*' || c == '%' || c == '/')
		return 3;
	else 
		return 4;
}

void main()
{
	char postfix[MAX], infix[MAX];
	int j=0;
	printf("\nEnter the infix expression: ");
	scanf("%s", infix);
	push('#'); // First element in the stack should always be #
	for(int i=0; infix[i]!='\0'; i++)
	{
		char exp = infix[i];
		if(isalnum(exp)) // To check wheather the character is an alphabet
		{
			postfix[j++] = exp; // Push it into the final postfix expression
		}
		else if(exp == '(')
		{
			push(exp); // Push it into the temporary stack
		}
		else if(exp == ')')
		{
			while(stack[top] != '(')
			{
				postfix[j++] = pop(); // Keep deleting until '(' is encountered
						      // This while loop stops right after '(' in the stack
			}
			top--; // To delete '(' from the stack
		}
		else
		{
			while(priority(stack[top]) >= priority(exp))
			{
				postfix[j++] = pop(); 
			}
			push(exp); // If the priority of the top element in the stack is less than that of the 
				   // element in infix expression, directly push it into the stack
		}
	}
	while(stack[top] != '#')
	{
		postfix[j++] == pop(); // Incase there are elements left in the stack, push it into the
				       // postfix expression stack
	}
	postfix[j++] == '\0';
	printf("\nPostfix Expression: %s\n", postfix);
}
// INPUT: ((A+(B-C)*D^E+F)
// OUTPUT: ABC-D*+E^F+
