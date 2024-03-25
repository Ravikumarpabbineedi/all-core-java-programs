import java.util.*;
import java.io.*;
class Trywithresources
{
	public static void main(String args[]) throws IOException
	{
		try(FileInputStream fis=new FileInputStream("D:Sample.txt"))
		{
			int i;
			while((i=fis.read())!=-1)
				System.out.print((char)i);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println(fe.getMessage());
			/*if(fis != null)
				fis.close();*/
		}
		
	}
}