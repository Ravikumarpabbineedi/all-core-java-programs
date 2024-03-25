import java.util.*;
class Arrayof2disdiagornot
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int [10][10];
    int i,j,row,col;
    boolean flag=true;

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
	       if(i!=j)
		{
		  if(a[i][j]!=0)
		   {
			flag=false;
			break;
		   }
      	 	}
		else
		  {
		    if(a[i][j]==0)
		     {
			flag=false;
			break;
		     }
		  }
	    }
	}	
		if(flag)
			System.out.println("diagnol matrix");
		else
			System.out.println("not diagnol matrix");
	
    
 }
}