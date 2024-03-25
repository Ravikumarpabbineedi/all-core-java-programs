import java.util.*;
class Stringarray
{
	public static void main(String args[])
	{
		String a[]={"dhoni","sachin","virat","kapil"};
		String s1;
		//System.out.println(a.length);
		int i,j;
		for(i=0;i<a.length;i++)
		{  s1=a[i];
			for(j=s1.length()-1;j>=0;j--){	
				System.out.print(s1.charAt(j));
			}
			System.out.println();
		}
	}
}