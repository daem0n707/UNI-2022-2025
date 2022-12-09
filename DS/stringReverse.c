//String reverse using stacks
#include <stdio.h>
#include <string.h>
#define size 10 //Declare size 10 for stack
char s[size];
int top = -1;

int push(char c)
{
	s[++top] = c;
}
void pop()
{
	printf("%c", s[top--]);
}
void main()
{
	char a[10];
	printf("Enter a string: ");
	scanf("%s", &a);
	int len = strlen(a);
	for(int i=0; i<len; i++)
	{
		push(a[i]);
	}
	for(int i=0; i<len; i++)
	pop();
}
