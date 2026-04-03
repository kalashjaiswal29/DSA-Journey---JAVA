package Arrays.Questions;
import java.util.Scanner;
public class sumOfElements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    System.out.println();
    int[] arr = new int[n] ;
    System.out.print("Enter the elements of the array: ");
    int sum = 0;
    for(int i = 0 ; i < arr.length ; i++){
      arr[i] = sc.nextInt() ;
      sum = sum + arr[i] ; 
    }
    System.out.println("\nSum of elements"+sum);

  }
}
