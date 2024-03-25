import java.util.*;
class Nextlargestnumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		int n,nextlargestnumber,temp,rem,digit;
		boolean flag=false;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		System.out.println("enter the digit");
		digit=sc.nextInt();

		nextlargestnumber=n-1;

		while(nextlargestnumber>0)
		{
			temp=nextlargestnumber;
			flag=false;
			while(temp>0)
			{
				rem=temp%10;
				if(rem==digit)
				{
					flag=true;
					break;
				}
			   temp=temp/10;
			}
			if(!flag)
			   break;
			
			nextlargestnumber--;
		}	
		if(nextlargestnumber>0)
			System.out.println(nextlargestnumber);
		else
			System.out.println("no such element exist");
	}
}