#include<stdio.h>
void main()
{
int search,n,i,a[100];
printf("enter the size of the array");
scanf("%d",&n);
printf("enter the  array");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
printf("enter the search element");
scanf("%d",&search);
for(i=0;i<n;i++)
{
if(search==a[i])
	
printf("search element is found %d",i+1);
	
if(search==n)
	
printf("search element is not found");
}

}
