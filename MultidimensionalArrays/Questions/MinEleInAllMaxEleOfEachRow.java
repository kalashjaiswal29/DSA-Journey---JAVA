package MultidimensionalArrays.Questions;

public class MinEleInAllMaxEleOfEachRow {
  // Find the minimum element from array of all the maximum elements in each row

  public static void main(String[] args) {

    int arr[][] = { { 2, 3, 4, 23, 22 }, { 6, 2, 8, 3, 21 }, { 4, 6, 3, 11, 74 } };
    int minimumOfAll = Integer.MAX_VALUE;
    for (int j = 0; j < arr.length; j++) {
      int maximum = Integer.MIN_VALUE;
      for (int i = 0; i < arr[0].length; i++) {

        maximum = Math.max(maximum, arr[j][i]);

      }
      minimumOfAll = Math.min(minimumOfAll, maximum) ;
    }
    System.out.println("Minimum of all maximum value of each row "+ minimumOfAll);
  }

}
