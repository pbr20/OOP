package Access_Modifier.package2;

//Default (no modifier) – “Package buddies only”
/*
 *** same class
 *** same package

 xxx diff package xxx
 xxx diff package sub class xxx
*/

public class default_acc {
  String bank_acc_holder_name;

  public default_acc() {

  }

  default_acc(String bn) {
    this.bank_acc_holder_name = bn;
  }

  void display() {
    System.out.println("Bank Account Holder Name: " + this.bank_acc_holder_name);
  }

}
