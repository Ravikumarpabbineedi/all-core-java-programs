import java.util.*;
import java.io.*;
class ThrowsExample
{
	public static void main(String args[]) throws IOException
	{
		FileWriter fw=new FileWriter("E:sample2.txt");
		fw.write("Welcome to java full stack programme");
		fw.close();
	}
}