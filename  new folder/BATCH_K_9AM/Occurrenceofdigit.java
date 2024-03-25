import java.util.*;
class Occurrenceofdigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,digit,count=0,temp;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		System.out.println("enter the digit");
		digit=sc.nextInt();


		temp=n;
		while(n>0)
		{
			rem=n%10;
			if(rem==digit)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(digit+"has occurred for"+count+"number of times in the given number"+temp);
	}
}
		