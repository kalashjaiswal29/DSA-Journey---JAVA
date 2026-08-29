package Recursion.Basics;

public class PrintArrayUsingRecursion {
 public static void main(String[] args) {
  

  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9} ;
  printArr(arr, 0) ;

 }

 public static void printArr(int arr[], int idx){
  if(idx == arr.length) return ;
  System.out.print(arr[idx] + " "); 
  printArr(arr, idx + 1) ;

 }
}
