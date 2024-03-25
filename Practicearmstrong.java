import java.util.*;
class Practicearmstrong
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int temp,sum=0,temp1,a,b,rem,n,count=0;
	System.out.println("enter the number");
	 n=sc.nextInt();
	temp=n;
	while(temp>0)
	{
	  temp=temp/10;
	    count++;
	}
	 temp1=n;
	while(temp1>0)
	{
	  rem=temp1%10;
	 b=count;
	   a=1;
	  while(b>0)
	    {
              a=a*rem;
	      count--;
	    }
	  sum=sum+a;
	  temp1=temp1/10;
	}
	 if(n==sum) 
	    System.out.println("it is armstrong");
	else
	    System.out.println("it is not armstrong");
  }
}
