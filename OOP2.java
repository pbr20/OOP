//////////////////////Polymorphissm////////////////////////
/////////////////////Compile time///////////////////////////
class Student1 {
  String name;
  int id;

  Student1() {

  }

  public void display(String name) {
    System.out.println(name);
  }

  public void display(int id) {
    System.out.println(id);
  }

  public void display(String name, int id) {
    System.out.println(name + " " + id);
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
  }
}
