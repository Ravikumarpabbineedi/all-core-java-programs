import java.util.*;
class Arrayof2dupperandlowerdiag
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int [10][10];
    int i,j,row,col;

    System.out.println("enter the orded of array a");
    row=sc.nextInt();
    col=sc.nextInt();

    System.out.println("enter elements of array a");
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
		if(i<j)
		  System.out.print(a[i][j]+" ");
		if(i>j)
		  System.out.print(a[i][j]+" ");
	    }
	}
    
 }
}