package BinarySearch.Questions;

public class FirstAndLastOccurance {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5 }; // 8 elements target = 3
    int left = 0, right = arr.length - 1, target = 3;
    int foundidx = -1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target) {

        foundidx = mid;
        right = mid - 1;

      } else {
        if (arr[mid] > target) {
          right = mid - 1;
        } else {
          // arr[mid] < target
          left = mid + 1;
        }
      }
    }
    if (foundidx == -1)
      System.out.println("No such element found.");
    else {
      System.out.print("Element " + target + " present at first positon " + foundidx);
      left = 0;
      right = arr.length - 1;
      foundidx = -1;
      while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) {

          foundidx = mid;
          left = mid + 1;

        } else {
        if (arr[mid] > target) {
          right = mid - 1;
        } else {
          // arr[mid] < target
          left = mid + 1;
        }
      }
      }
      System.out.print("Element " + target + " present at last positon " + foundidx);
    }

  }

}
