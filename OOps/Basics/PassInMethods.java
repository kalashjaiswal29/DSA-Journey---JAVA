package OOps.Basics;

public class PassInMethods {
  public static class Car {

    int seats;
    String name;
    double length;
    String type;
    int torque;
    void print(){
      System.out.println(seats + " " + name + " " + length + " " + type + " " +  torque);
    }
  }

  public static void main(String[] args) {

    Car c = new Car();
    c.length = 9;
    c.name = "Kia Sonnet";
    c.seats = 4;
    c.torque = 178;
    c.type = "SUV";
    System.out.println("No of seats " + c.seats);
    change(c);
    System.out.println("No of seats " + c.seats);
    c.print() ;
  }

  private static void change(Car x) {
    x.seats = 5;
  }
}
