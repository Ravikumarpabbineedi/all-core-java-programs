import java.util.*;
class Pattern
{
  public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
        
	/*int i,n,j;
	System.out.println("enter the number");
   	n=sc.nextInt();

	for(i=1;i<n;i++)
	  {
	     for(j=1;j<=n;j++)
	      System.out.print("*");
	      System.out.println();
	  }*/

//pattern5

         /*int n,i,j;
	 System.out.println("enter the number");
	 n=sc.nextInt();
	for(i=1;i<=n;i++)
	  {
	    for(j=1;j<=n;j++)
	    System.out.print(i);
	    System.out.println();
	  }*/
//pattern6

	/*int n,i,j;
	System.out.println("enter the number");
	n=sc.nextInt();
	for(i=n;i>=1;i--)
	 {
	   for(j=1;j<=n;j++)
		System.out.print(i);
	  	System.out.println();
	}*/
//pattern7

	/*int n,i,j;
	System.out.println("enter the number");
	n=sc.nextInt();
	for(i=n;i>=1;i--)
	{
	  for(j=n;j>=1;j--)
		System.out.print(j);
	  	System.out.println();*/
	}
//pattern8

	int i,j;
	char a=sc.next().charAt(0);
	char b=sc.next().charAt(0);
	for(char i=A;i<=E;i++)
	{
	  for(char j=A;j<=E;j++)
		System.out.print((char)j);
	  	System.out.println();
	}
 }
}