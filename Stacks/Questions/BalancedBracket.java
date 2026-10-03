package Stacks.Questions;

import java.util.Stack;

public class BalancedBracket {
  public static void main(String[] args) {
    System.out.println(isBalanced("[{]}"));
  }

  public static boolean isBalanced(String s) {

    Stack<Character> st = new Stack<>();

    if (s.length() % 2 != 0)
      
      return false;
    else if ((s.charAt(0) == ']') && (s.charAt(0) == ')') && (s.charAt(0) == '}')) {
      return false;

    } else {

      int i = 0;
      while (i < s.length()) {
        char ch = s.charAt(i);
        if ((ch == '[') || (ch == '(') || (ch == '{')) {
          st.push(ch);
        } else if ((ch == ']') || (ch == ')') || (ch == '}')) {
          if(st.size() == 0) return false;
          char peek = st.peek();
          if (SameStyle(peek, ch)) {
        
            st.pop();
          } else {
            return false;
          }
        }

        i++;
      }
      return (st.size() == 0) ;
    }

  }

  public static Boolean SameStyle(char ch, char ch1) {
    if (ch == '[' && ch1 == ']')
      return true;
    if (ch == '{' && ch1 == '}')
      return true;
    if (ch == '(' && ch1 == ')')
      return true;
    return false;
  }
}
