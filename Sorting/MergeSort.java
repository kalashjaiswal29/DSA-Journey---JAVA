public class MergeSort {
  public static void main(String[] args) {
    int arr[] = {4,2,5,22,0,43,3,3,5,64} ;
    mergeSort(arr) ;

    for(int i = 0 ; i < arr.length ; i++){
      System.out.println(arr[i] + " ");
    }
  }

  public static void mergeSort(int[] arr) {
    int n = arr.length ;

    int a[] = new int[n/2] ;
    int b[] = new int[n/2] ;
    int idx = 0 ;

    for(int i = 0 ; i < a.length ; i++){
      a[i] = arr[idx++] ;

    }
        for(int i = 0 ; i < b.length ; i++){
      b[i] = arr[idx++] ;
      
    }
mergeSort(a) ;
mergeSort(b) ;
merge(a, b, arr) ;


  }

  public static void merge( int a[], int b[], int c[]){
    int i = 0 , j = 0 , k = 0 ;
    while(i < a.length && j < b.length){
      if(a[i] < b[j]) c[k++] = a[i++] ;
      else c[k++] = b[j++] ;

    }
    while (j < a.length) {
      c[k++] = a[i++] ;
    }
    while (j < b.length) {
      c[k++] = b[j++]
    }
  }

}
