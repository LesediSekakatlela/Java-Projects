/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author admin
 */
// Using the Throwable methods.  
class ExcTest1 { 
  static void genException() { 
    int nums[] = new int[4];  
 
    System.out.println("Before exception is generated."); 
 
    // generate an index out-of-bounds exception  
    nums[7] = 10;  
    System.out.println("this won't be displayed");  
  } 
}     
 
public class UseThrowableMethods {  
  public static void main(String args[]) {  
  
    try {  
      ExcTest.genException(); 
    }  
    catch (ArrayIndexOutOfBoundsException exc) {  
      // catch the exception  
      System.out.println("Standard message is: "); 
      System.out.println(exc); 
      System.out.println("\nStack trace: "); 
      exc.printStackTrace(); 
    }  
    System.out.println("After catch statement.");  
  }  
}
