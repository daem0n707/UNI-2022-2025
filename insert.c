#include<stdio.h>
int a[10], ele, pos, n;
void arrayCreate()
{	
	printf("\nEnter the number of elements: ");
	scanf("%d", &n);
	printf("\n Enter the elements: ");
	for(int i=0; i<n; i++)
	scanf("%d", &a[i]);
	printf("\n[~] Your array has been created.\n[~] Select option 2 to print the array");
}
void arrayDisplay()
{
	printf("\nYour array is:");
	for(int i=0; i<n; i++)
	printf("%d ", a[i]);
}
void arrayInsert()
{
	printf("\nEnter the position to insert element: ");
	scanf("%d", &pos);
	if(pos>n)
	printf("[!] Array index out of range.");
	else
	{
		printf("\nEnter the element: ");
		scanf("%d", &ele);
		for(int i=n; i>=pos; i--)
		{
			a[i+1] = a[i];
		}
		a[pos] = ele;
		printf("\n[~] Element %d has been inserted at index %d.", ele, pos);
	}
	n += 1;
	
}
void arrayDelete()
{
	printf("\nEnter the position to delete element: ");
	scanf("%d", &pos);
	if(pos>n)
	printf("[!] Array index out of range.");
	else
	{
		for(int i=pos+1; i<n; i++)
		a[i-1] = a[i];
		printf("\n[~] Element at position %d has been deleted.", pos);
	}
	n -= 1;
}
void main()
{
	int option;
	while(1)
	{
		printf("\n\n<----->SELECT AN OPTION<----->");
		printf("\n[1] Create an array");
		printf("\n[2] Display the array");
		printf("\n[3] Insert an element");
		printf("\n[4] Delete an element");
		printf("\n[5] Exit");
		printf("\nSelect an option: ");
		scanf("%d", &option);
		if(option == 1)
		arrayCreate();
		printf("<=================================================>");
		else if(option == 2)
		arrayDisplay();
		printf("<=================================================>");
		else if(option == 3)
		arrayInsert();
		printf("<=================================================>");
		else if(option == 4)
		arrayDelete();
		printf("<=================================================>");
		else if(option == 5)
		{
			printf("[~] Quitting.\n");
			break;
		}
		else
		printf("\n[!] Invalid option");
		printf("<=================================================>");
	}		
}
