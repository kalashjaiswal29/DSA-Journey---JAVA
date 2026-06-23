package MultidimensionalArrays.Basics;

import java.util.Scanner;

public class InputIn2DArray {

  public static void main(String[] args) {
    int arr[][] = new int[4][6] ; // Reinitiallized keeps 0 intitial value

    Scanner sc = new Scanner(System.in) ;

    for (int j = 0; j < arr.length; j++) {
      for (int i = 0; i < arr[0].length; i++) {

        System.out.print( "Enter array in " + j + "th row and "+ i + "th column ");
        arr[j][i] = sc.nextInt() ;
        System.out.println();
      }
      
    }

    for (int j = 0; j < arr.length; j++) {
      for (int i = 0; i < arr[0].length; i++) {
        System.out.print(arr[j][i] + " ");
      }
      System.out.println();
    }

  }

}
