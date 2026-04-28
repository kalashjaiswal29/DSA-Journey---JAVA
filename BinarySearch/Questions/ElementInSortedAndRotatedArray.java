package BinarySearch.Questions;
//Given an array arr[] of distinct elements, which was initially sorted in ascending order but then rotated at some unknown pivot, the task is to find the index of a target key.  If the key is not present in the array, return -1.
public class ElementInSortedAndRotatedArray {
  public static void main(String[] args) {
    int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
    int key = 97 ;
    int keyPos = -1 ;
        // code here
        int low = 0 , high = arr.length - 1 ; 
        while(low <= high){
            int mid = low + (high - low)/2 ;
            if(arr[mid] == key){
                keyPos = mid ;
                System.out.println("The postion of the key constant is : "+ mid);
                break ;
            }
            else if(arr[low] <= arr[mid]){
                if(arr[low] <= key && key < arr[mid]){
                    high = mid - 1 ;
                }else{
                    low = mid + 1 ;
                }; 
            }else {
                if(arr[mid] < key && key <= arr[high]){
                    low = mid + 1 ;
                }else {
                    high = mid - 1 ;
                }
            }
        }if(keyPos == -1) System.out.println("No such element found");
    }
}
