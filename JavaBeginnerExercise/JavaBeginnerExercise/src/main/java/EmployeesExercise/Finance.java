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
public class Finance extends Employees {
    private int salary;

    public Finance(String name, String surname, int age, char gender, int identityNum, int salary) {
        super(name, surname, age, gender, identityNum);
        this.salary = salary;
    }
    
    public void display() {
        super.display();
        System.out.println("salary: " + getSalary());
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
