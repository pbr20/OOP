///////////////////////////Array of Class and Loop through Array of Class/////////

class Fruit {
  final String Variant = "Fruit";
  String name;
  String taste;
  double size;

  Fruit() {

  }

  Fruit(String name, String taste, double size) {
    this.name = name;
    this.taste = taste;
    this.size = size;
  }

  public void display() {
    System.out.println("--------------------------------");
    System.out.println("Food varient: " + Variant);
    System.out.println(Variant + " name: " + name);
    System.out.println(name + " taste " + taste);
    System.out.println("Size: " + size + " kg");
  }
}

class Apple extends Fruit {
  Apple() {

  }

  Apple(double size) {
    super("Apple", "Sweet with a slight crisp tang", size);
  }
}

class Mango extends Fruit {
  Mango() {

  }

  Mango(double size) {
    super("Mango", "Sweet and juicy", size);
  }
}

class Guava extends Fruit {
  Guava() {

  }

  Guava(double size) {
    super("Guava", "Sweet with a mild tang", size);
  }
}

class Papaya extends Fruit {
  Papaya() {

  }

  Papaya(double size) {
    super("Papaya", "Mildly sweet and buttery", size);
  }
}

public class OOP9 {
  public static void main(String args[]) {
    Fruit fruits[] = new Fruit[10];
    fruits[0] = new Apple(0.5);
    fruits[1] = new Mango(1.2);
    fruits[2] = new Guava(0.2);
    fruits[3] = new Guava(0.3);
    fruits[4] = new Mango(0.9);
    fruits[5] = new Papaya(1.5);
    fruits[6] = new Apple(0.6);
    fruits[7] = new Papaya(1.2);
    fruits[8] = new Guava(0.1);
    fruits[9] = new Apple(0.9);

    for (Fruit x : fruits) {
      x.display();
    }

    System.out.println("--------------------------------");

    // or this way//
    /*
     * for(int x=0; x<fruits.length; x++){
     * fruits[x].display();
     * }
     */
  }
}
