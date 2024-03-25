import java.util.*;
class Mergesortarray
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	int i,n;
	System.out.println("enter the size of the of the array to sort");
	n=sc.nextInt();

	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	partition(a,0,n-1);  // calling method

	System.out.println("sorted array is:");
	for(i=0;i<n;i++)
	  System.out.println(a[i]+" ");
  }
	static void partition(int a[],int low,int high)
  {
	int mid;
	if(low<high)
	{
	  mid=(low+high)/2;
	  partition(a,low,high);
	  partition(a,mid+1,high);
	  mergesort(a,low,mid,high);
	}
  }
	static void mergesort(int arr[],int left,int mid,int right)
	{
	  int i,j=0,k;
	  int s1=mid-left+1;
	  int s2=right-mid;
	// it will create two temporary arrays	
	  int leftarr[]=new int[s1];
	  int rightarr[]=new int[s2];
	
	// it will copy data from arr to temporary arrays
		for(i=0;i<s1;i++)
		
		  leftarr[j]=arr[mid+1+j];
		
		i=0;j=0;
		k=left;
		while(i<s1 && j<s2)
		{
		  if(leftarr[i]<=rightarr[j])
		   {
		      arr[k]=leftarr[i];
	      	      i++;
		   }
		 else
		  {
		   arr[k]=rightarr[j];
		   j++;
		  }
		k++;
		}
	//copying the items of leftarr[] that have left
		while(i<s1)
		{
		  arr[k]=leftarr[i];
		  i++;
		  k++;
		}
	// copying of items of rightarr[] that have been left
		while(j<s2)
		{
		  arr[k]=rightarr[j];
		  j++;
		  k++;
		}
  }
}