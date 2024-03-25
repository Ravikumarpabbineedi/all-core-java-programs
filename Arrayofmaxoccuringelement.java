import java.util.*;
class Arrayofmaxoccuringelement
{
	public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);

        int a[]=new int[10];
        int i,j,maxcount=0,count=0,maxelement=0,n;

	System.out.println("enter the size of array a");
	n=sc.nextInt();
        
	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	for(i=0;i<n;i++)
	{  count=1;
    		for(j=i+1;j<n;j++)
		{
    			if(a[i]==a[j])
		       {
  			count++;
			}
		}
		if(count>maxcount)
		{
		 maxcount=count;
		maxelement=a[i];
		}
	}
  	System.out.println(maxelement);
 }
}
	