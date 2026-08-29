package MultidimensionalArrays.Basics;

import java.util.ArrayList;

public class ArrayListOfArrayLists {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>(); 
    ArrayList<Integer> a = new ArrayList<>() ;
    ArrayList<Integer> b = new ArrayList<>() ;
    ArrayList<Integer> c = new ArrayList<>() ;
    arr.add(a) ;
    arr.add(b) ;
    arr.add(c) ;
    a.add(6) ; a.add(7) ; a.add(8) ; a.add(9) ;
    b.add(3) ; b.add(4) ; b.add(5) ; b.add(6) ;
c.add(6) ; c.add(7) ; c.add(8) ; c.add(9) ;

    
    System.out.println(arr);
  }
}
