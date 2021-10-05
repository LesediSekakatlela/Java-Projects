/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeesExercise;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        HR emp1 = new HR("Kate", "Brown", 50, 'F', 45261662, "HR Manager", 10000);
        emp1.display();
        
        System.out.println(".................\n");
        Finance emp2 = new Finance("Dave", "Low", 30, 'M', 45345662,"Products");
        emp2.display();
        
        System.out.println(".................\n");
        Engineering emp3 = new Engineering("Sam", "Walker", 45, 'F', 78961662, "Civil Engineering");
        emp3.display();
        
        System.out.println(".................\n");
        HR emp4 = new HR("Paul", "Brat", 35, 'M', 56761662, "HR Assistance", 9000);
        emp4.display();
//        System.out.println("...........\n");
//        System.out.println("Item1: " + emp1.toString());

        
    }
}
