 import java.util.*;
class Looping
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 /*int i,n,sum=0;
 System.out.println("enter the number");
 n=sc.nextInt();
 i=1;
 while(i<=n)
{
 sum=sum+i;
 i++;
}
 System.out.println(sum);*/

 /*int n,i=1,psum=0,nsum=0,num;
 System.out.println("enter the n");
 n=sc.nextInt();
 
 System.out.println("enter the number num");
 num=sc.nextInt();

 while(i<=n)
{
 if(num>0)
  {
      psum=psum+num;
  }
 else
  {
      nsum=nsum+num;
  }
 i++;
} 
 System.out.println("print="+psum);
 System.out.println("print="+nsum);*/

/* int psum=0,nsum=0,n,i=1,num;
 System.out.println("enter the number");
 n=sc.nextInt();

 while(i<=n)
{
 System.out.println("enter the number");
 num=sc.nextInt();
 if(num>0)
   psum=psum+num;
 else if(num<0)
   nsum=nsum+num;
 else
    break;
 i++;
}
 System.out.println(psum+" ");
 System.out.println(nsum+" ");*/

 int n,rem,sum=0;
 System.out.println("enter the number");
 n=sc.nextInt();

 while(n>0 || sum>9)
{
 if(n==0)
 {
   n=sum;
   sum=0;
 }
  rem=n%10;
  sum=sum+rem;
  n=n/10;  
}
 System.out.println("sum of individual digitd="+sum);
 
/*int n,rev=0,rem;
 System.out.println("enter the number n");
 n=sc.nextInt();

 while(n>0)
{
   rem=n%10;
   rev=rev*10+rem;
   n=n/10;
}
    System.out.println("print reverse of the given number="+rev);*/ 

 /*int n,rev=0,rem,temp;
 System.out.println("enter the number n");
 n=sc.nextInt();
 temp=n;

 while(n>0)
{
   rem=n%10;
   rev=rev*10+rem;
   n=n/10;
}
   if(temp==rev)  
    System.out.println("it is palindrome number");  
   else
    System.out.println("it is not palindrome number");*/

 /*int n,rem,sum=0,temp,temp1,count=0,a,b;
 System.out.println("enter the number n");
 n=sc.nextInt();
 temp=n;
 while(temp>0)
{
  temp=temp/10;
  count++;
}
 temp1=n;
 while(temp1>0)
{
    rem=temp1%10;
    a=1;
    b=count;
   while(b>0)
  {
   a=a*rem;
   b--;
  }
  sum=sum+a;
  temp1=temp1/10;
}
 if(n==sum)
    System.out.println("it is a amstrong number");
 else
    System.out.println("it is not a amstrong number");*/

/* int rem,den,num,a,b;
 System.out.println("enter the number");
 a=sc.nextInt();
 b=sc.nextInt();

 if(a>b)
 {
   num=a;
   den=b;
 }
 else
 {
   num=b;
   den=a;
 }
 
 rem=num % den;
 while(rem!=0)
 {
  num=den;
  den=rem;
  rem=num%den;
 }
 System.out.println("GCD of two numbers="+den);*/

 /*int i=1,fact=1,n;
 System.out.println("enter the number");
 n=sc.nextInt();
 
 if(n==0)
    fact=1;
 else
 
  i=1;
   while(i<=n)
 {
   fact=fact*i;
   i++;
 }
   System.out.println("print factorial of given number="+fact);*/

/* int n,i,temp;
 System.out.println("enter the number");
 n=sc.nextInt();
 temp=n;
 
 while(n>=0)
{
 System.out.print(" "+n);
 n--;
}
 i=1;
while(i<=temp)
{
 System.out.print(" "+i);
 i++;
}*/
/* int n,k=0;
 System.out.println("enter the number");
 n=sc.nextInt();
 
 k=k-n;
 n=n+1;
while(k!=n)
{
 System.out.println(Math.abs(k)+" ");
 k++;
}*/

 /*int bnum,dnum=0,rem,base=1;
 System.out.println("enter the binary number");
 bnum=sc.nextInt();
 
 while(bnum>0)
{
 rem=bnum%10;
 dnum=dnum+rem*base;
 bnum=bnum/10;
 base=base*2;
}
 System.out.println("print dnum="+dnum);*/

 /*int bnum=0,dnum,base=1,rem;
 System.out.println("enter the decimal number");
 dnum=sc.nextInt();

 while(dnum>0)
{
 rem=dnum%2;
 bnum=bnum+rem*base;
 dnum=dnum/2;
 base=base*10;
}
 System.out.println("print binary number="+bnum);*/
 }
}



