import java.util.*;
class Arrayof2dmultyoftwoarrays
{
  public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[10][10];
	int b[][]=new int[10][10];
	int c[][]=new int[10][10];
	int r1,r2,c1,c2,i,j,k;
	
	System.out.println("enter the oredr of array a and b");
	r1=sc.nextInt();
	c1=sc.nextInt();
	r2=sc.nextInt();
	c2=sc.nextInt();

	System.out.println("enter the elements of array");
	for(i=0;i<r1;i++)
	{
	  for(j=0;j<c1;j++)
		a[i][j]=sc.nextInt();
	}	
	System.out.println("enter the elements of array");
	for(i=0;i<r2;i++)
	{
	  for(j=0;j<c2;j++)
		b[i][j]=sc.nextInt();
	}
	if(c1==r2)	
	{
	  for(i=0;i<r1;i++)
	  {
	    for(j=0;j<c2;j++)
	     {
		c[i][j]=0;
	        for(k=0;k<r2;k++)
		{ 
		  c[i][j]=c[i][j]+a[i][k]*b[k][j];
		}
		System.out.print(c[i][j]+" ");
	     }
		System.out.println();
	  }
        }
	else
	   System.out.println("matrix multiplication is not possible");
 }
}