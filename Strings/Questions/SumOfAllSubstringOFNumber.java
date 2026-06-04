package Strings.Questions;

public class SumOfAllSubstringOFNumber {
  //Given an integer s represented as a string, the task is to get the sum of all possible sub-strings of this string
  //Input: s = "6759"
// Output: 8421
// Explanation:
// Sum = 6 + 7 + 5 + 9 + 67 + 75 + 59 + 675 + 759 + 6759 = 8421
  public static void main(String[] args) {
    String s = "56483" ;
     int sum = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++ ){
                String sNew = s.substring(i, j+1) ;
                int num = Integer.parseInt(sNew) ;
                sum = sum + num ;
            }
        }
      System.out.println("Sum of all substring of the given number is " + sum);
  }
}
