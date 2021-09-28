/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

/**
 *
 * @author admin
 */
public class greetingTest {
    public static void main(String[] args) {
        String greet = " How ".trim();
        String grt1 = greet + "DY".toLowerCase();
        String grt2 = (greet + "DY").toLowerCase();
         
        System.out.println("Greeting 1: " + grt1);
        System.out.println("Greeting 2: " + grt2);
    }
}
