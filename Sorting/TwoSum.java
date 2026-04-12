import java.util.Arrays;

public class TwoSum {
  public static void main(String[] args) {
    //Check 2 sum Traget = 8 ;
    int arr[] = {1,5,3,2,7,3,5,63,-5} ;
    Arrays.sort(arr) ;
    for(int el : arr){
      System.out.print(el + " ");
    }
    int target = 8 ;
    int i = 0 , j = arr.length-1 ;
    int foundFlag = 0 ;
    System.out.println();
    while (i<j) {
      if(arr[i]+arr[j] == target){
        System.out.println("Elements " + arr[i]+ " & "+ arr[j] + " at position " + i + " & "+ j + " gives sum = "+target);
        foundFlag = 1 ;
        break ;
      }else if(arr[i]+arr[j] > target){
        j-- ;
      }
      else if(arr[i]+arr[j] < target){
        i++ ;
      }
    }
    if(foundFlag == 0) System.out.println("No 2 such elements found");


  }
}
