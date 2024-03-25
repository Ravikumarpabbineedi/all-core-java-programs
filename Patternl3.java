import java.util.*;
class Patternl3
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);

 /*int i,j,n,k=1,p;
 System.out.print("enter the n value");
 n=sc.nextInt();

 for(i=1;i<=n;i++)
{
  for(j=1;j<=n-i;j++)
       System.out.print(" ");
  for(j=1;j<=i;j++)
       System.out.print(k++);
  for(j=i;j>1;j--)
  {
    p=k-2;
    k=k-1;
   System.out.print(p+"");
  }
     System.out.println("");
}*/


/* int i,j,n;
 System.out.print("enter the n value");
 n=sc.nextInt();

 for(i=1;i<=n;i++)
{
  for(j=1;j<=n-i;j++)
       System.out.print(" ");
  for(j=1;j<=i;j++)
       System.out.print(j);
  for(j=i-1;j>=1;j--)
       System.out.print(j);
   System.out.println(""); 
}*/

 int i,j=0,n;
 System.out.print("enter the n value");
 n=sc.nextInt();

 for(i=1;i<=n;i++)
{
  for(j=1;j<=n-i;j++)
       System.out.print(" ");
  for(j=i;j>=1;j--)
       System.out.print(j);
  for(j=2;j<=i;j++)
       System.out.print(j);
   System.out.println(""); 
}
}
}

 