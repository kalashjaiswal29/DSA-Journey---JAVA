package Arrays.Basics;
import java.util.Arrays;
public class PassingArraysToMethods {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5} ;
    System.out.println(arr[3]);

    change(arr) ;
    System.out.println(arr[3]);
    int arr1[] = {1,2,3,4,5,6,7,8,9,0} ;
    System.out.println(arr1[3]);
    int x[] = arr1 ;      //Shallow copy
    x[3] = 90 ;
    System.out.println(arr1[3]);
        int arr3[] = {1,2,3,4,5,6,7,8,9,0} ;
    System.out.println(arr3[3]);
    int y[] = Arrays.copyOf(arr1,arr1.length) ;  //Deep Copy
    y[3] = 30 ;
    System.out.println(arr3[3]);
    System.out.println(y[3]);

  } 
  public static void change(int arr[]){
  arr[3] = 90 ;
}
}

