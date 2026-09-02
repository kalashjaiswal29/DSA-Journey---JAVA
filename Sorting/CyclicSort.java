public class CyclicSort {
  public static void main(String[] args) {
              // 0 1 2 3 4 5 6 7
    int[] arr = {3,1,2,4,6,5,7,0};
    int i = 0 ;
    while (i < arr.length) {
      if (arr[i] == i) {
        i++ ;
      }
      else{
        int idx = arr[i] ; // arr[i] = 3 
        int temp = arr[idx] ; // arr[idx] = 4 ;
        arr[idx] = arr[i] ;
        arr[i] = temp ;


      }
    }

    for(int el : arr){
      System.out.print(el + " ");
    }

  }
}
