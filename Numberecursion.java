import java.util.*;
/*class Numberecursion
{
  public static void main(String args[])
{ 
 int n=100;
 numbers(n); // calling method
}

 static int numbers(int n) // called method
{
   if(n>0)
        {
           numbers(n-1);
           System.out.print(n+" ");
         }
}
}*/


// write a java program the sum of n natural numbers using recursion

/* class Sum_of_n
{
  public static void main(String args[])
{
  //Scanner sc=new Scanner(System.in);
  int n=10,result;
 result=sum_of_n(n);// calling method
 System.out.println(result+" ");
}
 static int sum_of_n(int n)// called method
{
  if(n>0)
      return(n+sum_of_n(n-1));
    else
      return n;     
}
}*/


/* write a java program to find the sum of individual digits of a given number using recursion*/

/*class Sumofindividual
{
  public static void main(String args[])
{
  int n=123,result;
 result=Sumofindividual(n);// calling method
 System.out.println(result+" ");
}
 static int sumofindividual(int n)// called method
{
  if(n>0)
       return(n%10 + sumofindividual(n/10));
  else
       return n;
}
}*/

// write a java program the reverse of a given number 

/*class Reverse
{
 public static void main(String args[])
{
  int n=585859;
  Reverse(n);
}
 static void Reverse(int n)
{
   if(n>0)
        {
          System.out.print(n%10);
          Reverse(n/10);
        }
}
}*/


//w.j.prog to find factorial of given number using recursion

/*class Factorial
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   int result,n;
   n=sc.nextInt();  
   result=factorial(n);
  
 System.out.println(result+" ");
}
   static int factorial(int n)
{
  if(n==0)
         return 1;
  else
         return(n*factorial(n-1));
}
}*/


// w.j.prog to find binary to decimal using recursion


/*class Binarytodecimal
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int n,result;
  n=sc.nextInt();
 
  result=binarytodecimal(n);
  
 System.out.println(result+" ");
}

 static int binarytodecimal(int n)
{
    if(n==0)
         return 0;
    else
         return(n%10 + 2*binarytodecimal(n/10));
}
}*/

// w.java. prog to find gcd of the given number in recursion






