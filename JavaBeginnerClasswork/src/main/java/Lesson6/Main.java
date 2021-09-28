/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        Employees emp1 = new Employees("John", "Wick", 50, "0118861265", 45261662);
        Employees emp2 = new Employees("Chris", "Smith", 65, "012546465", 024755567);
        Employees emp3 = new Employees("Jack", "Frost", 52, "012546787", 5659655);

        Employees[] myEmps = {emp1, emp2, emp3};
        
        for(Employees emp : myEmps) {
            emp.displayDetails();
            System.out.println("\n");
        }
    }
}

//emp1.setAge(55);
//        
//        emp1.displayDetails();
//        System.out.println("......................");
//        emp2.displayDetails();

//        System.out.println("Name: " + emp1.getName());
//        System.out.println("Surname: " + emp1.getSurname());
//        System.out.println("Age: " + emp1.getAge());
//        System.out.println("Contact Number: " + emp1.getContactNum());
//        System.out.println("ID Number: " + emp1.getIdentityNum());
//        
//        System.out.println("Name: " + emp2.getName());
//        System.out.println("Surname: " + emp2.getSurname());
//        System.out.println("Age: " + emp2.getAge());
//        System.out.println("Contact Number: " + emp2.getContactNum());
//        System.out.println("ID Number: " + emp2.getIdentityNum());
