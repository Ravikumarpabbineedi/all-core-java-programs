import java.util.*;
class Primenumber4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,flag=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		if(n==2)
			System.out.println(n+"is a prime number");
		else
		{
		i=2;
		do
		{
			if(n%i==0 && n!=2)
			{
				flag=1;
				break;
			}
			i++;
		}while(i<n/2);
		
		if(flag==0)
			System.out.println(n+"is a prime number");
		else
			System.out.println(n+"is not a prime number");
		}
	}
}
		