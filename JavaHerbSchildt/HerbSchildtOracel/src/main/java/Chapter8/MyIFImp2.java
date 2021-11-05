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
public class MyIFImp2 implements MyIF { 
  // Here, implementations for both getUserID( ) and getAdminID( ) are 
  // provided. 
  @Override
  public int getUserID() { 
    return 100; 
  } 
 
  @Override
  public int getAdminID() { 
    return 42; 
  }   
}
