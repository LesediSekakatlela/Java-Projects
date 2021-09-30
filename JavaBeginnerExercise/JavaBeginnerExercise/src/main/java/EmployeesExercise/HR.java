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
    private char position;
    private int numWorkers;

    public HR(String name, String surname, int age, char gender, int identityNum, char position, int numWorkers) {
        super(name, surname, age, gender, identityNum);
        this.position = position;
        this.numWorkers = numWorkers;
    }

    public void display() {
        super.display();
        System.out.println("position: " + getPosition());
        System.out.println("numWorkers: " + getNumWorkers());
    }

    public char getPosition() {
        return position;
    }

    public void setPosition(char position) {
        this.position = position;
    }

    public int getNumWorkers() {
        return numWorkers;
    }

    public void setNumWorkers(int numWorkers) {
        this.numWorkers = numWorkers;
    }
}
