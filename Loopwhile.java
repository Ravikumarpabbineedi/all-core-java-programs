import java.util.*;
class Loopwhile
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n,digit,temp,rem,count=0;
 System.out.println("enter the n and digit");
 n=sc.nextInt();
 digit=sc.nextInt();

 temp=n;
 while(n>0)
{
  rem=n%10;
 if(rem==digit)
 {
   count++;
 }
  n=n/10;
}

System.out.println(count+" "+temp);
 
/*long first=0,last,digit,result=0,count=0,num,temp;
 System.out.println("enter the number");
 num=sc.nextInt();
 
 temp=num;
 last=num%10;
 
 while(temp>0)
{
  first=temp%10;
  temp=temp/10;
  count++;
}
 digit=count-1;
 result=last;
 result=result*(long)Math.pow(10,digit);
 result=result+num%(long)Math.pow(10,digit);
 result=result-last;
 result=result+first;

System.out.println(result);*/
 }
}