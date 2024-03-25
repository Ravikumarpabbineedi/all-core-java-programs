import java.util.*;
class Stringclassproblms
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.next().charAt(0);

		if(!((ch >='A' && ch <='Z') || (ch >='a' && ch <='z') || (ch >='0' && ch <='9')))
			System.out.println("it is special symbol");
		else
			System.out.println("it is not special symbol");
	}
}