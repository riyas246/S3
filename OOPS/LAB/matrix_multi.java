import java.util.*;
class matrix_multiply
{
  public static void main(String args[])
  {	
      int a[][]=new int[50][50];
	  int b[][]=new int[50][50];
	  int c[][]=new int[50][50];
	  Scanner s= new Scanner(System.in);
	  System.out.println("enter the rows and coumn : ");
  	  int x = s.nextInt();
  	  int y= s.nextInt();
	  System.out.println("enter the elements of matrix 1 : ");
   	  for(int i=0;i<x;i++)
   		  for(int j=0;j<y;j++)
			  a[i][j]=s.nextInt();

  	  System.out.println("enter the elements of matrix 2 : ");
  	  for(int i=0;i<x;i++)
   		for(int j=0;j<y;j++)
			b[i][j]=s.nextInt();

	  
	  for(int i=0;i<x;i++)
  		for(int j=0;j<y;j++)
        	for(int k=0;k<x;k++)
				c[i][j] += a[i][k]*b[k][j];

	  System.out.println("THE MATRIX IS: ");
  	  for(int i=0;i<x;i++)
  	  {
   		for(int j=0;j<y;j++)
   		{
			System.out.print(c[i][j]);
            System.out.print("\t");
   		}
   		System.out.println("\n");
  	  }	
   	  s.close();	
            
   	}
}
