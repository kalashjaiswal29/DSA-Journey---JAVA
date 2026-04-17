package BinarySearch.Questions;

public class PeakElementInMountainArray {
  // Search for the peak element in mount array where there exist a num arr[i]
  // where .......arr[i-2] <= arr[i-1] <= arr[i] >= arr[i+1] >= arr[i+2],.......
  // time complexity logn using binary search.....
  public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 7, 9, 123, 1234, 4222, 23, 21, 12, 3, -1, -2 };
    int left = 0, right = arr.length - 1, found = -1;
    while (right >= left) {
      int mid = (right + left) / 2;
      if ((arr[mid] > arr[mid + 1]) && (arr[mid] > arr[mid - 1])) { // Add condtion mid>0 and mid <=n-1 for array size
                                                                    // less than 3 as mountain array is not possible for array size less than 3
                                                                    
        System.out.println("Peak element is " + arr[mid] + " at index " + mid);
        found = 0;
        break;
      } else {
        if (arr[mid] < arr[mid + 1]) {
          left = mid + 1;
        } else {
          right = mid;
        }
      }
    }
    if (found == -1)
      System.out.println("No peak element.");
  }
}
