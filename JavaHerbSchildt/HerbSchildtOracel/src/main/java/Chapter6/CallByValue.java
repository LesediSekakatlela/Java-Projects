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
// Simple types are passed by value. 
class Test1 { 
  /* This method causes no change to the arguments 
     used in the call. */ 
  void noChange(int i, int j) { 
    i = i + j; 
    j = -j; 
  } 
} 
 
public class CallByValue { 
  public static void main(String args[]) { 
    Test1 ob = new Test1(); 
 
    int a = 15, b = 20; 
 
    System.out.println("a and b before call: " + 
                       a + " " + b); 
 
    ob.noChange(a, b);  
 
    System.out.println("a and b after call: " + 
                       a + " " + b); 
  } 
}
