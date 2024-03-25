import java.util.*;
class Arraytodeleteduplicates
{
	public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);

        int a[]=new int[10];
        int i,j,k,n;

	System.out.println("enter the size of array a");
	n=sc.nextInt();
        
	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	for(i=0;i<n;i++)
	{
	   for(j=i+1;j<n;j++)
		{
		   if(a[i]==a[j])
		  {
			for(k=j;k<n-1;k++)
			   a[k]=a[k+1];
				n--;
				j--;
			}
		}
	}
	for(i=0;i<n;i++)
	System.out.print(a[i]+" ");
 }
}