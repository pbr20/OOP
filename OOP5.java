
// *****To understand better relate with Access Modifier package***** //

///Public - Everyone's invited///
/*Accessible from anywhere:
 ::: same class
 ::: same package
 ::: different package
 ::: subclass or not — doesn’t matter
*/

//Protected – “Package + children”
/*
protected is accessible from:
 *** same class
 *** same package
 *** subclasses (even in different packages)

 xxx can't access in diff package xxx       -->  diff between pub and pro
 
*/

//Default (no modifier) – “Package buddies only”
/*
 *** same class
 *** same package

 xxx diff package xxx
 xxx diff package sub class xxx
*/

//private – “This stays in my room”
/*
Not accessible from:
 xxx other classes
 xxx same package
 xxx subclasses
 xxx other packages
*/

class student {

}

public class OOP5 {
  public static void main(String args[]) {

  }
}
