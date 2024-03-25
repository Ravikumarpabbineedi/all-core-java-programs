import java.util.*;
class AllStringBufferpredmethods
{
	public static void main(String args[])
	{
		StringBuffer  sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("welcome to java technology");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(6));
		System.out.println(sb.length());
		System.out.println(sb.insert(6,"bye"));
		System.out.println(sb.insert(8,'z'));
		System.out.println(sb.delete(5,15));
		System.out.println(sb.deleteCharAt(7));
		//System.out.println(sb.setCharAt(10,'x'));
		sb.setCharAt(10,'x');
		System.out.println(sb);
		System.out.println(sb.reverse());
		StringBuffer sb1=new StringBuffer("happy coding");
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
	}
}