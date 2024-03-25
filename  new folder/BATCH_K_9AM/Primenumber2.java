import java.util.*;
class Primenumber2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,x=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
			   x=1;
			   break;
			}
		   i++;
		}
		if(x==0)
			System.out.println(n+"is a prime number");
		else
			System.out.println(n+"is not a prime number");
	}
}
		