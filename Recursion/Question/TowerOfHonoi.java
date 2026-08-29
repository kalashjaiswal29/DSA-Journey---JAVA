package Recursion.Question;

public class TowerOfHonoi {
  public static void main(String[] args) {
    honoi(4, 'A', 'B', 'C');
  }

  private static void honoi(int n, char source, char helper, char dest) {

    if (n == 0)
      return;

    // n-1 disks from A to B via C
    honoi(n - 1, source, dest, helper);

    // Largest from A to C
    System.out.println(source + " -> " + dest);

    // Again n - 1 disks from B to C via A
    honoi(n - 1, helper, source, dest);

  }
}
