#include<stdio.h>
#include<stdlib.h>

struct node{
    int id;
    char name[10], branch[10], s[10];
    struct node *llink;
    struct node *rlink;
};
typedef struct node NODE;
NODE *first = NULL;

void insert_front()
{
    int data;
    NODE *new;
    new = malloc(sizeof(NODE));
    printf("\nEnter employee ID: ");
    scanf("%d", &new->id);
    printf("\nEnter name : ");
    scanf("%s", new->name);
    printf("\nEnter branch: ");
    scanf("%s", new->branch);
    printf("\nEnter specialization: ");
    scanf("%s", new->s);
  
    new->llink = NULL;
    new->rlink  =NULL;
    printf("\nEmployee %s has been inserted into the list\n", new->name);

    if(first == NULL)
    {
        first = new;
        return;
    }
    new->rlink = first;
    first->llink = new;
    first = new;
}

void delete()
{
    if(first == NULL)
    {
        printf("\nList Empty\n");
        return;
    }
    NODE *temp = first;
    printf("\nEmployee %s is deleted from list\n", temp->name);
    first = first->rlink;
    free(temp);
}

void display()
{
    NODE *temp = first;
    if(first == NULL)
    {
        printf("\nList Empty\n");
        return;
    }
    printf("\nList Contents are : \n");
    while(temp!=NULL)
    {
        printf("ID: %d\nNAME: %s\nBRANCH: %s\nSPECIALIZATION: %s\n", temp->id, temp->name, temp->branch, temp->s);
        temp = temp->rlink;
    }
    printf("\n");
}

int main()
{
    while(1)
    {
        int ch;
        printf("\nDOUBLY LINKED LIST OPERATIONS");
        printf("\n1.Insert Front Function\n2.Delete Front Function\n3.Display Function\n4.Exit\nSelect an option: ");
        scanf("%d", &ch);
        switch(ch)
        {
            case 1 : insert_front();
                    break;
            case 2 : delete();
                    break;
            case 3 : display();
                    break;
            case 4 : exit(1);
          
            default :
                    printf("\nEnter a valid input\n");
        }
    
    }
}