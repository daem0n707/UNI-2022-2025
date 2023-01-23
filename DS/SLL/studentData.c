#include <stdio.h>
#include <stdlib.h>

struct sll
{
	char name[10];
	char usn[10];
	int marks;
	struct sll * next;
};

typedef struct sll * node;
node first = NULL;

void insert_front()
{
	node new;
	new = (node)malloc(sizeof(struct sll));
	printf("\nEnter the student name: ");
	scanf("%s", new->name);
	printf("\nEnter the USN: ");
	scanf("%s", new->usn);
	printf("\nEnter the marks: ");
	scanf("%d", &new->marks);

	new->next = NULL;

	if(first == NULL)
		first = new;
	else
	{
		new->next = first;
		first = new;
	}
	printf("\n[+] Student %s has been inserted.", new->name);
}

void delete_front() 
{
	if(first)
	{
		node temp;
		temp = first;
		first = first->next;
		printf("\n[+] %s has been deleted.", temp->name);
		free(temp);
	}
	else
		printf("\n[!] List is empty.");
}

void display()
{
    node temp; 
    temp = first;
    if(first == NULL)
	{
        printf("\n[!] List is empty");
		return;
	}
	while(temp != NULL)
	{
		printf("\nNAME: %s USN: %s MARKS: %d", temp->name, temp->usn, temp->marks);
		temp = temp->next;
	}
    free(temp);
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
