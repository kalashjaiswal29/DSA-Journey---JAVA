package OOps.Questions;

class Fraction {
  int num;
  int den;

  Fraction(int num, int den) {
    this.num = num;
    this.den = den;
  }

  void add(Fraction f) {

    this.num = (num * (f.den) + (f.num) * den);
    this.den = den * (f.den);
    simplify();
  }

  void multiply(Fraction f) {
    this.num = num * (f.num);
    this.den = den * (f.den);
  }

  void simplify() {
    int gcd = hcf(num, den);
    num = num / gcd;
    den = den / gcd;
  }

  void print() {
    System.out.println("Fraction is " + num + "/" + den);
  }

  int hcf(int a, int b) {
    if (a == 0)
      return b;
    else
      return hcf(b % a, a);
  }
}

public class FractionClass {
  public static void main(String[] args) {
    Fraction f1 = new Fraction(5, 9);
    Fraction f2 = new Fraction(2, 3);
    f1.print();
    f2.print();

    System.out.println("After addition");
    f1.add(f2);
    f1.print();
    f2.print();

    System.out.println("After Multiplication");
    f1.multiply(f2);
    f1.print();
    f2.print();
  }
}
