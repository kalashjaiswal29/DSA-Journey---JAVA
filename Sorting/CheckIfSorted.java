public class CheckIfSorted {
  public static void main(String[] args) {
    //Check if the array is sorted in ascending order
    int arr[] = {1,3,4,71,7,9,12,24} ;
    int flag = 0 ;
    for(int i = 0 ; i < arr.length-1 ; i++){
      if(arr[i+1] < arr[i]){
        flag = 1 ;
        break ;
      }
    }
    if(flag == 0) System.out.println("Sorted array");
    else System.out.println("Unsorted array");
  }
}
