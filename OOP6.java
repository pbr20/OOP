/////////////////The main idea about abstraction is to hide unnecessary data from user/////////////////////////////////
//or even to hide important core concept of your code from the user
////------------------U cant create an object from abstraction class--------------------////////////////////////////

////////////*****************points********************////////////////
//  1-> Can have abstract or non abstratc method
//  2-> can not be inisiated means u cant create an object from an abstract class
//  3-> can have constructor and static method
//  4-> can have final method which will force the subclass to not change the body of that method
///////////////////////////////////////////////////////////////////////
////////Static and final have been discussed in next file//////////////
//////////////////////////////////////////////////////////////////////

abstract class animal {
  abstract void walk();

  public void eat() {
    System.out.println("this animal eats");
  }

  animal() {
    System.out.println("You created an animal");
  }
}

class horse extends animal {
  public void walk() {
    System.out.println("Walks on four legs");
  }

  horse() {
    System.out.println("You created a horse");
  }
}

class chicken extends animal {
  public void walk() {
    System.out.println("Walks on two legs");
  }

  chicken() {
    System.out.println("You created a chicken");
  }
}

public class OOP6 {
  public static void main(String args[]) {
    horse h1 = new horse();
    h1.walk();
    chicken c1 = new chicken();
    c1.walk();
    c1.eat();
    /////////// u cant create abstraction object since abstraction is for to hide
    /////////// the core concept from users//////////
    // animal a1 = new animal()
    // a1.walk();
  }
}
