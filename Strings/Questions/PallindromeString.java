package Strings.Questions;

public class PallindromeString {
  public static void main(String[] args) {
    String s = "markkkram" ;

    int i = 0 , j = s.length()-1 ;
    int flag = 0 ;

    while(s.charAt(i) == s.charAt(j) && i <= j){
      i++ ;
      j-- ;

    }
    if(i < j){
      flag = 1 ;
    }

    if(flag == 1){
      System.out.println("not a pallindrome");
    }
    else{
      System.out.println("Is a pallindrome");
    }

  }
}
