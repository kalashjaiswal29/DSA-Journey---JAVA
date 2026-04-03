package Arrays.Questions;

public class SumOfTwo {
  //Sum of two elements in an array is 6
  public static void main(String[] args) {
    int arr[] = {1,2,3,2,5,3,4,6,0} ;
    for(int i = 1 ; i < arr.length ; i++){
      for(int j = i+1 ; j < arr.length ; j++){
        if((arr[i] + arr[j]) == 6){
          System.out.println("Sum of "+arr[i]+" (at index "+i+") and "+arr[j]+" (at index "+j+") is 6");

        }
      }
    }
  }
}
