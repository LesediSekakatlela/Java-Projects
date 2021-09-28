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
public class incrementDecrement {
    public static void main(String[] args) {
        int count = 15;
        int a, b, c, d, e, f;
        a = count++;
        b = count;
        c = ++count;
        d = count--;
        e = --count;
        f = count;
        System.out.println(a + "," + b + "," + c + "," + d + "," + e + "," + f);
    }
}
