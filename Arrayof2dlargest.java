import java.util.*;
class Arrayof2dlargest
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int [10][10];
    int i,j,row,col,largest,r=0,c=0;
    largest=a[0][0];

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
	      if(a[i][j]>largest)
		largest=a[i][j];
		r=i;
		c=j;
	   }
	}
		System.out.println("largest of element in 2d array a is="+largest+"found at"+r+","+c);
 }
}