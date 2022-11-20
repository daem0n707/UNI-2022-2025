#include<stdio.h>
int a[10], n;
void arrayCreate()
{	
	printf("\nEnter the number of elements: ");
	scanf("%d", &n);
	printf("\n Enter the elements: ");
	for(int i=0; i<n; i++)
	scanf("%d", &a[i]);
	printf("\n[~] Your array has been created.\n[~] Select option 3 to print the array");
}
void arrayDisplay()
{
	printf("\nYour array is:");
	for(int i=0; i<n; i++)
	printf("%d ", a[i]);
}

void main()
{
	int option;
	while(1)
	{
		printf("\n\n<----->SELECT AN OPTION<----->");
		printf("\n[1] Create an array");
		printf("\n[2] Print the array");
		printf("\n[3] Exit");
		printf("\nSelect an option: ");
		scanf("%d", &option);
		if(option == 1)
		arrayCreate();
		else if(option == 2)
		arrayDisplay();
		else if(option == 3)
		{
			printf("[~] Quitting.\n");
			break;
		}
		else
		printf("\n[!] Invalid option");
	}		
}
