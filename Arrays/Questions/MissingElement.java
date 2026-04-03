package Arrays.Questions;
//there is an array of size n and contains element like 1,2,3.... to n+1 ,find the missing number
public class MissingElement {
  public static void main(String[] args) {
    int arr[] = {1,2,4,5} ;
    int sum1 = 0 , sum2 = 0 ;
    for(int i = 1 ; i <= (arr.length +1) ; i++){
      sum1 = sum1 + i ;
    }
    for(int i = 0 ; i < (arr.length) ; i++){
      sum2 = sum2 + arr[i] ;
    }
    System.out.println("hence the number is "+(sum1 - sum2));
  }
}
