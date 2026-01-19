package bank;

public class Account {
  public String name;
  public int ACC_NO;

  public Account() {
  }

  public Account(String name, int acc_no) {
    this.name = name;
    this.ACC_NO = acc_no;
  }

  public void display() {
    System.out.println("//////////ACCOUNT DETAILS//////////////");
    System.out.println("Account name: " + this.name);
    System.out.println("Account NO: " + this.ACC_NO);
  }
}
