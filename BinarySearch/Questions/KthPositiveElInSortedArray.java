package BinarySearch.Questions ;

public class KthPositiveElInSortedArray {
  public static void main(String[] args) {
        int arr[] = {1,4,5,32,53,233} ;
        int k = 2 ;    
        // code here
        int low = 0 , high = arr.length-1 ;
        while(low <= high){
            int mid = low + (high - low)/2 ;
            int correctMid = mid + 1 ;
            int missingCount = arr[mid] - correctMid ;
            if(missingCount >= k){
                high = mid - 1 ;
            }else {
                low = mid + 1 ;
            }
        };System.out.println(k + " missing positive el in array is "+ (high+1+k));
  }
}