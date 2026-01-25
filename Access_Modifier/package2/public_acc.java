package Access_Modifier.package2;

///////PUBLIC ACCESS MODIFIWER////////////

///Public - Everyone's invited///
/*Accessible from anywhere:
 ::: same class
 ::: same package
 ::: different package
 ::: subclass or not — doesn’t matter
*/

public class public_acc {
  public String name;
  public int id;

  public_acc() {

  }

  public public_acc(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public void display() {
    System.out.println("name: " + this.name);
    System.out.println("id: " + this.id);
  }
}
