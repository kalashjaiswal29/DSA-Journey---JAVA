package BinarySearch.Questions;

public class FloorOfArray {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 7, 8, 23, 34, 454, 3445 };
    int x = 24
    ;
    int left = 0, right = arr.length - 1;
    int mid = 0, found = -1;
    while (left <= right) {
      mid = (left + right) / 2;
      if (arr[mid] > x) {
        right = mid -1 ; 
      } else {
        found = mid ;
        left = mid + 1 ;

      }
    }
      System.out.println("The floor for the given no. is " + arr[found] + " at position " + (found));
  }
}
