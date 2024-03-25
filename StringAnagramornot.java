import java.util.*;
class StringAnagramornot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();

		int l1=s1.length();
		int l2=s2.length();
		int flag=0;
		char temp;

		if(l1==l2)
		{
			System.out.println("anagram is possible");
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();

			for(int i=0;i<ch1.length;i++)
			{
				for(int j=i+1;j<ch1.length;j++)
				{
					if(ch1[i]>ch1[j])	
					{
						temp=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp;					
					}
					if(ch2[i]>ch2[j])
					{
						temp=ch2[i];
						ch2[i]=ch2[j];
						ch2[j]=temp;
					}
				}
			}
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i] != ch2[i])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("it is anagram");
			else
				System.out.println("it is not anagram");
		}
		else
			System.out.println("anagram is not possible");
	}
}