package Strings.Questions;

public class ReverseEachWordInString {
  public static void main(String[] args) {
    // Suppose a string is given "kalash is good    boy" then make it "hsalak si doog yob". space reduced to one and each word reversed

    String s = "Kalash IS A goood Boy" ;


    // make it stringBuilder for easy reverse 

    StringBuilder newS = new StringBuilder("") ;

    
    int i = 0 , j = 0 ;

    while (j < s.length()){
      if(s.charAt(j) != ' '){
        j++ ;
      }
      else{
        String ss = "";
        ss = s.substring(i, j) ;
        StringBuilder st = new StringBuilder(ss);
        st.reverse() ;
        
        newS.append(st) ;
        

        while (s.charAt(j) == ' ') {
          j++ ;
        }
        i = j ;
        newS.append(" ") ;

      }

    }
    
    s = newS.toString() ;
    s = s.substring(0, s.length()-1) ;
    System.out.println("new string "+s);


  }
}
