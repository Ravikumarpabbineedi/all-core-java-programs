import java.util.*;
class PredifinedmethodsofArray
{
	public static void main(String args[])
	{
		int a[]=new int[]{2,3,1,7,5,9,11,21,13};
		int b[]=new int[]{2,3,1,7,5,9,11,21,13};
		String c[]=new String[]{"sachin","dhoni","virat","kapil","shehwag"};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	
		Arrays.sort(b,3,6);
		System.out.println(Arrays.toString(b));

		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

		System.out.println(Arrays.binarySearch(a,3));
		
		int d[]=new int[5];
		Arrays.fill(d,6);
		System.out.println(Arrays.toString(d));

		Arrays.fill(d,2,4,3);
		System.out.println(Arrays.toString(d));

		int x[]={1,2,3,4,5,6};
		int y[]={1,2,3,4,5,6};
		System.out.println(Arrays.equals(x,y));

		System.out.println(Arrays.mismatch(x,y));

		int z[]=new int[5];
		System.out.println(Arrays.toString(z));

		System.out.println(Arrays.toString(Arrays.copyOf(z,10)));

		System.out.println(Arrays.toString(Arrays.copyOfRange(z,4,6)));

		int p[]=new int[]{1,2,3,4,5};
		int q[]=new int[]{1,2,3,4,5};

		System.out.println(Arrays.hashCode(p));
		System.out.println(Arrays.hashCode(q));

		
	}
}