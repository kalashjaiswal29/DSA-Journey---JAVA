package MultidimensionalArrays.Questions;

public class RowWithMaxSum {
public static void main(String[] args) {
    int arr[][] = {{1,2,3,4}, {2,4,2,1}, {3,5,3,2}} ;

  int max = Integer.MIN_VALUE , row = -1, total = 0 ; 

  for(int j = 0 ; j < arr.length ; j++){
    for(int i = 0 ; i < arr[0].length ; i++){
     total = total + arr[j][i] ;
  }
  if(total > max ) {
    max = total ;
    row = j ;
  
  }total = 0 ;
  }
  System.out.println("Max sum is "+ max + " of row number " + row );
}


}
