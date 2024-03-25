import java.util.*;
class Stringtolowertoupper
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1="";
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				s1=s1+(char)(ch+32);
			else
				s1=s1+(char)(ch-32);
		}
		System.out.println(s1);
	}
}