public class BubbleSort {
  public static void print(int arr[]) {
    for(int el : arr){
      System.out.print(el + " ");
    }
  } 
  //Bubble sort - comapring adjacent elemnets in srray and swapping in each pass
  public static void main(String[] args) {
    int arr[] = {1,3,2,12,-4,3,0,1} ;
    int n = arr.length ;
    for(int j = 0 ; j < n-1 ; j++){
      int swap = 0 ;
      for(int i = 0 ; i < n-1-j ; i++ ){
        
        if(arr[i+1] < arr[i]){
          int temp = arr[i] ; 
          arr[i] = arr[i+1] ;
          arr[i+1] = temp ;
          swap++ ; // This Makes the code optimized. Less Time complexity in best case.
        }
        
      }
      if(swap == 0) break ;
    }
    print(arr) ;
  }
}
