import java.util.*;
class Stringclassproblms5
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		String s="sathya@4567528";
		
		int sum=0,i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			sum=sum+s.charAt(i)-48;
		}
		System.out.println(sum);
	}
}