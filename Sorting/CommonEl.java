import java.util.ArrayList;
import java.util.Arrays;

public class CommonEl {
  //Identify comman elements in two arrays and place them in new one in sorted way.
  public static void main(String[] args) {
    int arr[] = {2,3,1,3,-8,56,5} ;
    int arr1[] = {5,3,5,3,674,74,32,1,56} ;
    ArrayList <Integer> arr2 = new ArrayList<>() ;
    Arrays.sort(arr);
    Arrays.sort(arr1);
    int i = 0, j = 0;
    while(i != arr.length && j != arr1.length){
      if(arr[i] == arr1[j]){
        arr2.add(arr[i]) ;
        i++ ;
        j++ ;
      }else if(arr[i]>arr1[j]){
        j++ ;
      }else{
        i++ ;
      }
    }
    System.out.println(arr2);
  }
}
