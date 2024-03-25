import java.util.*;
class Array2
{
	public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);

      /*  int a[]=new int[20];
	int i,n,sum=0;
	System.out.println("enter the size of array a");
	n=sc.nextInt();

	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	for(i=0;i<n;i++)
	sum=sum+a[i];
	System.out.println("sum of array elements="+sum);*/


	int a[]=new int[20];
	int i,n,re,se;
	System.out.println("enter the size of array a");
	n=sc.nextInt();

	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	System.out.println("enter the se");// se=source element
	se=sc.nextInt();

	System.out.println("enter the re");// re=replacing element
	re=sc.nextInt();

	for(i=0;i<n;i++)
         {	if(a[i]==se)
		     a[i]=re;
	 }
	for(i=0;i<n;i++)
	System.out.print(a[i]+" ");
 }
}