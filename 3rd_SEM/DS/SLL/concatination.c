#include <stdio.h>
#include <stdlib.h>

struct sll
{
	int data;
	struct sll * next;
};

typedef struct sll * node;
node start1=NULL, start2=NULL;

node create(int arr[], int n)
{
	node temp, last, t;
	temp = (node)malloc(sizeof(struct sll));
	temp->data = arr[0];
	temp->next = NULL;
	last = temp;

	for(int i=1; i<n ; i++)
	{
		t = (node)malloc(sizeof(struct sll));
		t->data = arr[i];
		t->next = NULL;
		last->next = t;
		last = t;
	}

	return temp;
}

node concat(node start1, node start2)
{
	if(start1 == NULL)
	{
		return start2;
	}
	else if (start2 == NULL)
	{
		return start1;
	}
	else
	{
		node temp = start1;
		while(temp->next != NULL)
		{
			temp = temp->next;
		}
		temp->next = start2;
		return start1;
	}
}

void display(node start)
{
	node temp;
	temp = start;
	while(temp != NULL)
	{
		printf("%d ", temp->data);
		temp = temp->next;
	}
	printf("\n");
}

void main()
{
	int l1, l2;
	
	printf("\nEnter length of first linked list: ");
	scanf("%d", &l1);
	printf("\nEnter the elements: ");
	int a[l1];
	for(int i=0;i<l1;i++)
		scanf("%d", &a[i]);

	printf("\nEnter length of second linked list : ");
	scanf("%d", &l2);
	printf("\nEnter the elements: ");
	int b[l2];
	for(int i=0;i<l2;i++)
		scanf("%d", &b[i]);
	
	node first = create(a, l1);
	node second = create(b, l2);

	node final = concat(first, second);
	printf("\nElements after concatination: ");
	display(final);
}