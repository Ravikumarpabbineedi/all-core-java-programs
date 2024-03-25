import java.util.*;
class Stringclassproblms1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.next().charAt(0);
	
		if(ch >='a' && ch <='z')
			{
			ch=(char)(ch-32);
			System.out.println(ch);
			}
		   else
			{
			ch=(char)(ch+32);
			System.out.println(ch);
			}
	}
}