package BinarySearch.Questions;

public class FloorOfArray {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 7, 8, 23, 34, 454, 3445 };
    int x = 5;
    int left = 0, right = arr.length - 1;
    int mid = 0, found = 0;
    while (left <= right) {
      mid = (left + right) / 2;
      if (x == arr[mid]) {
        System.out.println("The floor for the given no. is " + arr[mid] + " at position " + mid);
        found = 1;
      } else {
        if (arr[mid] > x) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }
    }
    if (found == 0) {
      System.out.println("The floor for the given no. is " + arr[mid - 1] + " at position " + (mid - 1));
    }
  }
}
