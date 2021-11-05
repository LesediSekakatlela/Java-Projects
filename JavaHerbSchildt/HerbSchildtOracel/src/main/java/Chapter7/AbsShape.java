/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author admin
 */
// Create an abstract class. 
abstract class TwoDShape1 {  
  private double width;  
  private double height;  
  private String name;  
  
  // A default constructor.  
  TwoDShape1() {  
    width = height = 0.0;  
    name = "none";  
  }  
  
  // Parameterized constructor.  
  TwoDShape1(double w, double h, String n) {  
    width = w;  
    height = h;  
    name = n;  
  }  
  
  // Construct object with equal width and height.  
  TwoDShape1(double x, String n) {  
    width = height = x;  
    name = n;  
  }  
  
  // Construct an object from an object.  
  TwoDShape1(TwoDShape1 ob) {  
    width = ob.width;  
    height = ob.height;  
    name = ob.name;  
  }  
  
  // Accessor methods for width and height.  
  double getWidth() { return width; }  
  double getHeight() { return height; }  
  void setWidth(double w) { width = w; }  
  void setHeight(double h) { height = h; }  
  
  String getName() { return name; }  
  
  void showDim() {  
    System.out.println("Width and height are " +  
                       width + " and " + height);  
  }  
  
  // Now, area() is abstract. 
  abstract double area(); 
}  
  
// A subclass of TwoDShape for triangles. 
class Triangle1 extends TwoDShape1 {  
  private String style;  
    
  // A default constructor.  
  Triangle1() {  
    super();  
    style = "none";  
  }  
  
  // Constructor for Triangle.  
  Triangle1(String s, double w, double h) {  
    super(w, h, "triangle");  
  
    style = s;   
  }  
  
  // One argument constructor 
  Triangle1(double x) {  
    super(x, "triangle"); // call superclass constructor  
  
    style = "filled";   
  }  
  
  // Construct an object from an object.  
  Triangle1(Triangle1 ob) {  
    super(ob); // pass object to TwoDShape constructor  
    style = ob.style;  
  }  
  
  double area() {  
    return getWidth() * getHeight() / 2;  
  }  
  
  void showStyle() {  
    System.out.println("Triangle is " + style);  
  }  
}  
  
// A subclass of TwoDShape for rectangles.   
class Rectangle1 extends TwoDShape1 {   
  // A default constructor.  
  Rectangle1() {  
    super();  
  }  
  
  // Constructor for Rectangle.  
  Rectangle1(double w, double h) {  
    super(w, h, "rectangle"); // call superclass constructor  
  }  
  
  // Construct a square.  
  Rectangle1(double x) {  
    super(x, "rectangle"); // call superclass constructor  
  }  
  
  // Construct an object from an object.  
  Rectangle1(Rectangle1 ob) {  
    super(ob); // pass object to TwoDShape constructor  
  }  
  
  boolean isSquare() {   
    if(getWidth() == getHeight()) return true;   
    return false;   
  }   
     
  double area() {   
    return getWidth() * getHeight();   
  }   
}  
  
public class AbsShape {  
  public static void main(String args[]) {  
    TwoDShape1 shapes[] = new TwoDShape1[4];  
  
    shapes[0] = new Triangle1("outlined", 8.0, 12.0);  
    shapes[1] = new Rectangle1(10);  
    shapes[2] = new Rectangle1(10, 4);  
    shapes[3] = new Triangle1(7.0);  
  
    for(int i=0; i < shapes.length; i++) {  
      System.out.println("object is " + shapes[i].getName());  
      System.out.println("Area is " + shapes[i].area());  
  
      System.out.println();    
    }  
  }  
}
