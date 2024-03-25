import java.util.*;
class Practise
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n=sc.nextInt();
		int pos=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();

		for(int i=0;i<n;i++)
		{	
			if(a[i]%2==0)
			{
				 pos=i;
				break;
			}
		}
		for(int j=0;j<n;j++)
		{
			if(a[j]%2!=0)
			{
				int fodd=a[j];
				int temp=a[pos];
				a[pos]=a[j];
				a[j]=temp;
				break;
			}
			
		}
		for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
	}
}