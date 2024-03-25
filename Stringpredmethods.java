import java.util.*;
class Stringpredmethods
{
	public static void main(String args[])
	{
		String s="welcome to java full stack";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(9));
		String s1=s.concat("infosys");
		System.out.println(s1);
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)	
		{
			System.out.print(ch[i]+" ");
		}	

	
		System.out.println(s.equals(s1));
		String s2="sathya";
		String s3="SATHYA";
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s.length());
		System.out.println(s.replace('e','a'));
		System.out.println(s.substring(0));
		System.out.println(s.substring(2));
		System.out.println(s.indexOf('j'));
		System.out.println(s.lastIndexOf('a'));
		String s4="JAVA WORLD";
		System.out.println(s4.toLowerCase());
		System.out.println(s.toUpperCase());
		String ch1[]=s4.split(" ");
		for(int i=0;i<ch1.length;i++)
			System.out.println(ch1[i]);
		System.out.println(Arrays.toString(ch1));
		String o[]={"ravu","vagag","ahah","Ahjh"};
		System.out.println(o.length);

		String str="Stahbsdvcvdh";
		System.out.println(str.length());
		System.out.println((int)str.charAt(0));

		String s25="";
		String s26="SATHYA";
		System.out.println(s25.isEmpty());
	}
}