package OOps.Basics;

public class Constructor {


  static class Car{

    String name ;
    int price ;
    Car(String x, int y){
      name = x; 
      price = y ;
    }
    Car(){

    }
    void print(){
      System.out.println(name + " " + price);
    }
  }
  public static void main(String[] args) {
    Car c1 = new Car("Kia" , 544) ;
    c1.print();
    Car c2 = new Car() ;
    c2.name = "Creta" ;
    c2.price = 1000 ;
    c2.print();

  }
}
