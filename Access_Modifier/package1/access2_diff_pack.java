package Access_Modifier.package1;

import Access_Modifier.package2.default_acc;
import Access_Modifier.package2.protected_acc;
import Access_Modifier.package2.public_acc;

class pro_acc extends protected_acc {

  pro_acc() {
    this.gmail_id = "cabreranikka2006@gmail.com"; // example of protected acc specifer accessable in diff package
                                                  // sub/child class
  }

  void show() { // remember only in child class of diff pack so u can't call without child class
    display();
  }

}

class def_acc extends default_acc {
  /*
   * default_acc(){ //def acc not even accessable from diff package sub class
   * this.ank_acc_holder_name = "R B"
   * }
   */

}

public class access2_diff_pack {
  public static void main(String args[]) {
    public_acc p2 = new public_acc("Nikka", 1002); // example of public acc specifer accessable in diff package
    p2.display();

    // protected_acc pro2 = new protected_acc("rithen1971@gmail.com"); // example of
    // protected acc specifer not accessable in same package
    // pro2.display();

    // default_acc def1 = new default_acc("Rithen Barua"); // example of default acc
    // specifer not accessable in same package
    // def1.display();
    pro_acc pro3 = new pro_acc();
    pro3.show();
  }
}
