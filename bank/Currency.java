package bank;

public class Currency {
  int usd;
  int bdt;
  int euro;

  Currency() {
  }

  public Currency(int usd, int bdt, int euro) {
    this.usd = usd;
    this.bdt = bdt;
    this.euro = euro;
  }

  public void display() {
    System.out.println("/////////////////Currency details////////////////////");
    System.out.println("USD: " + this.usd);
    System.out.println("EURO: " + this.euro);
    System.out.println("BDT: " + this.bdt);
  }
}
