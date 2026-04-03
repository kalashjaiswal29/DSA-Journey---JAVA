package Arrays.Questions;

public class MergeTwoSortedArrays {
  public static void main(String[] args) {
    int arr[] = {1,4,6,8,14} ;
    int arr1[] = {2,4,5,7,13,25} ;
    int arr3[] = new int[arr1.length + arr.length] ;
    int i = 0 , j = 0 , k = 0 ;
    while (i < arr.length && j < arr1.length) {
      if(arr[i] <= arr1[j]){
        arr3[k] = arr[i] ;
        i++ ;
        
      }else{
        arr3[k] = arr1[j] ;
        j++ ;
        
      }
      k++ ;
      
    }
    while(i<arr.length){
        arr3[k] = arr[i] ;
        i++ ;
        k++ ;
      }
      while(j<arr1.length){
        arr3[k] = arr1[j] ;
        j++ ;
        k++ ;
      }
    for(int m = 0 ; m < arr3.length ; m++){
      System.out.print(arr3[m] + " ");
    }
  }
}
