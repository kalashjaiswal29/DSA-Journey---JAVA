package Arrays.Questions;
import java.util.Scanner;
public class takeInput_printPositive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    System.out.println();
    int[] arr = new int[n] ;
    System.out.print("Enter the elements of the array: ");
    for(int i = 0 ; i < arr.length ; i++){
      arr[i] = sc.nextInt() ;
    }
    System.out.println("Positive elements are: ");
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i] > 0){
        System.out.print(arr[i]+" ");
      }
    }

  }
}
