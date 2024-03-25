import java.util.*;
class StringprbtoRemovesubstring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="welcome to sathya technology";
		String substr="sathya";
		String str[]=s.split(" ");
		String s1="";
		int i;

		for(i=0;i<str.length;i++)
		{
			if(str[i].equals(substr))
			continue;
			else
				s1=s1+" "+str[i];	
		}
		System.out.println(s1);
	}
}