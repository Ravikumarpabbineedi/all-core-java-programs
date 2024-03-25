import java.util.*;
class Tryexceptionexamples
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			String s=args[0];
			System.out.println("input value="+s);

			int a=Integer.parseInt(s);
			System.out.println("converted value ="+a);
		}
		/*catch(ArrayIndexOutOfBoundsException ae)/*if we know what exception will occur we can directly write the exception name in catch block*/
		{
			System.out.println("no input ___failed");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("invalid conversion failed");
		}*/

		catch(Exception e) /*when we didnt know the what exception will occur we can Exception class it will what exception it occured*/
		{	
			System.out.println("error ="+e);
		}
	}
}