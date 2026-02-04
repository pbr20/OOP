package Access_Modifier.package2;

//private – “This stays in my room”
/*
Not accessible from:
 xxx other classes
 xxx same package
 xxx subclasses
 xxx other packages
*/

public class private_acc {
  private String pass;

  private_acc() {

  }

  public void display() {
    System.out.println("PASSWORD: " + this.pass);
  }

  public void set_pass(String pass) {
    this.pass = pass;
  }

}
