/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_14_;

/**
 *
 * @author admin
 */
public class IndexOutBounds {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        try{
            intArray[5] = 27;
            System.out.println("Index 5: " + intArray[5]);
        }catch(ArrayIndexOutOfBoundsException ioe) {
            System.out.println("ioe");
            System.out.println("You are trying access");
        }
    }
}
