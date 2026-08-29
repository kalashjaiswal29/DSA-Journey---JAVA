package Recursion.Question;

import java.util.ArrayList;
import java.util.List;

import Arrays.Basics.ArrayLists;

public class PrintSubsets {
  public static void main(String[] args) {
    String s = "abc" ;
    List<String> list = new ArrayList<>() ;
    subsets(" ", s, 0 , list) ;
    System.err.println(list);


  }

  public static void subsets(String ans, String s, int idx, List<String> list) {
    if(idx == s.length()){
      if(ans.length() != 0) list.add(ans) ;
      return ; 
    }
    char ch = s.charAt(idx) ;
    subsets(ans + ch,s, idx + 1, list) ;
    subsets(ans, s, idx + 1, list) ;

  }
}
