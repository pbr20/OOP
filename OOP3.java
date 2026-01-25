///////////////////////////Inheitance//////////////////////
///////////////////////////4 tyes//////////////////////////

///////////////////////Single level////////////////////////
///////////////////////////////////
//             ___               //
//            |___|              //
//              |                //
//              |                //
//             ___               //
//            |___|              //
//                               //
///////////////////////////////////
class shape {
  String color;

  shape() {
  }

  shape(String color) {
    this.color = color;
  }

  public void display() {
    System.out.println(this.color);
  }
}

class Square extends shape {
  int side;

  Square() {
  }

  Square(String color, int side) {
    this.color = color;
    this.side = side;
  }

  public void display() {
    System.out.println("color: " + this.color);
    System.out.println("Area: " + side * side);
  }
}

//////////////////// Multi-level////////////////
//             ___                            //
//            |___|                           //
//              |                             //
//              |                             //
//             ___                            //
//            |___|                           //
//              |                             //
//              |                             //
//             ___                            //
//            |___|                           //
//                                            //
////////////////////////////////////////////////

class Rectangle extends Square { // shape->Square->Rectangle
  int side2; // Multi-level

  Rectangle() {
  }

  Rectangle(String color, int side, int side2) {
    this.color = color;
    this.side = side;
    this.side2 = side2;
  }

  public void display() {
    System.out.println("Color: " + this.color);
    System.out.println("Area: " + this.side * this.side2);
  }
}

//////////////////Hierarchical//////////////////
//                 ___                        //
//                |___|                       //
//                  |                         //
//               ___|____                     //
//              |       |                     //
//              |       |                     //
//             ___     ____                   //
//            |___|    |___|                  //
//                                            //
////////////////////////////////////////////////

class Triangle extends shape{  //shape->Square  && shape->Triangle
  int height;                  //Hierarchical
  int base;

  Triangle(){}
  Triangle(String color, int height, int base){
    this.color = color;
    this.height = height;
    this.base = base;
  }
  public void display(){
    System.out.println("Color: "+this.color);
    System.out.println("Area: "+this.height*this.base*0.5f);
  }
}

//////////////////Hierarchical//////////////////
//                 ___                        //
//                |___|                       //
//                  |                         //
//               ___|____                     //
//              |       |                     //
//              |       |                     //
//             ___     ____                   //
//            |___|    |___|                  //
//              |                             //
//              |                             //
//             ___                            //
//            |___|                           //
//                                            //
//////////////////////////////////////////////// 

//shape -> Triangle && shape -> Square -> Rectangle

public class OOP3 {
  public static void main(String args[]) {
    /////////////// SHAPE/////////////////////////////
    System.out.println("///////////Shape///////////");
    shape s1 = new shape("red");
    s1.display();

    /////////////////// SQUARE////////////////////////
    System.out.println("////////////Square//////////");
    Square sq1 = new Square("black", 2);
    sq1.display();

    //////////////////// RECTANGLE/////////////////////
    System.out.println("////////////Rectangle///////");
    Rectangle r1 = new Rectangle("Yellow", 2, 3);
    r1.display();

    ///////////////////Triangle/////////////////////////
    System.out.println("////////////Triangle/////////");
    Triangle t1 = new Triangle("Pink" , 6 ,7);
    t1.display();
  }
}
