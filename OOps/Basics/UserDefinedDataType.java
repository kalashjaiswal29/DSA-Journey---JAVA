package OOps.Basics ;
import java.util.Scanner ;
public class UserDefinedDataType {

  public static class Student{
    String name ;
    int rno ;
    double cgpa ;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;

    Student s1 = new Student() ;
System.out.print("Enter your roll no. ");
    s1.rno = sc.nextInt() ;
    s1.name = "Kalash" ;
    s1.cgpa = 7.5 ;

    System.out.println("Your roll no. is "+ s1.rno+ " name is " + s1.name + " and cgpa is " + s1.cgpa);

  }
}
