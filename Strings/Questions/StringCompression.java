package Strings.Questions;

public class StringCompression {
  public static void main(String[] args) {
    // String Compression Leetcode
    // Supposestring s = "aaaddff ggfffssa as ddddds" conver t to new string
    // ans = "a3d2f2g2f3s2a2sd5s"
    String s = "aaaddff ggfffssfdssfffsc  cacsasca";
    String newS = "";
    int i = 0, j = 0;
    while (j < s.length()) {
      if (s.charAt(i) == s.charAt(j)) {
        j++;
      } else if (s.charAt(j) == ' ') {
        int k = j - i;
        newS = newS + s.charAt(i) + k;
        i = j;
        while (s.charAt(j) == ' ') {
          j++;
        }
        i = j;
      } else {
        int k = j - i;
        newS = newS + s.charAt(i) + k;
        i = j;
      }

    }
    int k = s.length() - i;
    newS = newS + s.charAt(i) + k;
    System.out.println("String is " + newS);
  }
}
