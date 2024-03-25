import java.util.*;
class Deletespacebtwstrings
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="  welcome to      sathya   technology";
		String s1="";
		char ch;
		int i;

		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
			    s1=s1+ch;
			else
			{
			  if(s.charAt(i+1)!=' ')
				s1=s1+ch;
			}
		}
		System.out.println(s1);
	}
}