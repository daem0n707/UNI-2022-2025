#include <stdio.h>
#include <stdlib.h>

struct sll
{
	int data;
	struct sll * next;
};

typedef struct sll * node;
node first = NULL;

void insert()
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
}

void delete()
{
	node temp;
	temp = first;
	first = first->next;
	printf("[+] %d has been deleted.\n", temp->data);
	free(temp);
}

void display()
{
	node temp;
	temp = first;
	while(temp != NULL)
	{
		printf("%d ", temp->data);
		temp = temp->next;
	}
	printf("\n");
}

void main()
{
	while(1)
	{
		printf("\n[1] INSERT \n[2] DELETE \n[3] DISPLAY \n[4] EXIT");
		printf("\nSELECT AN OPTION: ");
		int option;
		scanf("%d", &option);
	
		switch(option)
		{
			case 1: insert();
					break;
			case 2: delete();
					break;
			case 3: display();
					break;
			case 4: printf("\nQUITTING\n");
					return;
			default: printf("[!] Invalid option.\n");
		}
	}
}
