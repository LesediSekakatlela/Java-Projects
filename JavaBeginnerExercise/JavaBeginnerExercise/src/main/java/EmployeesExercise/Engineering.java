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
public class Engineering extends Employees{
    private String field;

    public Engineering(String name, String surname, int age, char gender, int identityNum, String field) {
        super(name, surname, age, gender, identityNum);
        this.field = field;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("field: " + getField());
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    
}
