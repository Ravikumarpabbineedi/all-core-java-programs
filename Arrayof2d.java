
import java.util.*;
class Arrayof2d
{
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int a[][]=new int [20][20];
     int i=0,j=0,col,row;
     
	System.out.println("enter the order of matrix a");
	row=sc.nextInt();
	col=sc.nextInt();

	System.out.println("enter the elements of matrix a");
	for(i=0;i<row;i++)
	{
	  for(j=0;j<col;j++)
	   {
	     a[i][j]=sc.nextInt();
	   }
	} 
	for(i=0;i<row;i++)
	{
	  for(j=0;j<col;j++)
	   {
	     System.out.print(a[i][j]+" ");
	   }
	     System.out.println();
	}
  }
}