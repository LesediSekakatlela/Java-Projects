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
// Use multiple catch statements. 
public class ExcDemo4 { 
  public static void main(String args[]) { 
    // Here, numer is longer than denom. 
    int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 }; 
    int denom[] = { 2, 0, 4, 4, 0, 8 }; 
 
    for(int i=0; i<numer.length; i++) { 
      try { 
        System.out.println(numer[i] + " / " + 
                           denom[i] + " is " + 
                           numer[i]/denom[i]); 
      } 
      catch (ArithmeticException exc) { 
        // catch the exception 
        System.out.println("Can't divide by Zero!"); 
      } 
      catch (ArrayIndexOutOfBoundsException exc) { 
        // catch the exception 
        System.out.println("No matching element found."); 
      } 
    } 
  } 
}
