package Strings.Questions;

public class PrintAllSubstrings {

  //Print all the substrings of a string 
  //Eg - avi : [a,av,avi, v,vi, i]

  public static void main(String[] args) {
    
    String name = "Kalash" ;

    for(int i = 0 ; i < name.length() ; i++){
      for(int j = i ; j < name.length() ; j++){

        System.out.print(" " + name.substring(i , j+1));

      }
      System.out.println();
    }

  }
}
