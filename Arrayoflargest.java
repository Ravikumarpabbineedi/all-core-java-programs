import java.util.*;
class Arrayoflargest
{
	public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);
       /* int a[]=new int[20];
	int i,n,largest1,largest2;
	System.out.println("enter the size of array a");
	n=sc.nextInt();
	largest1=a[0];
	largest2=0;

	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	for(i=1;i<n;i++)
	{
	   if(a[i]>largest1)
		largest1=a[i];
	}

	for(i=0;i<n;i++)
	     if(a[i]>largest2 && a[i]!=largest1)
		largest2=a[i];
	System.out.println(largest1+"=largest1 of the given array");
	System.out.println(largest2+"=largest2 of the given array");
      }
}*/

 	 int a[]=new int[20];
	int i,n,element,location;
	System.out.println("enter the size of array a");
	n=sc.nextInt();

	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();
	System.out.println("enter the element");
	element=sc.nextInt();

	System.out.println("enter the location");
	location=sc.nextInt();
	

	for(i=n;i>=location;i--)
	   {
   		a[i]=a[i-1];
		a[i-1]=element;
	   }
		n++;
		for(i=0;i<n;i++)
		System.out.println(a[i]+" ");
  } 
}
	
