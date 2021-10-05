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
public class HR extends Employees{
    private String position;
    private int salary;

    public HR(String name, String surname, int age, char gender, int identityNum, String position, int salary) {
        super(name, surname, age, gender, identityNum);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("position: " + getPosition());
        System.out.println("salary: " + getSalary());
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}
