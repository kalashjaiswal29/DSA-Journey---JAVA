package Strings.Questions;
import java.util.Scanner ;

//Count the number of digits in a number 

public class CountDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;

    System.out.print("Enter number = ");
    int n = sc.nextInt() ;

    String s = Integer.toString(n) ;
    System.out.println("Number of digits " + s.length());

  }
}
