#include<stdio.h>

int tower(int n, char src, char temp, char dest)
{
	if(n==1)
	{
		printf("Move disk from %c to %c\n", src, dest);
		return n;
	}
	tower(n-1, src, dest, temp);
    	tower(1, src, temp, dest);
	tower(n-1, temp, src, dest);
}

void main()
{
	int n;
	printf("Enter number of disks: ");
	scanf("%d", &n);
	tower(n, 'A', 'B', 'C');
}
