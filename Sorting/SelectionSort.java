public class SelectionSort {
  public static void print(int arr[]) {
    for(int el : arr){
      System.out.print(el+" ");
    }
  }
  public static void main(String[] args) {
    int arr[] = {5,3,7,-2,0,1,2} ;
    int n = arr.length ;
    
    for(int j = 0 ; j < n-1 ; j++){
      int min = arr[j] ,indexMin = j;
    for(int i = j ; i < n ; i++){
      
      if(min > arr[i]){
        min = arr[i] ;
        indexMin = i ;
      }
    }
    int temp = arr[j] ;
    arr[j] = arr[indexMin] ;
    arr[indexMin] = temp ;

  }
    print(arr) ;
  }
}
