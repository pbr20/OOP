//import bank.Account;
//import bank.Currency;

import bank.*; //instead of importing single by single files 
               //we can import all together if all the files belong to same folder by using .* after folder name
               // Careful * only import all files inside a FOLDER not all folder inside a folder

public class OOP4 {
  public static void main(String args[]) {
    Account account1 = new Account("Rithen", 1001);
    account1.display();
    Currency Currency1 = new Currency(1010, 780000, 67);
    Currency1.display();
  }
}
