package Stacks.Basics ;

import java.util.Stack;

public class PushAtBottomRecursion {
  public static void main(String[] args) {
    Stack <Integer> st1 = new Stack<>() ;

    st1.push(5); // Bottom
    st1.push(51);
    st1.push(54);
    st1.push(501);
    st1.push(541);
    st1.push(5456); // top
    System.out.println(st1);
    PushAtBottom(st1, 01);
    System.out.println(st1);
    reverse(st1) ;
    System.out.println(st1);
  }

  public static void reverse(Stack <Integer> st) {
    if(st.size()<=1) return ;
    int top = st.pop() ;
    reverse(st);
    PushAtBottom(st, top);
  
  }

  public static void PushAtBottom(Stack <Integer> st, int el){
    if(st.size()==0){
      st.push(el) ;
      return ;
    }
    int top = st.pop() ;
    PushAtBottom(st, el);
    st.push(top) ;
  }
}
