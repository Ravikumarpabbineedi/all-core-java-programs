import java.util.*;
class Arrayof2dsparsematrixornot
{
  public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[10][10];
	int row,col,i,j,count=0;
	
	System.out.println("enter the oredr of array a and b");
	row=sc.nextInt();
	col=sc.nextInt();

	System.out.println("enter the elements of array");
	for(i=0;i<row;i++)
	{
	  for(j=0;j<col;j++)
		a[i][j]=sc.nextInt();
	}	
	for(i=0;i<row;i++)
	{
	  for(j=0;j<col;j++)
	  {
	    if(a[i][j]==0)
	      count++;
	  }
	}
	  if(count>(row*col)/2)
	    System.out.println(" it is sparse matrix");	
	 else
		 System.out.println(" it is not sparse matrix");	
 }
}

	

	