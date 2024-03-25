import java.util.*;
class Arrayofleaderelement
{
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);

        int a[]=new int[20];
	int i,j,n;

	System.out.println("enter the array size");
  	n=sc.nextInt();

	System.out.println("enter the elements of array");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	for(i=0;i<n;i++)
	{
	   for(j=i+1;j<n;j++)
		{  if(a[i]<a[j])
			break;
		} 
		if(j==n)
		System.out.print(a[i]+" ");
	}
   }
}