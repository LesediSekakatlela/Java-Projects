/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_14.Example;

/**
 *
 * @author admin
 */
public class Main {
public static void main(String[] args) {
        Utils obj = new Utils();
        try {
            obj.doThis();
        } catch (Exception e) {
            System.out.println("Exception caught:" + e.getMessage());
        }
        System.out.println("Back to main method.");
    }
}
