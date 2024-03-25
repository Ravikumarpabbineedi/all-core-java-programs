import java.util.*;
class Ifelseif
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

 /*float ht;
System.out.println("enter the hieght");
ht=sc.nextFloat();

if(ht<150.0f)
    System.out.println("dwarf");
else if(ht>=150.0f && ht<165.0f)
    System.out.println("average height");
else if(ht>=165.0f && ht<180.0f)
    System.out.println("taller person");
else
    System.out.println("abnormal height");*/

/*int x,y;
System.out.println("enter the values of x and y");
x=sc.nextInt();
y=sc.nextInt();

if(x>0 && y>0)
    System.out.println("("+x+","+y+")"+"belongs to first quadrant");
else if(x<0 && y>0)
    System.out.println("("+x+","+y+")"+"belongs to second quadrant");
else if(x<0 && y<0)
    System.out.println("("+x+","+y+")"+"belongs to third quadrant");
else if(x>0 && y<0)
    System.out.println("("+x+","+y+")"+"belongs to fourth quadrant");
else 
    System.out.println("print it is origin");*/

/*int current,previous,units;
float ebill;

System.out.println("enter the values current,previous");
current=sc.nextInt();
previous=sc.nextInt();

units=current-previous;

if(units>=0 && units<100)
       ebill=units*0.8f;
else if(units>=100 && units<200)
       ebill=80+(units-100)*1.2f;
else if(units>=200 && units<300)
       ebill=200+(units-200)*1.5f;
else if
       ebill=350+(units-300)*1.8f;
System.out.println("electricity bill="+ebill);*/

int m1,m2,m3,m4,m5,m6;
float avg;
System.out.println("enter the marks");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
m5=sc.nextInt();
m6=sc.nextInt();

avg=(m1+m2+m3+m4+m5+m6)/6.0f;

if(m1<35||m2<35||m3<35||m4<35||m5<35||m6<35)
   System.out.println("fail");
else if(avg>=35 && avg<50)
   System.out.println("3rd division");
else if(avg>=50 && avg<60)
   System.out.println("2rd division");
else if(avg>=60 && avg<70)
   System.out.println("1rd division");
else if(avg>=70 && avg<=100)
   System.out.println("distinction");
else if(avg>100)
   System.out.println("out of range");
}
}

