import java.util.*;
class Trycatchfinallyexceptionexamples
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		try
		{
			int a[]={10,20,30,40,50};
			int i;
			for(i=0;i<=a.length;i++)
				System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exceeding the limit of array");
		}
		finally
		{
			System.out.println("finally block");
		}
	}
}