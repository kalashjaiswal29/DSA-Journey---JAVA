package Arrays.Basics;

import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>() ;
    arr.add(50) ; // arr[i] = 50 ;
    arr.add(40) ;
    arr.add(70) ;
    arr.add(78) ;
    arr.add(54) ;
    arr.add(507) ;
    System.out.println(arr.get(3));
    System.out.println(arr);
    System.out.println(arr.size()); // arr.length ;
    arr.set(4,32) ;// arr[4] = 32 ;
    System.out.println(arr); // used loop in arrays but not here
    // System.out.println(arr*2);  Gives error


  }
}
