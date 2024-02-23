#include<stdio.h>
#define size 10
int front=0, rear=-1, q[size], element, count=0;

void insert()
{
    if(count == size)
    {
        printf("\n[!] Queue overflow");
        return;
    }
    else
    {
        rear = (rear+1)%size;
        printf("\nEnter the element: ");
        scanf("%d", &element);
        q[rear] = element;
        count++;
    }
}
void delete()
{
    if(count == 0)
    {
        printf("\n[!] Queue underflow");
        return;
    }
    else
    {
        int a = q[front];
        front = (front+1)%size;
        printf("\n%d has been deleted.", a);
        count--;
    }
}
void traverse()
{
    int j=front;
    printf("\nElements are: ");
    for(int i=0; i<count; i++)
    {
        printf("%d ", q[j]);
        j = (j+1)%size;
    }
}

void main()
{
    int option;
    while(1)
    {
        printf("\n[1] INSERT \n[2] DELETE \n[3] TRAVERSE \n[4] EXIT");
        printf("\nSELECT AN OPTION: ");
        scanf("%d", &option);
        if(option == 1)
            insert();
        else if(option == 2)
            delete();
        else if(option == 3)
            traverse();
        else if(option == 4)
            break;
        else
            printf("\n[!] Invalid option");
    }
}


