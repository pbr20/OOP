package Access_Modifier.package2;

///////Protected Access Specifier/////////
/*
protected is accessible from:
 *** same class
 *** same package
 *** subclasses (even in different packages)

 xxx can't access in diff package xxx       -->  diff between pub and pro
 
 */

public class protected_acc {
  protected String gmail_id;

  protected protected_acc() {

  }

  protected protected_acc(String gmail_id) {
    this.gmail_id = gmail_id;
  }

  protected void display() {
    System.out.println("Gmail: " + this.gmail_id);
  }
}
