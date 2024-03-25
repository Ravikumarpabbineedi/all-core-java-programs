import java.util.*;
class DuplicatesinString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="abcrhhgerhfgabdsabd";
		String s1="";
		int i,j;

		for(i=0;i<s.length();i++)
		{
			for(j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				break;
			}
			if(i==j)
			s1=s1+s.charAt(i);
		}
			System.out.println("string after the removal of duplicates="+s1);
			//System.out.println(s1);
	}
}