import java.util.*;
class Arrayof2dsumofpsumandosum
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int [10][10];
    int i,j,row,col,psum=0,osum=0;

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
	      if(i==j)
		psum=psum+a[i][j];
	      if(a[i][j]==a[i][col-i-1];   //if(i+j==col-1)
		osum=osum+a[i][j];
	   }
	}
		System.out.println("sum of principal diagnal="+psum);
		System.out.println("sum of other diagnal="+osum);
	
 }
}