#include <stdio.h>
#include <stdlib.h>

struct sll
{
	int data;
	struct sll * next;
};

typedef struct sll * node;
node first = NULL;

void insert_front()
{
	int n;
	printf("\nEnter the element to insert: ");
	scanf("%d", &n);
	node new;
	new = (node)malloc(sizeof(struct sll));
	new->data = n;
	new->next = NULL;

	if(first == NULL)
		first = new;
	else
	{
		new->next = first;
		first = new;
	}
	printf("\n[+] %d has been inserted.", n);
}

void delete_front() 
{
	if(first)
	{
		node temp;
		temp = first;
		first = first->next;
		printf("\n[+] %d has been deleted.", temp->data);
		free(temp);
	}
	else
		printf("\n[!] List is empty.");
}

void display()
{
	node temp;
	temp = first;
	printf("\nElements are: ");
	while(temp != NULL)
	{
		printf("%d ", temp->data);
		temp = temp->next;
	}
	printf("\n");
}

void main()
{
	int option;
	while(1)
	{
		printf("\n\n[1] PUSH \n[2] POP \n[3] DISPLAY \n[4] EXIT");
		printf("\nSELECT AN OPTION: ");
		scanf("%d", &option);
	
		switch(option)
		{
			case 1: insert_front();
					break;
			case 2: delete_front();
					break;
			case 3: display();
					break;
			case 4: printf("\nQUITTING\n");
					return;
			default: printf("\n[!] Invalid option.");
		}
	}
}
