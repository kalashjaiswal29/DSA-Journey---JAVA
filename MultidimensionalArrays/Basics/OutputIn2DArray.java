package MultidimensionalArrays.Basics;

public class OutputIn2DArray {
  public static void main(String[] args) {
    // int arr[][] = new int[4][6] ; // Reinitiallized keeps 0 intitial value

    int arr[][] = {{2,4,2,4,1,2}, {3,4,5,1,3,3}, {1,3,1,2,3,1}, {1,5,3,9,7,0}} ;

    for(int j = 0 ; j < arr.length ; j++){
      for(int i = 0 ; i < arr[0].length ; i++){
      System.out.print(arr[j][i] + " ");
    }
    System.out.println();
    }

  }
}
