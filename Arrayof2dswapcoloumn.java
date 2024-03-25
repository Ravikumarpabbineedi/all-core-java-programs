import java.util.*;
class Arrayof2dswapcoloumn
{
  public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[10][10];
	int row,col,i,j,n1,n2,temp=0;
	
	System.out.println("enter the oredr of array a and b");
	row=sc.nextInt();
	col=sc.nextInt();

	System.out.println("enter the elements of array");
	for(i=0;i<row;i++)
	{
	  for(j=0;j<col;j++)
		a[i][j]=sc.nextInt();
	}
	
	System.out.println("swap rows n1 and n2");
	n1=sc.nextInt();
	n2=sc.nextInt();
	
	for(i=0;i<row;i++)
	{
	  temp=a[i][n1-1];
	   a[i][n1-1]=a[i][n2-1];
	  a[i][n2-1]=temp;
	}
	for(i=0;i<row;i++)
	{
	 for(j=0;j<col;j++)
	System.out.print(a[i][j]+" ");
	
	 System.out.println(" ");
	}
 }
}

	

	