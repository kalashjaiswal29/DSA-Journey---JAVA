public class SelectionSortUsingLargestEl {

  public static void print(int arr[]) {
    for (int el : arr) {
      System.out.print(el + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 3, 7, -2, 0, 1, 2 };
    int n = arr.length;

    for (int j = 0; j < n - 1; j++) {
      int max = arr[0],  indexMax = 0;
      for (int i = 0; i < n-j; i++) {

        if (max < arr[i]) {
          max = arr[i];
          indexMax = i;
        }
      }
      int temp = arr[n-j-1];
      arr[n-j-1] = arr[indexMax];
      arr[indexMax] = temp;

    }
    print(arr);
  }
}
