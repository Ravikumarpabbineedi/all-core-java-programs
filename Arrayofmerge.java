import java.util.*;
class Arrayofmerge
{
	public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);

        int a[]=new int[10];
	int b[]=new int[10];
	int c[]=new int[10];
	int i,n,j,result;
	System.out.println("enter the size of array a");
	n=sc.nextInt();

	System.out.println("enter the size of array b");
	n=sc.nextInt();
        
	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	b[i]=sc.nextInt();

	for(i=0;i<n;i++)
	    c[i]=a[i];
		j=i;
	  for(i=0;i<n;i++)
	    {
		 c[j]=b[i];
		j++;
	 }
	  for(i=0;i<j;i++)
		System.out.print(c[i]+" ");
 }
}