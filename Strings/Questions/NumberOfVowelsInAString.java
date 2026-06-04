package Strings.Questions;

public class NumberOfVowelsInAString {
  public static void main(String[] args) {
    String name = "KalKAKJdhkhAKJdhhakjfshdskjhfialjash" ;
    String normalizedString = name.toLowerCase() ;
    int count = 0 ;

    for(int i = 0 ; i < normalizedString.length() ; i++){
      char ch = normalizedString.charAt(i) ;
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
        count++ ;
      }
    }

    System.out.println("Number of vowels in string is "+ count);

  }
}
