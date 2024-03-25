import java.io.*;
class Buffer{
  public static void main(String args[]) throws IOException{
  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
  int rollno;
  String name;
  char gender;
  String branch;
  int semester;
  float marks;

 System.out.println("enter the roll number of student");
 rollno=Integer.parseInt(br.readLine());
 
 System.out.println("enter the student name");
 name=br.readLine();
 
 System.out.println("enter the student gender");
 gender=(char)br.read();

 br.skip(2);

 System.out.println("enter the student branch");
 branch=br.readLine();

 System.out.println("enter the smester");
 semester=Integer.parseInt(br.readLine());

 System.out.println("enter the student marks");
 marks=Float.parseFloat(br.readLine());
}
}
  