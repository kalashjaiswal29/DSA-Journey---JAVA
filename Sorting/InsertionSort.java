public class InsertionSort {
  public static void main(String[] args) {
    int arr[] = {4,2,6,7,43,2,123,8,546,43} ;
    int n = arr.length ;
    for(int i = 0 ; i < n ; i++){
      int j = i ; 
      while(j > 0 && arr[j] < arr[j-1]){
        int temp = arr[j] ;
        arr[j] = arr[j-1] ;
        arr[j-1] = temp ;
        j-- ;
      }
    }
    for(int el : arr){
      System.out.print(el + " ");
    }
  }
}
