import java.util.*;
/*class Arrayofleftrotation
{
	public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);

        int a[]=new int[20];
        int i,n,j,temp,nr;
	System.out.println("enter the size of array a");
	n=sc.nextInt();
        
	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();
 
	System.out.println("enter the number of rotations");
	nr=sc.nextInt();

	for(i=0;i<nr;i++)
	{
		temp=a[0];
		for(j=0;j<n-1;j++)
			a[j]=a[j+1];
			a[n-1]=temp;
	}

   		for(i=0;i<n;i++)
		System.out.print(a[i]+" ");
 }
}*/

 class Arrayofrightrotation
{
	public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);

        int a[]=new int[20];
        int i,n,j,temp,nr;
	System.out.println("enter the size of array a");
	n=sc.nextInt();
        
	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();
 
	System.out.println("enter the number of rotations");
	nr=sc.nextInt();

	for(i=0;i<nr;i++)
	{
		temp=a[n-1];
		for(j=n-1;j>0;j--)
			a[j]=a[j-1];
			a[0]=temp;
	}

   		for(i=0;i<n;i++)
		System.out.print(a[i]+" ");
 }
}


	
        