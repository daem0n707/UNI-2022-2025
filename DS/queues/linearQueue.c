#include <stdio.h>
#define size 10
void insert();
void delete();
void display();
void exit();

int r = -1, f = -1 , q[size];

int main()
{
	int c;
	while(1)
	{
		printf("\n1.Insert function");
		printf("\n2.Delete function");
		printf("\n3.Display function");
		printf("\n4.Exit");
		printf("\nEnter your choice :");
		scanf("%d",&c);
		switch(c)
		{
			case 1 : insert();
				 break;
			case 2 : delete();
				 break;
			case 3 : display();
				 break;
			case 4 : exit(1);
		}
	}
}
void insert()
{
	int ele;
	if(r == size-1)
	{
		printf("\nQueue Overflow\n");
		return ;
	}
	else
	{
		if(f == -1)
		{
			f = 0;
		}
		r+=1;
		printf("\nEnter the element to be inserted : ");
		scanf("%d",&ele);
		q[r]=ele;
	}
}

void delete()
{
	if(f == -1||f>r)
	{
		printf("\nQueue Underflow\n");
		return;
	}
	else
	{
		printf("\n%d is deleted\n",q[f]);
		f+=1;
	}
}

void display()
{
	int i;
	if(f == -1||f>r)
	{
		printf("\nQueue is Empty\n");
		return;
	}
	else
	{
		printf("\nQueue is  :");
		for(i = f ; i<= r;i++)
		{
			printf("%d ",q[i]);
		}
		printf("\n");
	}	
	
}
 
