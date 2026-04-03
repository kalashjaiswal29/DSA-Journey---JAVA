import java.util.Scanner;

public class Pattern_TWO {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter hte value of n : ");
    int n = sc.nextInt() ;
    for(int j = 1 ; j <= n ; j++) {
      for(int i = 65 ; i < (65+n) ; i++){
      System.out.print((char)i + " ");
    }
    System.out.println("");
    }
  }
}
