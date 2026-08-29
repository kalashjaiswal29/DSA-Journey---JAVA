package Recursion.Question;

import java.util.Scanner;

public class IncreasingThenDecreasing {

  //ques - if n = 5 then print 5 4 3 2 1 1 2 3 4 5 
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;

    int n = sc.nextInt() ;
   print(n) ; 
  }

  public static void print(int n) {
    if(n == 0) return ;

    System.out.print(n + " "); 

    print(n - 1) ;

    System.out.print(n + " ");

  }

}
