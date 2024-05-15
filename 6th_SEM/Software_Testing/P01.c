#include<stdio.h>
void main()
{
	int a, b, c;
	char isTriangle;
	printf("Enter the sides: ");
	scanf("%d %d %d", &a, &b, &c);
	if(a<b+c && b<a+c && c<a+b)
		isTriangle = 'y';
	else 
		isTriangle = 'n';
		
	if(isTriangle=='y')
	{
		if((a==b) && (b==c))
			printf("Equilateral Triangle\n");
		else if((a!=b) && (a!=c) && (b!=c))
			printf("Scalene Triangle\n");
		else
			printf("Isoceles Triangle\n");
	}
	else
		printf("Not a triangle\n");
}
