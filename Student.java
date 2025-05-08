package com.mycompany.school;

import java.util.ArrayList;

/**
 *
 * @author Egypt print
 */
public class Student extends Person {


    
    public ArrayList<Subject> SubbedSubjects = new ArrayList<>(); //Subject is a data type to get access for more data types like int and string, you can use the id or subject name in brief
    public Student(String name, int age){ 
        super (name, age);//(Super Class's Constructor)
    }
    public void addSubject(Subject subject){ //Adding method of the arraylist (Setter)
        SubbedSubjects.add(subject);
       
    }
    public ArrayList<Subject> getSubject(){//Getter
        return SubbedSubjects;
    }

    
    @Override
    public String information(){ //The person's abstract method
        
    String info = "Student name : "+getName()+" Student's ID : "+getId();
    info+=" SubbedSubjects : \n";
        
    
        for (int i=0;i<SubbedSubjects.size();i++){
            info+= "- "+SubbedSubjects.get(i).getSubjectName();}
        
        return info;}}

    
    
    
    
    
    
    

