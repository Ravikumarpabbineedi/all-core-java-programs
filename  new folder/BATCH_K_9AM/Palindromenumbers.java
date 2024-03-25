import java.util.*;
class Palindromenumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,temp,rem,rev=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();


		for(i=1;i<=n;i++)
		{
			temp=i;
			for(;temp>0;)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(rev==i)
				System.out.print(i+" ");
			rev=0;		
		}
			
	}
}