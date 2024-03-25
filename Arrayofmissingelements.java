import java.util.*;
class Arrayofevenandodd
{
	public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);

        int a[]=new int[10];
        int i,n,min,max,temp;

	System.out.println("enter the size of array a");
	n=sc.nextInt();
        
	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();