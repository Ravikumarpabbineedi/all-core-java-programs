import java.util.*;
class Countofrepeatedchar
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		String s="0abaabcddac@@%%$$!!db";
		int a[]=new int[128];
		
		int i;
		for(i=0;i<s.length();i++)
		{
			a[(int)s.charAt(i)]++;
		}
		for(i=0;i<128;i++)
		{
			if(a[i]!=0)
				System.out.println((char)i+"count is"+a[i]);
		}
	}
}