package Strings.Basics;

public class StringBuilders {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("Kalash"); // can give capacity also in arguement by default it is 16
    
    System.out.println(s + " " + s.length() + " " + s.capacity());
    s.append(" Jaiswal");
    System.out.println(s);
    s.setCharAt(7, 'j');
    System.out.println(s);
    System.out.println(s.charAt(8));
    ;

    // or
    String name = "Kalash";
    StringBuilder n = new StringBuilder(name) ;
    n.append(" Jaiswal") ;
    System.out.println(name);
    System.out.println(n);

  n.delete(1,4) ;
  System.out.println(n);

    // reversing n
    n.reverse() ;
    System.out.println(n);
  }
}
