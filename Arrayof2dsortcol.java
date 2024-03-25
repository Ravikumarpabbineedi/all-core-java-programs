import java.util.*;
class Arrayof2dsortcol
{
  public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[10][10];
	int row,col,i,j,k,temp=0;
	
	System.out.println("enter the oredr of array a and b");
	row=sc.nextInt();
	col=sc.nextInt();

	System.out.println("enter the elements of array");
	for(i=0;i<row;i++)
	{
	  for(j=0;j<col;j++)
		a[i][j]=sc.nextInt();
	}	
	for(j=0;j<col;j++)
	{
	  for(i=0;i<row;i++)
	  {
	    for(k=i+1;k<row;k++)
	     {
	        if(a[i][j]>a[k][j])
		   {
			temp=a[i][j];
			a[i][j]=a[k][j];
			a[k][j]=temp;
		   }
	     }
	  }
	}
		for(i=0;i<row;i++)
		{
		  for(j=0;j<col;j++)
		System.out.print(a [i][j]+" ");,
		System.out.println(" ");
		}
		 
			
 }
}

	

	