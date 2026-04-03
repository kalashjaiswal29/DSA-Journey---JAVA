package IF_Else;
import java.util.Scanner;

//take real no input and check if it was an integer or not 

public class realNoIntegerCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter Real no.");
    double n = sc.nextDouble();
    if ((int)n == n){
      System.out.println("It was an Integer");
    }
    else if (n==3){} //Multiple condition && , || in one if(n==1 && n==2)
    else System.out.println("Your no was really a Real Number");
    // int x = (int)n ;
    // if (n-x > 0) System.out.println("Your no was really a Real Number") ;
    // else  System.out.println("It was an Integer");  galat h

  }
}
// Ternary operator condition ? true : false similar to javascript