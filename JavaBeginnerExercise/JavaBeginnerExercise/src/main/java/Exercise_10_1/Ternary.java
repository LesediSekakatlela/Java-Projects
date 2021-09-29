/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_10_1;

/**
 *
 * @author admin
 */
public class Ternary {
   public static void main (String args[]){
        int x = 4, y = 9;
        x = ((y / x) < 3) ? (x += y) : (x *= y);
        
        System.out.println("Solution : " + x);
    }
}


