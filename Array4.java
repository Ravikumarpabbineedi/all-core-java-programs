import java.util.*;
class Array4
{
	public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[20];
	int i,n,temp=0,p,j;
	System.out.println("enter the size of array a");
	n=sc.nextInt();

	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	for(i=0;i<n;i++)
         {	
		for(j=i+1;j<n;j++)
		  {
		    if(a[i]>a[j])
		     {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		     }
	          }
	}
	for(p=0;p<n;p++)
	System.out.print(a[p]+" ");
	
 }
}