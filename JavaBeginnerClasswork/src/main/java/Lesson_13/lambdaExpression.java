/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_13;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author admin
 */
public class lambdaExpression {
    public static void main(String[] args) {
        String[] names = {"Fred", "John", "hulk", "Steve"};
        ArrayList<String> myList = new ArrayList(Arrays.asList(names));
        
        myList.replaceAll(s -> s.toUpperCase());
        myList.removeIf(s -> s.equals("John"));
        myList.removeIf(s -> s.length() < 5);
        System.out.println("After for loop: " + myList);
    }
}
