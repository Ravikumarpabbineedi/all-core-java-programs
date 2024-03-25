import java.util.*;
class Arrayof2dmaxrowsum
{
  public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[10][10];
	int row,col,i,j,rsum=0,maxrsum=0;
	
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
	   rsum=0;
	  for(j=0;j<col;j++)
	     {
		rsum=rsum+a[i][j];
	     }
		if(rsum>maxrsum)
		  maxrsum=rsum;
	     }
		System.out.println("max sum of rows is="+maxrsum);
	   
 }
}