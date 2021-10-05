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
public class Employees {

    private String name;
    private String surname;
    private int age;
    private char gender;
    private int identityNum;

    public void display() {
        System.out.println("name: " + getName());
        System.out.println("surname: " + getSurname());
        System.out.println("age: " + getAge());
        System.out.println("gender: " + getGender());
        System.out.println("identityNum: " + getIdentityNum());
    }

    public Employees(String name, String surname, int age, char gender, int identityNum) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.identityNum = identityNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(int identityNum) {
        this.identityNum = identityNum;
    }

    public String toString() {
        return "\nCollegue " + 1 + ";" + "\nName: " + getName() + "\nSurname: " + getSurname() + "\nAge: " + getAge() + "\nGender: " + getGender();
    }
}
