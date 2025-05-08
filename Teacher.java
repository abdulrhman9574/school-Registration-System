
package com.mycompany.school;

import java.util.Scanner;

public class Teacher extends Person {
//    data fields
    private double salary;
    private String department;
//   constructor
    public Teacher(double salary, String department, String name, int age) {
        super(name, age);
        this.salary = salary;
        this.department = department;
    }
//     method to get salary depending on teacher's rank
    public double getSalary() {
        int choice;
        String rank;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your rank to know your salary :");
        System.out.println("1. Teaching Assistant");
        System.out.println("2. Teacher");
        System.out.println("3. Senior Teacher");
        System.out.println("4. Professor");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                rank = "Teaching Assistant";
                return 10000;
            case 2:
                rank = "Teacher";
                return 15000;
            case 3:
                rank = "Senior Teacher";
                return 20000;
            case 4:
                rank = "Professor";
                return 25000;
            default:
                System.out.println("ERROR");
                return 0;
        }

    }
//  setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
//  getter for department
    public String getDepartment() {
        return department;
    }
//  setter for department
    public void setDepartment( String department) {
        this.department = department;
    }
    
    @Override
    public void information(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("department: " + getDepartment());
        System.out.println("Salary: " + getSalary());
    }
}
