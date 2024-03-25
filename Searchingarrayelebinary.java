import java.util.*;
class Searchingarrayelebinary
{
  public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[20];
	int i,n,ke;

	System.out.println("enter the array size");
	n=sc.nextInt();

	System.out.println("enter the elements of array");
	for(i=0;i<n;i++)
	   a[i]=sc.nextInt();

	System.out.println("enter the key element ke");
	ke=sc.nextInt();

	sort(a,n);  // calling method 1
	   for(i=0;i<n;i++)
        	System.out.print(a[i]+" ");

	binarysearch(a,n,ke);  // calling method 2
  }
   static void sort(int a[],int n)   // called method 1
  {
	int i,j,temp;

	for(i=0;i<n;i++)
	{
	    for(j=i+1;j<n;j++)
		{ if(a[i]>a[j])
		   {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		   }
		}
	}
  }

 static void binarysearch(int a[],int n,int ke)  // called method 2
  {
  	int i,low,high,found=0,mid,pos=0;
	  
		low=0;
		high=n-1;
	   for(i=0;i<n;i++)
	    {
		mid=(low+high)/2;
		if(ke==a[mid])
		  {
		    found=1;
		    pos=mid;
		    break;
		  }
	      else if(ke>a[mid])
		  low=mid+1;
	      else
		   high=high-1;
	    }
	 
	if(found==1)
	 System.out.println("key element found at position="+pos);
	else
	  System.out.println("no such element");
 }
}
