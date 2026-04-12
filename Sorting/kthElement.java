public class kthElement {
  public static void main(String[] args) {
    //Finding the kth smallest el, without using sort fn ; use selection sort
      int arr[] = {4,3,2,1,43,23,9,11,123} ;
      int n = arr.length ;
      
      int k = 5 ;
      
      for(int j = 0 ; j < k ; j++){
        int min=1000 , mindx = 0 ;
        for(int i = j ; i < n ; i++){
        if(arr[i] < min){
          mindx = i ;
          min = arr[i] ;
        }
      }
      int temp = arr[j] ;
      arr[j] = arr[mindx] ;
      arr[mindx] = temp ;
      }
      System.out.println(k + "th smallest number is " + arr[k-1]);
    
  }
}
