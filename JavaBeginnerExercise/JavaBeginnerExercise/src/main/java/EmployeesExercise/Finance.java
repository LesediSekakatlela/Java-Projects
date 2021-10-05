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
    private String stockControl;

    public Finance(String name, String surname, int age, char gender, int identityNum, String stockControl) {
        super(name, surname, age, gender, identityNum);
        this.stockControl = stockControl;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("stockControl: " + getStockControl());
    }

    public String getStockControl() {
        return stockControl;
    }

    public void setStockControl(String stockControl) {
        this.stockControl = stockControl;
    }
}
