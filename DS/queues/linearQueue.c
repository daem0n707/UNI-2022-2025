#include <stdio.h>
#define size 10

void insert();
void delete();
void display();
void exit();

int r=-1, f=0, q[size];

int main()
{
	int o;
	while(1)
	{
		printf("\n[1] INSERT\n[2] DELETE\n[3] DISPLAY\n[4] EXIT");
		printf("\nSELECT AN OPTION: ");
		scanf("%d", &o);
		switch(o)
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
		printf("\n[!] Queue Overflow");
		return;
	}
	else
	{
		r+=1;
		printf("\nEnter the element to be inserted: ");
		scanf("%d", &ele);
		q[r]=ele;
	}
}

void delete()
{
	if(f == -1|| f>r)
	{
		printf("\n[!] Queue Underflow");
		return;
	}
	else
	{
		printf("\n%d is deleted\n", q[f]);
		f+=1;
	}
}

void display()
{
	int i;
	if(f == -1|| f>r)
	{
		printf("\n[~] Queue is Empty");
		return;
	}
	else
	{
		printf("\nQueue is: ");
		for(i=f; i<=r; i++)
		{
			printf("%d ", q[i]);
		}
		printf("\n");
	}	
	
}
 
