package Strings.Basics;

public class BuiltInMethods {
  public static void main(String[] args) {
    String name = "Kalash" ;
    String lastName = "Jaiswal" ;
    System.out.println("Index of first occurance of a " + name.indexOf('a'));
    System.out.println("Index of last occurance of a " + name.lastIndexOf('a'));
    System.out.println("All lower case " + name.toLowerCase());
    System.out.println("All upper case " + name.toUpperCase());
    System.out.println("String contains 'al' in continuous " + name.contains("al"));
    System.out.println("Starts with K " + name.startsWith("K"));
    System.out.println("Ends with m " + name.endsWith("m"));
    System.out.println("comapre " + name.compareTo(lastName));

    
    

  }
}
