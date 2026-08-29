package MultidimensionalArrays.Questions;

import java.util.ArrayList;

public class PascalsTriangle {
  /**
   * Pascals Tringle n = 5
   * 1
   * 1 1
   * 1 2 1
   * 1 3 3 1
   * 1 4 6 4 1
   */
  public static void main(String[] args) {
    int n = 8;
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    for (int j = 0; j < n; j++) { // Visiting Height
      arr.add(new ArrayList<>()) ;
      for (int i = 0; i <= j; i++) { // Visiting width
        if (i == 0 || i == j) {
          arr.get(j).add(1);
        } else {
          
            arr.get(j).add(arr.get(j - 1).get(i) + arr.get(j - 1).get(i - 1));
          
        }
      }

    }
    System.out.println(arr);
  }
}
