package Arrays.Questions;

import java.util.ArrayList;
import java.util.Collections;

public class AddingOneToArray {
  public static void main(String[] args) {
    int arr[] = {1,2,9,9} ;
    int carry = 1 ;
    int n = arr.length ;
    ArrayList<Integer> arr1 = new ArrayList<>() ;
    for(int i = n-1 ; i >= 0 ; i--){
      if(arr[i]+carry <= 9 ){
        arr1.add(arr[i]+carry) ;
        carry = 0 ;
      }
      else{
        arr1.add(0) ;
        carry = 1 ;
      }
    }
    if(carry == 1) arr1.add(1) ;
    Collections.reverse(arr1) ;
    System.out.println(arr1);

  }
}
