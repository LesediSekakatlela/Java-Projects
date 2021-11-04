/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author admin
 */
 //Use a static method. 
class StaticMeth { 
  static int val = 1024; // a static variable 
 
  // a static method 
  static int valDiv2() { 
    return val/2; 
  } 
} 

//class StaticError { 
//  int denom = 3; // a normal instance variable 
//  static int val = 1024; // a static variable 
// 
//  /* Error! Can't access a non-static variable 
//     from within a static method. */ 
//  static int valDivDenom() { 
//    return val/denom; // won't compile! 
//  } 
//}
 
public class SDemo2 { 
  public static void main(String args[]) { 
 
    System.out.println("val is " + StaticMeth.val); 
    System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2()); 
 
    StaticMeth.val = 4; 
    System.out.println("val is " + StaticMeth.val); 
    System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2()); 
 
  } 
}
