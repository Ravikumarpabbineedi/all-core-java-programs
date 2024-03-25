import java.util.*;
class Gcdoftwonumbrsusingrecursion
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int n1,n2,result;
   System.out.println("enter the numbers");
   n1=sc.nextInt();
   n2=sc.nextInt();

   result=gcdoftwonumbrs(n1,n2);
   
   System.out.println("gcd of two numbers="+result);
}
   static int gcdoftwonumbrs(int n1,int n2)
{
     if(n1==0) return n2;
     if(n2==0) return n1;
     if(n1>n2)
	return gcdoftwonumbrs(n1%n2,n2);
     else
 	return gcdoftwonumbrs(n1,n2%n1);
}
}