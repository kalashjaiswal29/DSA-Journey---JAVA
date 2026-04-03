package Basics;

public class Chars {
  public static void main(String[] args) {
    char ch = 'K' ;
    System.out.println("Value of ch is: " + ch);
    char ch2 = 'A' ;
    int x = ch2 ; // implicit type casting from char to int
    System.out.println("Value of ch2 is: " + ch2);
    char ch3 = 'k' ; 
    int y = (int)ch3 ;// explicit type casting 
      System.out.println("Value of ch3 is: " + y);
      char ch4 = 65 ; // implicit type casting from int to char
    System.out.println("Value of ch4 is: " + (int)ch4);
  }
}


//char can store only a single character inside single quotes ' '
//int y = ch3 ; // implicit type casting from char to int
//y = (char)y ;// explicit type casting