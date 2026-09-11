package OOps.Basics;

class Pokemon {
  private int power;
  String type;

  Pokemon(String type, int power) {
    this.power = power;
    this.type = type;

  }

  Pokemon() {

  }

  int getPower() {
    return power;
  }

  void print() {
    System.out.println("Power is " + power + " and type of pokemon is " + type);
  }

}


//Child/sub/derived class - can access all properties of parent also 
class LegendryPokemon extends Pokemon {
  String ability ; // only for child

}

class GodPokemon extends LegendryPokemon{
  char tag ;

}

public class Inheritance {
  public static void main(String[] args) {
    Pokemon p = new Pokemon("Lund", 350) ;
    p.print();
    LegendryPokemon p1 = new LegendryPokemon() ;

    p1.print();;
    GodPokemon g1 = new GodPokemon() ;
    g1.ability = "Fly" ; //g1 can access properties of all it's parents and grandParents ...
  }
}
