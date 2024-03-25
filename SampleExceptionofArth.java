import java.util.*;
class SampleExceptionofArth
{
	public static void main(String args[])
	{
		//we cant catch more than one same exception in one try block is not allowed//
		try
		{
			int a=9,b=0,c;
			c=a/b;
			System.out.println(c);
			int x=20,y=0,z;
			z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("b should not be zero");
		}
		System.out.println("end of program");
	}
}

