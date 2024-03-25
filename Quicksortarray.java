import java.util.*;
class Quicksortarray
{
   static void quicksort(int a[],int lower,int upper)
  {
     int i;
     if(upper>lower)
	{
	  i=split(a,lower,upper);
	  quicksort(a,lower,i-1);
	  quicksort(a,i+1,upper);
	}
  }
  static int split(int a[],int lower,int upper)
   {
      int i,p,q,t;
	p=lower+1;
	q=upper;
	i=a[lower];
	   while(q>=p)
		{
		  while(p<=q && a[p]<=i)
			p++;
		  while(a[q]>i)
		  	q--;
	
		   if(q>p)
		    {
			t=a[p];
			a[p]=a[q];
			a[q]=t;
		    }
		}
	t=a[lower];
	a[lower]=a[q];
	a[q]=t;

	return q;
   }

  public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[20];
	int i,n;

	System.out.println("enter the array size");
	n=sc.nextInt();

	System.out.println("enter the elements of array");
	for(i=0;i<n;i++)
	   a[i]=sc.nextInt();

	quicksort(a,0,n-1);  // calling method

	for(i=0;i<n;i++)
	   System.out.print(a[i]+" ");
 }
}

