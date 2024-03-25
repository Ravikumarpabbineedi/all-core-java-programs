class Test
{
	public static void main(String args[])
	{
	try
	{
	int a;
	int b;
	a=40;
	b=0;
	System.out.println(a/b);
	try
	{
	int sub[]={1,2,3};	
	System.out.println(sub[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)	
	{	
	System.out.println("Array is out of Bounds");
	}
	}
	catch(ArithmeticException ae)	
	{
	System.out.println("Cannot Devide");
	}
	}
}