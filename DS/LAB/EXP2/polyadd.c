#include <stdio.h>
struct poly
{
	int coeff;
	int expo;
};
  struct poly p1[10],p2[10],p3[10];
	int readPoly(struct poly[]);
	int addPoly(struct poly[],struct poly[],int,int,struct poly[]);
	void displayPoly(struct poly[], int terms);
	
	int main()
{
	int t1,t2,t3;
	t1=readPoly(p1);
	printf("\n first polynomial:");
	displayPoly(p1,t1);
	t2=readPoly(p2);
	printf("\n second polynomial:");
	displayPoly(p2,t2);
	t3=addPoly(p1,p2,t1,t2,p3);
	printf("\n\n resultant polynomial after addition:");
	displayPoly(p3,t3);
	printf("\n");
	
	return 0;
}

int readPoly(struct poly p[10])
{
	int t1,i;
	printf("\n\nenter the total number of terms in the polynomial:");
	scanf("%d",&t1);
	printf("\n enter the cofeeicient and exponent in descending order\n");
	for(i=0;i<t1;i++)
	{
		printf("enter the coffecient(%d):",i+1);
		scanf("%d",&p[i].coeff);
		printf("enter the exponent(%d):",i+1);
		scanf("%d",&p[i].expo);
	}
	return(t1);
}
int addPoly(struct poly p1[10],struct poly p2[10],int t1,int t2,struct poly p3[10])
{
int i,j,k;
i=0;
j=0;
