/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_12;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt(15, "Hawaiain", 'R', 55.9, 'M', "Short sleeve");
        shirt01.display();
        
        System.out.println("...........\n");
        System.out.println("Item1: " + shirt01.toString());
        
        System.out.println("................\n");
        Trouser trouser01 = new Trouser(16, "Camo", 'G', 100.00, 'L', 78, 'M');
        trouser01.display();
        
        System.out.println("..............\n");
        Clothing shirt02 = new Shirt(17, "Golf", 'G', 199.0, 'M', "Long sleeve");
        
        System.out.println("'\nShirt Description: " + shirt02.getDesc());
        if (shirt02 instanceof Shirt) {
            System.out.println("\nGolf Shirt Fit: " + ((Shirt)shirt02).getFit());
        }else{
            System.out.println("\nItem is not shirt.");
        }
        
        System.out.println(".................\n");
        shirt02.display();
        
        System.out.println(shirt02.toString());
    }
}
