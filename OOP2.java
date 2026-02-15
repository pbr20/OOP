//////////////////////Polymorphissm////////////////////////
/////////////////////Compile time//////////////////////////
class Student1 {
  String name;
  int id;

  ///////////// OVerloading///////////////

  Student1() {

  }

  Student1(String name, int id) { // constructor overloading
    this.name = name;
    this.id = id;
  }

  public void display(String name) {
    System.out.println(name);
  }

  public void display(int id) { // method overloading
    System.out.println(id);
  }

  public void display(String name, int id) {
    System.out.println(" ---Student--- ");
    System.out.println(name + " " + id);
  }
}

///////////////// Run time//////////////
/////////// Overriding//////////////////

class TA extends Student1 {
  String TA_OF;

  TA(String name, int id, String TA_OF) {
    super(name, id);
    this.TA_OF = TA_OF;
  }

  @Override
  public void display(String name, int id) {
    System.out.println(" ---Teacher Assitant--- "); // overide the parent class method in child class
    System.out.println(name + " " + id);
  }

  @Override
  public void display(String name) {

  }
}

/////////////// calculator with overloading/////////////////

class calculator {

  calculator() {

  }

  public double add(double a, double b) {
    return a + b;
  }

  public double add(double... numbers) { // overloading where u can add any ammount of number here
    double sum = 0;
    for (double num : numbers)
      sum += num;
    return sum;
  }

}

public class OOP2 {
  public static void main(String args[]) {
    Student1 s1 = new Student1();
    s1.name = "Rithen";
    s1.id = 1001;

    s1.display(s1.name);
    s1.display(s1.id);
    s1.display(s1.name, s1.id);

    Student1 TA1 = new TA("Puspak", 1002, "Prof. XYZ");
    TA1.display(TA1.name); // will OVERRIDE
    TA1.display(TA1.name, TA1.id); // Method overriding will happen during run time by JVM -> JAVA VIRTUAL MACHINE

    calculator c1 = new calculator();
    System.out.println(c1.add(2.3, 4, 3, 5, 67, 2, 4, 6, 3, 2, 3, 3.5));
    System.out.println(c1.add(3.5, 5.6));
  }
}
