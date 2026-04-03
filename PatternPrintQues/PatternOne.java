import java.util.Scanner ; 
public class PatternOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter no of rows: " );
    int rows = sc.nextInt() ;
     System.out.println("Enter no of columns: " );
    int columns = sc.nextInt() ;
    for (int j = 1; j <= rows; j++) {
      for (int i = 1; i <= columns; i++) {
        System.out.print("* ");
      }
       System.out.print("\n");
    }
  }
}
