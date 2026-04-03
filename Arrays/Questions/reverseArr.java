package Arrays.Questions;

public class reverseArr {
  public static void main(String[] args) {
    int arr[] = {1,2,42,3,233,23,342,4,52} ;
    for(int i = 0 ; i < arr.length ; i++){
    System.out.print(arr[i]+" ");
  }System.out.println("");
    int j = arr.length - 1  , temp = 0;
  for(int i = 0 ; i < (arr.length/2) ; i++){
    temp = arr[i] ;
    arr[i] = arr[j] ;
    arr[j] = temp ;
    j-- ;
  };
  for(int i = 0 ; i < arr.length ; i++){
    System.out.print(arr[i]+" ");
  }
  }
}
