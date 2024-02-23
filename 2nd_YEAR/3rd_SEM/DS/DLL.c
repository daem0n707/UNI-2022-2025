//Credit: Kyle Lewis
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
    printf("\nEmployee %s has been inserted into list\n", new->name);

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
    printf("\nEmployee Details:\n");
    while(temp!=NULL)
    {
        printf("ID: %d\nNAME: %s\nBRANCH: %s\nSPECIALIZATION: %s\n\n", temp->id, temp->name, temp->branch, temp->s);
        temp = temp->rlink;
    }
}

void count()
{
    NODE *temp = first;
    if(first == NULL)
    {
        printf("\nList Empty\n");
        return;
    }
    int c=0;
    while(temp!=NULL)
    {
        c += 1;
        temp = temp->rlink;
    }
    printf("\nNodes: %d", c);
}

int main()
{
    while(1)
    {
        int ch;
        printf("\nDOUBLY LINKED LIST OPERATIONS");
        printf("\n[1] Insert Front Function");
        printf("\n[2] Delete Front Function");
        printf("\n[3] Display Function");
        printf("\n[4] Count nodes");
        printf("\n[5] Exit");
        printf("\nEnter your choice : ");
        scanf("%d", &ch);
        switch(ch)
        {
            case 1 : insert_front();
                    break;
            case 2 : delete();
                    break;
            case 3 : display();
                    break;
            case 4 : count();
                    break; 
            case 5 : exit(1);        
            default:
                    printf("\nEnter a valid input\n");
        }
    
    }
}