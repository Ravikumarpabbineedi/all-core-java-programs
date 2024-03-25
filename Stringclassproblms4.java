import java.util.*;
class Stringclassproblms4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s,s1="";
		s=sc.next();
		
		int i;
		for(i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
			System.out.println("it is palindrome string");
		else
			System.out.println("it is not palindrome string");

	}
}