import java.util.*;
class Arrayofprimenumbers
{
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);

        int a[]=new int[20];
	int i,j,n,flag;

	System.out.println("enter the array size");
  	n=sc.nextInt();

	System.out.println("enter the elements of array");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	for(i=0;i<n;i++)
	{     flag=0;
	   for(j=2;j<=a[i]/2;j++)
		{  if(a[i]%j==0)
		   {
			flag=1;
			break;
		   }
		}
		if(flag==0)	
		System.out.print(a[i]+" ");  
	}
   }
}