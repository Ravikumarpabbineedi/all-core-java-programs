import java.util.*;
class Insertionsortarray
{
  public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[20];
	int i,n,j,p,temp=0;

	System.out.println("enter the array size");
	n=sc.nextInt();

	System.out.println("enter the elements of array");
	for(i=0;i<n;i++)
	   a[i]=sc.nextInt();

	for(i=1;i<n-1;i++)
	  {
	     temp=a[i];
		j=i-1;
	  	   while(j>=0 && a[j]>temp)
			{
			  a[j+1]=a[j];
			   j--;
			}
			a[j+1]=temp;
			for(p=0;p<n;p++)
				System.out.print(a[p]+" ");
				System.out.println();
		}
			
	  }
}

