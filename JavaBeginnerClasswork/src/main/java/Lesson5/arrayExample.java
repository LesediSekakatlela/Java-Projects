/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author admin
 */
public class arrayExample {

    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Jack";
        names[1] = "Paul";
        names[2] = "Lu";
        names[3] = "Lee";
        names[4] = "Kat";

        for (String name : names) {
            System.out.println("My name is " + name);
            if (name == "Lu") {
                break;
            }
        }

    }
}
