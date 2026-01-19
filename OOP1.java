//////////////////////BASIC////////////////////////////
////////////////Constructor////////////////////////////

class Pen { // if there are no construtor then JAVA will automaticall create a default
            // constructor
  String color;
  String type;

  public void display() {
    System.out.println("Color: " + this.color);
    System.out.println("Type: " + this.type);
  }
}

class Student {
  String name;
  int id;

  Student() { // default constructor

  }

  Student(String name, int id) { // parameterized constructor
    this.name = name;
    this.id = id;
  }

  Student(Student s1) { // copy constructor
    this.name = s1.name;
    this.id = s1.id;
  }

  public void display() {
    System.out.println("Name: " + this.name);
    System.out.println("ID: " + this.id);
  }

}

public class OOP1 {

  public static void main(String args[]) {

    /////////////// pen////////////////
    System.out.println("//////////////Pen/////////////");
    Pen pen1 = new Pen();
    pen1.color = "Black";
    pen1.type = "Gell";
    System.out.println("Pen1 details: ");
    pen1.display();

    ////////////// Student/////////////
    System.out.println("//////////////Student/////////////");
    Student stu1 = new Student("Rithen", 1001);
    Student stu2 = new Student(stu1); // passing obj to another obj this is where you need copy construtor
    System.out.println("Studen1 details: ");
    stu1.display();
    System.out.println("Student2 details:");
    stu2.display();

  }
}