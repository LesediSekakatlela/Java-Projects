/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author admin
 */
class ShowBits1 { 
  int numbits; 
 
  ShowBits1(int n) { 
    numbits = n; 
  } 
 
  void show(long val) { 
    long mask = 1; 
 
    // left-shit a 1 into the proper position 
    mask <<= numbits-1; 
 
    int spacer = 0; 
    for(; mask != 0; mask >>>= 1) { 
      if((val & mask) != 0) System.out.print("1"); 
      else System.out.print("0"); 
      spacer++; 
      if((spacer % 8) == 0) { 
        System.out.print(" "); 
        spacer = 0; 
      } 
    } 
    System.out.println(); 
  } 
} 
 
// Demonstrate ShowBits. 
public class ShowBitsDemo { 
  public static void main(String args[]) { 
    ShowBits1 b = new ShowBits1(8); 
    ShowBits1 i = new ShowBits1(32); 
    ShowBits1 li = new ShowBits1(64); 
 
    System.out.println("123 in binary: "); 
    b.show(123); 
 
    System.out.println("\n87987 in binary: "); 
    i.show(87987); 
 
    System.out.println("\n237658768 in binary: "); 
    li.show(237658768); 
 
 
    // you can also show low-order bits of any integer 
    System.out.println("\nLow order 8 bits of 87987 in binary: "); 
    b.show(87987);  
  } 
}

