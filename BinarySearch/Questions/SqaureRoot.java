package BinarySearch.Questions;
public class SqaureRoot {
  public static void main(String[] args) {
    int x = 25;
    if (x == 0){ 
      System.out.println("Sqaure root is 0");
    }
    int found = 0 ; 
    int low = 1, high = x;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (mid == x / mid){
        System.out.println("Square root is " + mid);
        found = 1 ;
        break ;
      }
      else if (mid > x / mid)
        high = mid - 1;
      else
        low = mid + 1;
    }
    if(found == 0) System.out.println("Sqaure root is "+ high);
    

  }
}
