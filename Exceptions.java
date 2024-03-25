import java.util.*;

class Exceptions
{
	/*void f1()
	{
		System.out.println("HI");
	}*/
	public static void main(String args[])
	{
		//int a=10,b=0,c;
		//c=a/b;
		//System.out.println(c);

		//int a[]=new int[5];
		//a[8]=60;
		//System.out.println(a[8]);

		//int a[]=null;
		//System.out.println(a.length);

		//Exceptions e=null;
		//e.f1();

		//String s="sathya";
		//int a=Integer.parseInt(s);
		//System.out.println(a);

		try
		{
			FileInputStream fis= FileInputStream("D:Array.java");
				System.out.println("File exists");
		}
		catch(FileNotFoundException e)
		{
				System.out.println("file does not exist");
		}
	}
}