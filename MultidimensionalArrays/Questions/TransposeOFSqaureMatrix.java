package MultidimensionalArrays.Questions;

public class TransposeOFSqaureMatrix {

  // Changing the column of a sqaure matrix to row and vice-versa
  /**
   * {{1,2,3}, {{1,4,7}
   * {4,5,6}, => {2,5,8}
   * {7,8,9}} {3,6,9}}
   */

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    System.out.println("Original Matrix");
    for (int j = 0; j < arr.length; j++) {
      for (int i = 0; i < arr[j].length; i++) {
        System.out.print(arr[j][i] + " ");
      }
      System.out.println("");
    }
    for (int j = 0; j < arr.length; j++) {
      int temp = 0 ;
      for (int i = j; i < arr[j].length; i++) {
        temp = arr[j][i];
        arr[j][i] = arr[i][j] ;
        arr[i][j] = temp  ;
      }
    }    System.out.println("Transposed Matrix");

    for (int j = 0; j < arr.length; j++) {
      for (int i = 0; i < arr[j].length; i++) {
        System.out.print(arr[j][i] + " ");
      }
      System.out.println("");
    }


  }
}