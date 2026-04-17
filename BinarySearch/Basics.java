package BinarySearch;

public class Basics {
  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 6, 8, 23, 45, 232 }; // 8 elements target = 9
    int left = 0, right = arr.length - 1, target = 232;
    int found = 0 ;
    while (left <= right) {
      int mid = (left + right)/2 ;
        if(arr[mid] == target){
          System.out.println("Element "+ target + " present at positon "+mid);
          found = 1 ;
          break ;
        }else{
          if(arr[mid] > target){
            right = mid - 1 ;
          }
          else{
            //arr[mid] < target
            left = mid + 1 ;
          }
        }
    }if(found == 0) System.out.println("No such element found.");
  }
}
