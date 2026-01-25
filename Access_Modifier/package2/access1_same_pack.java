package Access_Modifier.package2;

public class access1_same_pack {
  public static void main(String args[]) {
    public_acc p1 = new public_acc("Rithen", 1001); // example of public acc specifer accessable in same package
    p1.display();

    protected_acc pro1 = new protected_acc("rithen1971@gmail.com"); // example of protected acc specifer accessable in
                                                                    // same package
    pro1.display();

    default_acc def1 = new default_acc("Rithen Barua"); // example of default acc specifer accessable in same package
    def1.display();

    private_acc pri1 = new private_acc(); // example of private acc specifer only accessable in same package with set get 
    pri1.set_pass("pbr_1649");      //not accessable without set get
    pri1.display();
  }
}
