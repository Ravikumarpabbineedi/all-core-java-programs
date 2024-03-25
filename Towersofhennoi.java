import java.util.*;
class Towersofhennoi
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
     toh(3,1,2,3);
  
}
    static void toh(int n,int a,int b,int c)
           {
               if(n>0)
  		{
	          toh(n-1,a,b,c);
		   System.out.println("move disc from"+a+"to"+c);
			toh(n-1,b,a,c);
	        }
}
}
