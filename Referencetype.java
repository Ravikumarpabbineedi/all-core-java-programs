import java.io.*;


class First1
{
	void display()
	{
		System.out.println("Hello");
	}
	void print()
	{
		System.out.println("Hi");
	}
}
class Second1 extends First1
{
	void display()
	{
		System.out.println("Bye");
	}
	void show()
	{
		System.out.println("See you");
	}
}
class Referencetype
{
	public static void main(String args[])
	{
		//First1 f=new First1();

		//f.display();
		//f.print();

		//Second1 s=new Second1();

		//s.display();
		//s.show();
		
		//First1 f=(First1)new Second1(); // upcasting
		//f.display();
		//f.print();
		//f.show();

		//Second1 s=(second1)new First1(); // downcasting

		//First1 f=(First1)new Second1();
		//second1 s=new Second1();
		
		//s.display();
		//s.print();
		//s.show();
	}
}