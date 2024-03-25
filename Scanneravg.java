import java.util.*;
class Scanneravg
{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
  int a,b,c,sum;
  float avg;

 System.out.println("enter the three values of a,b and c");
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();

 sum=a+b+c;

 avg=sum/3.0f;
 System.out.println("sum of three numbers="+sum);
 System.out.println("avg of three numbers="+avg);

 
 /*float radius,area,circumference;
 
 System.out.println("enter the radius");
 
 radius=sc.nextFloat();

 area=3.142f*radius*radius;

 circumference=2*3*radius;

 System.out.println("area of the circle="+area);
 System.out.println("circumference of circle="+circumference);*/
  
 /*int principle_amount,time_period;
 
 float rate_of_interest,SI;
  
 System.out.println("enter the prinicple amount");
 principle_amount=sc.nextInt();
 
 System.out.println("enter the time period");
 time_period=sc.nextInt();

 
 System.out.println("enter the rate of interest");
 rate_of_interest=sc.nextFloat();

 
 SI=(principle_amount*time_period*rate_of_interest/100);

 
 System.out.println("simple interest="+SI); */

 /*float ft,ct;
 System.out.println("enter the ft value");
 ft=sc.nextFloat();
 ct=(ft-32.0f)*5/9;
 System.out.println("celsius temperature="+ct);*/

 /*int a,b;
 
 System.out.println("enter the values of a and b");
 a=sc.nextInt();
 b=sc.nextInt();
 
 System.out.println("print of numbers of a="+a+"value of b="+b);
 
 a=a+b;
 b=a-b;
 a=b-a;
 System.out.println("swapping of numbers of a="+a+"value of b="+b);*/
}
}

 