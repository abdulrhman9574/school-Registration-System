
package course;

import java.util.ArrayList;

public class Teacher extends Person {
//    data fields
    private double salary;
    private String department;
    private String rank;
//   constructor
    public Teacher(String name, int age,String rank, String department ,double salary ) {
        super(name, age);
        this.salary = salary;
        this.department = department;
        this.rank = rank;
    }
//  Setters and Getters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
//    initialized an ArrayList
      ArrayList<String> teacherList = new ArrayList<String>();
      
//      The list of Teachers
      {
       teacherList.add("Dr.Mohamed");
       teacherList.add("Dr.Mahmoud");
       teacherList.add("Dr.Ahmed");
       teacherList.add("Dr.Hussein");
       teacherList.add("Dr.Waleed"); 
      }
//      method to add a new Teacher
      public void addTeacher (String Teacher) {
          teacherList.add(Teacher);
      }
//      method do display the list of Teachers    
       public void displayTeacherList() {
           System.out.println(teacherList);
       }
    
    @Override
    public void information(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Rank: "+getRank());
        System.out.println("department: " + getDepartment());
        System.out.println("Salary: " + getSalary());
    }
}
