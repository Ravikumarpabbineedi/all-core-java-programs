import java.util.*;
class Scannerstudent{
 public static void main(String args[]){
 
 Scanner sc=new Scanner(System.in);

  int rollno;
  String name;
  char gender;
  String branch;
  int semester;
  float marks;

 System.out.println("enter the roll number of student");
 rollno=sc.nextInt();
 
 sc.nextLine();

 System.out.println("enter the student name");
 name=sc.nextLine();
 
 System.out.println("enter the student gender");
 gender=sc.next().charAt(0);

 sc.nextLine();

 System.out.println("enter the student branch");
 branch=sc.nextLine();

 System.out.println("enter the smester");
 semester=sc.nextInt();

 System.out.println("enter the student marks");
 marks=sc.nextFloat();
}
}
  