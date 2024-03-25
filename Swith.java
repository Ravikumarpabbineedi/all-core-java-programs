import java.util.*;
class Swith{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

 /*int a,b,add,sub,mul,div,mod;
 char choice;

 System.out.println("****simple calculator****");
 System.out.println("1:addition");
 System.out.println("2:subtraction");
 System.out.println("3:multiplication");
 System.out.println("4:division");
 System.out.println("5:modulus");

 System.out.println("enter the values of a and b");
 a=sc.nextInt();
 b=sc.nextInt();

 System.out.println("enter the choice");
 choice=sc.next().charAt(0);

 switch(choice)
 {
        case '+' : add=a+b;
                   System.out.println("addition of a and b="+add);
                   break;
        case '-' : sub=a-b;
                   System.out.println("subtraction of a and b="+sub);
                   break;
        case '*' : mul=a*b;
                   System.out.println("multiplication of a and b="+mul);
                   break;
        case '/' : div=a/b;
                   System.out.println("division of a and b="+div);
                   break;
        case '%' : mod=a%b;
                   System.out.println("modulus of a and b="+mod);
                   break;
         default : System.out.println("invalid option");
}*/

 /*char ch; 
 System.out.println("enter the alphabet");
 ch=sc.next().charAt(0);

 switch(ch)
{    
           case 'A' :
           case 'E' :
           case 'I' :
           case 'O' :
           case 'U' :
           case 'a' :
           case 'e' :
           case 'i' :
           case 'o' :
           case 'u' : System.out.println("it is vowel");
                      break;
           default : System.out.println("it is not vowel");
}*/

/* char grade; 
 System.out.println("enter the grade of the student");
 grade=sc.next().charAt(0);

 switch(grade)
{    
           case 'S' :
           case 's' : System.out.println("excellent");
                      break;
           case 'A' :
           case 'a' : System.out.println("good");
                      break;
           case 'B' : 
           case 'b' : System.out.println("average");
                      break;
           case 'C' : 
           case 'c' : System.out.println("poor");
                      break;
           case 'Y' : 
           case 'y' : System.out.println("absent");
                      break;
           case 'F' : 
           case 'f' : System.out.println("fail");
                      break;
           default : System.out.println("invalid");
     } */

 /*float it,ct,ft,kt;
 char choice;
 System.out.println("*****temperature conversion****");
 System.out.println("r:fahrenheit temperature");
 System.out.println("t:celcius temperature");
 System.out.println("y.:kelvin temperature");
 System.out.println("enter the temperature");
 it=sc.nextFloat();
 System.out.println("enter the choice");
 choice=sc.next().charAt(0);
 
 switch(choice)
{
       case 'F' : ft=it;
                  ct=(ft-32.0f)*5/9;
                  kt=ct+273.03f;
                  System.out.println("fahrenhiet temperature="+ft);
                  System.out.println("celsius temperature="+ct);
                  System.out.println("fahrenhiet temperature="+kt);                                  break;
       case 'C' : ct=it;
                  ft=(ct*9)/5+32.0f;
                  kt=ct+273.03f;
                  System.out.println("celsius temperature="+ct);
                  System.out.println("fahrenhiet temperature="+ft);
                  System.out.println("kelvin temperature="+kt);                                      break;
      case 'K' :  kt=it;
                  ct=kt-273.0f;
                  ft=(ct*9)/5+32.0f;
                  System.out.println("kelvin temperature="+kt);
                  System.out.println("celsius temperature="+ct);
                  System.out.println("fahrenhiet temperature="+ft);                                  break;
      default : System.out.println("ivalid");
 }*/ 
 
 float area,radius,length,breadth,side,base,height;
 int fig_code;
 System.out.println("******geometrical shapes******");
 System.out.println("1:area of circle");
 System.out.println("2:area of square");
 System.out.println("3:area of rectangle");
 System.out.println("4:area of triangle");

 System.out.println("enter the figure code");
 fig_code=sc.nextInt();

 switch(fig_code)
{
      case 1: System.out.println("enter the radius");
               radius=sc.nextFloat();
               area=3.142f*radius*radius;
               System.out.println("area of the circle="+area);
               break;
      case 2: System.out.println("enter the side");
               side=sc.nextFloat();
               area=side*side;
               System.out.println("area of the square="+area);
               break;
      case 3: System.out.println("enter the length and breadth ");
               length=sc.nextFloat();
               breadth=sc.nextFloat();
               area=length*breadth;
               System.out.println("area of the rectangle="+area);
               break;
      case 4: System.out.println("enter the base and height");
               base=sc.nextFloat();
               height=sc.nextFloat();
               area=0.5f*base*height;
               System.out.println("area of triangle="+area);
               break;
      default : System.out.println("invalid");
 }          
}
}