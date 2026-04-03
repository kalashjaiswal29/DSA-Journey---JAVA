package Arrays.Questions;


public class secondLargest {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,54,3,2,34,3,59,56,145,139,53,5,3,2,-9} ;
    int max = Integer.MIN_VALUE ;

    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i] > max){
        max = arr[i] ;
      }
    } 
    System.out.println("Max element " + max );
    int minDiff = Integer.MAX_VALUE , indexSecondMin = 0 ;
    for(int i = 0 ; i < arr.length ; i++){
      if((minDiff > (max - arr[i])) && arr[i] != max ){
        minDiff = (max - arr[i]) ;
        indexSecondMin = i ;
      }
    }
    System.out.println("Second largest number in array is "+ arr[indexSecondMin] +"at " + indexSecondMin +" position." );
  }
}
//second approach find the max element then again in second loop find the max again with if condition that a[i] != max in first loop 