package Recursion.Basics;

public class FunctionCallingItself {
  public static void main(String[] args) {
    print(10) ;
  }

  public static void print(int n){
    if(n == 0) return ;
    System.out.println("Kalash " + n);
    print(n-1);
  }
}


// in recursion if the the call goes from up to down it also returns to the statements to execute after the calling similar to printing from 1 to n ;