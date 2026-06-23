package Strings.Questions;

import java.util.Arrays;

public class MostFrequentOccuringChar {

  // letter with max frequency and if frequencies are same give typographically
  // smaller

  public static void main(String[] args) {
    // method 1 brute force using i and j and nested loop 1st check with rest all at righr then
    // 2nd
    // method 2 using sliding window tc = log(n) sc = n
    String s = "Kalash";

    char[] arr = s.toCharArray();

    int maxFreq = -1;
    char maxFreqChar = s.charAt(0);

    Arrays.sort(arr);

    int i = 0, j = 0;

    while (j < s.length()) {
      if (arr[i] == arr[j]) {
        j++;
      } else {
        if (maxFreq < (j - i)) {
          maxFreq = j - i;
          maxFreqChar = arr[i];
        }

        i = j;

      }
    }
    if (maxFreq < (j - i)) {
      maxFreq = j - i;
      maxFreqChar = arr[i];
    }
    System.out.println("maxFreqChar " + maxFreqChar + " maxFreq " + maxFreq);

    // Method 3 using hash like concept storing the cunt in frequency array of fixed
    // size 26 letters tc = n sc = 1
    String s1 = "kalash";

    int[] freq = new int[26];

    for(int k = 0 ; i < s1.length() ; i++){
      freq[s1.charAt(k)-97]++ ;
    }  ;
    int maxFreq1 = 0 ;
    char maxFreqChar1 = s1.charAt(0) ;
    for(int k = 0 ; i < 26 ; i++){
      if(maxFreq < freq[k]){
        maxFreq = freq[k] ; 
        maxFreqChar = (char)(k + 97) ;
      }
    }
    System.out.println("maxFreqChar " + maxFreqChar1 + " maxFreq " + maxFreq1);

  }
}
