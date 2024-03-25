import java.util.*;
class Highestdigitinstring
{
	public static void main(String args[])
	{
		String s="sthyatech@84569";
		int i,x=0,y=0;
		char ch;

		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch>='0' && ch<='9')
				x=ch-48;
			if(x>y)
			   y=x;
		}
		System.out.println("highest digit of thr string is:"+y);
	}
}