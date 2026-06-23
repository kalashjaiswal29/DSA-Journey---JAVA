package MultidimensionalArrays.Questions;

public class MatrixPrintInSnakeMethod {
  // Print the given matrix in snake method
  /**
   * Eg Given Matrix = {{1,2,3,4},
   * {5,6,7,8},
   * {9,10,11,12}}
   * Print it like = 1, 2, 3, 4, 8, 7, 6, 5, 9, 10, 11, 12
   * Hint at even row it starts iterating from start and viceversa
   */

  public static void main(String[] args) {

    int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

    for(int j = 0 ; j < arr.length ; j++ ){
      if(j%2 == 0){
        for(int i = 0  ; i < arr[j].length  ; i++){
        System.out.print(arr[j][i] + " ");
      } }
      else{
        for(int i = arr[j].length - 1  ; i >= 0 ; i--){
        System.out.print(arr[j][i] + " ");
      
      }
      
    }

    }

  }

}
