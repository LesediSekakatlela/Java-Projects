/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_13;

/**
 *
 * @author admin
 */
public class Trouser extends Clothing{
    private char waistSize;
    private int length;
    private char gender;

    public Trouser(int itemID, String desc, char colorCode, double price, char waistSize, int length, char gender) {
        super(itemID, desc, colorCode, price);
        this.waistSize = waistSize;
        this.length = length;
        this.gender = gender;
    }

    
    
    public void display() {
        super.display();
        System.out.println("waistSize: " + getWaistSize());
        System.out.println("length: " + getLength());
        System.out.println("gender: " + getGender());
    }

    public char getWaistSize() {
        return waistSize;
    }

    public void setWaistSize(char waistSize) {
        this.waistSize = waistSize;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
