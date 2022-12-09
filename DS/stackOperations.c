#include<stdio.h>
#define size 4
int top=-1, ele, a[size];
void push()
{
	if(top == 4)
	printf("\n[!] Stack overflow");
	else
	{
		printf("\nEnter the element: ");
		scanf("%d", &ele);
		top++;
		a[top] = ele;
		printf("\n[~] %d has been pushed.", ele);
	}
	
}
void pop()
{
	if(top == -1)
	printf("\n[!] Stack underflow");
	else
	{
		top--;
		printf("\n[~] Element has been deleted.");
	}
}
void display()
{
	if(top == -1)
	printf("\n[!] Stack empty.");
	else
	{
		printf("\nSTACK ELEMENTS:");
		for(int i=top; i>=0; i--)
		printf("\n%d", a[i]);
	}
}
void main()
{
	int option;
	while(1)
	{
		printf("\n\n<----->SELECT AN OPTION<----->");
		printf("\n[1] PUSH");
		printf("\n[2] POP");
		printf("\n[3] DISPLAY");
		printf("\n[4] Exit");
		printf("\nSelect an option: ");
		scanf("%d", &option);
		if(option == 1)
		push();
		else if(option == 2)
		pop();
		else if(option == 3)
		display();
		else if(option == 4)
		{
			printf("[~] Quitting.\n");
			break;
		}
		else
		printf("\n[!] Invalid option");
	}		
}
