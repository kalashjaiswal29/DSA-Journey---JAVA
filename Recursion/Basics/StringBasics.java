
package Recursion.Basics;

public class StringBasics {
  public static void main(String[] args) {
    String name = "Kalash Jaiswal";
    printString(name);

    String[] nameArr = { "Kalash", "Kritika" };

    printArr(nameArr);

  }

  public static void printString(String s) {
    System.out.println("The string is " + s);
  }

  public static void printArr(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

// Strings are pass by value

// All data types in java are pass by vlaue only but ArrayLists can seem to be
// pass by reference