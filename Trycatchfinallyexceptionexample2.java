import java.util.*;
import java.io.*;
class Trycatchfinallyexceptionexample2
{
	public static void main(String args[])
	{
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream ("Desktop:hello.java");
				System.out.println("file opened");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("file does not exist");
		}
		finally
		{
			try
			{
				fis.close();
				System.out.println("resource released");
			}
			catch(IOException ie)
			{
				System.out.println("IO ERROR");
			}
			catch(NullPointerException ne)
			{
				System.out.println("file cannot be closed");
			}
		}
	}
}