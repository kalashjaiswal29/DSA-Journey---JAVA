package OOps.Basics;

class Students {
  private int rno = 33;
  String name;
  double cgpa;

  void print() {
    System.out.println(rno + " " + name + " " + cgpa);
  }

  int getRno() { // getter - Getting the private attributes
    return rno;
  }

  void setRno(int x) { // setter - Setting the private attributes 
    rno = x;
  }

}

public class PrivateKeyword {
  public static void main(String[] args) {
    Students s = new Students();
    s.name = "Kalash";
    s.print(); // accessed rno using print as print is public and rno is private but print is
               // in the same class which made it to access rno
    System.out.println(s.getRno());
    s.setRno(31);
    System.out.println(s.getRno());

  }
}
