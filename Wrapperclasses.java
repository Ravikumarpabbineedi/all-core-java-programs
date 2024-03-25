import java.util.*;
class Wrapperclasses
{
	public static void main(String args[])
	{
		//primitive type to object type(Boxing)
		int a=123;
		Integer b=Integer.valueOf(a);

		System.out.println(b);

		// object type to primitive type(UnBoxing)
		Byte c=121;
		byte d=c.byteValue();

		System.out.println(d);
		System.out.println(d+123);

		//primitive to String type 
		int e=456;
		String f=Integer.toString(e);

		System.out.println(f);
		System.out.println(f+"abc");

		//String type to priitive type
		String s="1234";
		int x=Integer.parseInt(s);

		System.out.println(x);

		//String type to object type
		String str="3565";
		Short p=Short.valueOf(str);

		System.out.println(p);

		//Object type to String type
		Byte q=127;
		String str1=Integer.toString(q);

		System.out.println(str1);

		//Autoboxing

		int u=678;
		Integer r=u;
		System.out.println(r);

		float v=3.142f;
		Float t=v;
		System.out.println(t);





	}
}