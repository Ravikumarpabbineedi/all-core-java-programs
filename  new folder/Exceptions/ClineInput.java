class ClineInput
{
	public static void main(String args[])
	{
	int invalid=0;
	int number,count=0;
	for(int i=0;i<args.length;i++)
	{
	try
	{
	number=Integer.parseInt(args[i]);
	}
	catch(NumberFormatException e)
	{
	System.out.println(e.getMessage());
	invalid=invalid+1;
	System.out.println("Invalid Numbers:"+args[i]);
	continue;
	}
	count=count+1;
	}
	System.out.println("Valid Number is:"+count);
	System.out.println("InValid Numbers is:"+invalid);
	}
}
