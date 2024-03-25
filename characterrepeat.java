import java.util.*;
class characterrepeat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="abc3d2ef";
		char ch,ch1;
		int i,j;

		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(i+1<s.length())
			{	ch1=s.charAt(i+1);
				if(ch1>='0' && ch1<='9')
				{ 
					for(j=0;j<ch1-48;j++)
						System.out.print(ch);
					i++;
				}
				else
					System.out.print(ch);
			}
			else
				System.out.print(ch);			 
		}
	}
}