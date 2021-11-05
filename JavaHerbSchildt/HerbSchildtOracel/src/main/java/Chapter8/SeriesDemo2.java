/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author admin
 */ 
// Implement Series and add getPrevious(). 
// Demonstrate interface references. 
class ByTwos implements Series { 
  int start; 
  int val; 
 
  ByTwos() { 
    start = 0; 
    val = 0; 
  }  
 
  @Override
  public int getNext() { 
    val += 2; 
    return val; 
  } 
 
  @Override
  public void reset() { 
    val = start; 
  } 
 
  @Override
  public void setStart(int x) { 
    start = x; 
    val = x; 
  } 
} 
 
class ByThrees implements Series { 
  int start; 
  int val; 
 
  ByThrees() { 
    start = 0; 
    val = 0; 
  }  
 
  @Override
  public int getNext() { 
    val += 3; 
    return val; 
  } 
 
  @Override
  public void reset() { 
    val = start; 
  } 
 
  @Override
  public void setStart(int x) { 
    start = x; 
    val = x; 
  } 
} 
  class SeriesDemo2 { 
  public static void main(String args[]) { 
    ByTwos twoOb = new ByTwos(); 
    ByThrees threeOb = new ByThrees(); 
    Series ob; 
 
    for(int i=0; i < 5; i++) { 
      ob = twoOb; 
      System.out.println("Next ByTwos value is " + ob.getNext()); 
      ob = threeOb; 
      System.out.println("Next ByThrees value is " + ob.getNext()); 
    } 
  } 
}