import java.util.*;
class add
{
	public static void main(String args[])
	{
		int a[][]=new int[100][100];
		int b[][]=new int[100][100];
		int c[][]=new int[100][100];
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows and columns");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("enter elements of 1st matrix");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter elements of 2nd matrix");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("the sum of matrix : ");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			
		System.out.println("\n");	
		}
		
	}
}
