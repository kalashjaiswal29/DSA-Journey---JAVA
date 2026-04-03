package Basics;
import java.util.Scanner;

public class InputAreaofCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   // Making a single Scanner object for all inputs
    System.out.println("Enter radius of Circle: ");
    double r = sc.nextDouble() ; // Taking radius as input from user 
    double area = 3.14 * r * r ;
    System.out.println("Area of Circle is: " + area);
  }
}
// % is the modulus operator which gives remainder after division
//if numerator is negative , it is the only condition when % gives negative remainder