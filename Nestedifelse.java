import java.util.*;

class Nestedifelse{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
/*int a,b,c;
System.out.println("enter the a,b and c");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if(a>b)
{
 if(a>c)
      System.out.println(a+"= is largest");
 else
      System.out.println(c+"= is largest");
}
else
{
 if(b>c)
       System.out.println(b+"= is largest");
 else
       System.out.println(c+"= is largest");
}

int a,b,c,d;
System.out.println("enter the a,b,c and d");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();

if(a>b)
{
     if(a>c)
     {
          if(a>d)
           System.out.println(a+"= is largest");
          else
           System.out.println(d+"= is largest");
     }
     else
     {
          if(c>d)
           System.out.println(c+"= is largest");
          else
           System.out.println(d+"= is largest");
     }
 }
 else
 { 
          if(b>c)    
    {
          if(b>d)
            System.out.println(b+"= is largest");
          else
            System.out.println(d+"= is largest");
    }
          else
    {
         if(c>d)
            System.out.println(c+"= is largest");
         else
            System.out.println(d+"= is largest");
    }
}*/

/*int n,rem;
System.out.println("enter the number");
n=sc.nextInt();
rem=n%5;
if(rem==0) 
   System.out.println("print the number is divisible by 5="+n);
else
{
       if(rem>2)
            System.out.println(n-rem+5);
       else
            System.out.println(n-rem);*
}*/

String str="ravikumar143@.com";
String pw="Ravikumar@143";

String s,pwd;

System.out.println("enter the s and pwd characters");
s=sc.nextLine();
pwd=sc.nextLine();

if(str.equals(s))
{
    if(pwd.equals(pw))
        System.out.println("login successful");
    else
    System.out.println("login failed invalid pasword");
}
else
{
    System.out.println("logine failed invalid username");
}
}
}