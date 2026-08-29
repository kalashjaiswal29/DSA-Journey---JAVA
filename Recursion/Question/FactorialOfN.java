package Recursion.Question;

public class FactorialOfN {

  static int factorial = 1 ;
  public static void main(String[] args) {
    
  }

  public static void factorial(int n) {
    
    if(n == 0) return ;
    factorial = factorial * n ;
    factorial(n - 1);

    
  }
}
