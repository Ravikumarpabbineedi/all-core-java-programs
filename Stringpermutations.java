import java.util.*;
class Stringpermutations
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		permutations(s);
	}
	static void permutations(String s)
	{
		int n=s.length();
		int f=factorial(n);
		  
		for(int i=0;i<f;i++)
		{
			StringBuffer s1=new StringBuffer(s);
			int temp=i;
			for(int div=n;div>=1;div--)
			{
				int q=temp/div;
				int r=temp%div;
				
			System.out.print(s1.charAt(r));
			s1.deleteCharAt(r);
			temp=q;
			}
			System.out.println();
		}
	}
		
	static int factorial(int n)
	{
		int fact=1;
		if(n==0)
		   return fact;
		else
		{
			for(int i=1;i<=n;i++)
				fact=fact*i;
		}
		   return fact;
	}
		
}
		
		