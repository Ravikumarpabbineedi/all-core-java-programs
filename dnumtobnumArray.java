import java.util.*;
class dnumtobnumArray
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		int i,n,base=1,bnum=0,rem;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array elements");
		for(i=0; i<n; i++)
			a[i]=sc.nextInt();
		for(i=0; i<n; i++)
		{
			bnum=0;
			base=1;
			while(a[i]>0)
			{
				rem=a[i]%2;
				bnum=bnum+rem*base;
				a[i]=a[i]/2;
				base=base*10;
			}
			a[i]=bnum;
		}
		for(i=0; i<n; i++)
		System.out.print(a[i]+" ");
	}
	 
}