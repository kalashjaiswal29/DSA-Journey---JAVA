

package Strings.Basics;

import java.util.Scanner ;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Your string");
         String str1 = sc.nextLine();
        System.out.println(str1);
        String str = sc.next();   // Doesn't take next input also after first space the words are excluded
        System.out.println(str);
        String Name = "Kalash Jaiswal" ;
        System.out.println(Name);
       
    }
}