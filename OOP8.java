//////////////////Interface///////////////////
//--An interface is a contract that tells a class what it must do, not how it does it.
//--Its like if u implement this u must provide these methods

interface walkable {
  int eyes = 2; //// by default in interface attributes are public static final

  void walk(); //// by default in interface methods are public static

  void sound();

  // public walkable(){} //in interface u cant build constructor
}

interface harvibore {

  void eat();
}

// ----------------------Points-----------------/////////
// ->>from abstraction class u dont have to use all the methods in derived class
// but from interface u have to usee all the methods in derived class
// -->in java u can't do multiple inheritance but with interface u can do
// multiple inheritance
// -->Can't create an object of an interface
// -->
class horse1 implements walkable, harvibore { // -->> Multiple inheritance
  public void walk() {
    System.out.println("Walks on four legs");
  }

  public void sound() {
    System.out.println("Horse sounds: Heeeyyyyy-aaaaaaahhhhh");
  }

  public void eat() {
    System.out.println("eats plant only!!!");
  }
}

class robot implements walkable {
  public void walk() {
    System.out.println("Walks on wheels");
  }

  public void sound() {
    System.out.println("robot sounds: dee");
  }
}

class information {
  public static void get_Information(walkable obj) { // with this class just by passing any class obj that implements
                                                     // from walkable interface can call all methods
    obj.walk();
    obj.sound(); // here is also example of static method

  }
}

public class OOP8 {
  public static void main(String args[]) {
    horse1 h1 = new horse1();
    robot r1 = new robot();
    information.get_Information(h1); // this is the power of interface
    information.get_Information(r1);
  }

}
