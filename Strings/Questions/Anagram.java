package Strings.Questions;

import java.util.Arrays;

public class Anagram {

  //words made from the jumbling the letters of a word

  public static void main(String[] args) {
    String s1 = "race";
    String s2 = "came";
    int flag = 0;

    if (s1.length() != s2.length()) {
      flag = -1;

    } else {
      char[] arr1 = s1.toCharArray();
      char[] arr2 = s2.toCharArray();

      Arrays.sort(arr1);
      Arrays.sort(arr2);

      for (int i = 0; i < s1.length(); i++) {
        if (arr1[i] != arr2[i]) {
          flag = -1;
          break;
        }
      }
    }

    if (flag == 0)
      System.out.println(s1 + " & " + s2 + " are anagrams");
    else {
      System.out.println(s1 + " & " + s2 + " are not anagrams");
    }
  }
}
