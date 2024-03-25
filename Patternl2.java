import java.util.*;
class Loopfor
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);

 int i,j,n,c=0;
 System.out.print("enter the n value");
 n=sc.nextInt();

 for(i=0;i<n;i++)
{
  for(j=1;j<n-i;j++)
       System.out.print(" ");
  for(j=0;j<=i;j++)
 {
    if(i==0 || j==0)
          c=1;
    else
       c=c*(i-j+1)/j;
      System.out.print(c+" ");
 }
     System.out.println("");
}
}
}