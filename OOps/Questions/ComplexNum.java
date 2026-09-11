package OOps.Questions;

class ComplexNumClass {
  // z1 = x + iy ;
  int x;
  int y;

  // Default constructor
  ComplexNumClass() {
  }

  ComplexNumClass(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void add(ComplexNumClass z) {
    this.x = x + z.x;
    this.y = y + z.y;
  }

  void multiply(ComplexNumClass z){
    //(a + bi) * (c + di) = (ac - bd) + (ad + bc)i

    int a = (x*(z.x) - (y*(z.y))) ;
    int b = (x*(z.y) + (y*(z.x))) ;


    //If we store directly in this.x and this.y then x is already overwritten while claculating this.x and it gives the updated value of x while calculating y 
    this.x = a ;
    this.y = b ;

  }

  void print() {
    if (y >= 0) {
      System.out.println("The complex number is " + x + " + " + y + "i");
    } else
      System.out.println("The complex number is " + x + " - " + (-y) + "i");
  }

}

public class ComplexNum {

  public static void main(String[] args) {
    ComplexNumClass z1 = new ComplexNumClass(5, 3);
    ComplexNumClass z2 = new ComplexNumClass(5, -3);
    z1.print();
    z2.print();

    System.out.println("After adding");
    //Add
    // z1.add(z2);
    // z1.print();
    // z2.print();

    System.out.println("After Multiplying");
    //Multiply
    z1.multiply(z2);
    z1.print();
    z2.print();



  }

}