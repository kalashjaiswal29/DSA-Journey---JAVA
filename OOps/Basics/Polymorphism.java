package OOps.Basics;

public class Polymorphism {
  public static class Lion{
    void speak(){
      System.out.println("GHHHHHHHRRRR");
    }
  }

  public static class Human{
    void speak(){
      System.out.println("HELLO");
    }
  }

  public static class Dog{
    void speak(){
      System.out.println("Bhau Bhau");
    }
  }


  public static void main(String[] args) {
    Human h = new Human() ;
    Dog d = new Dog() ;
    Lion l = new Lion() ;


    h.speak(); 
    d.speak();
    l.speak();
  }
}
