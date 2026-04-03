package Arrays.Questions;

public class ShiftLeft {
  public static void main(String[] args) {
    int arr[] = { 1, 4, 2, 6, 3, 5, 7, 8 };
    int d = 19 ;
      d = d % arr.length ;
    
    Reverse(arr, 0, d - 1);
    Reverse(arr, d, arr.length - 1);
    Reverse(arr, 0, arr.length - 1);
    for(int i = 0 ; i < arr.length ; i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void Reverse(int arr[], int i , int j) {
    while(i < j){
      int temp = arr[i] ;
      arr[i] = arr[j] ;
      arr[j] = temp ;
      i++  ; 
      j-- ;
    }
  }

}
