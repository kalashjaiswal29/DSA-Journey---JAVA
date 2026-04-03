package IF_Else;
import java.util.Scanner;

public class firstIf_else {
public static void main(String[] args) {
  Scanner sb = new Scanner(System.in) ;
  System.out.println("Enter a Number");
  int a = sb.nextInt() ;
  if (a % 2 == 0) {
    System.out.println("Your entered no. is even");
  }
  else {
    System.out.println("Your no is odd");
  }
}
}
