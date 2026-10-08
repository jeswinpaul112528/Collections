/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentgrademanagement;

/**
 *
 * @author jeswinnnn
 */
public class Student {

    int id;
    String name;
    double mark;

 
    Student(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    
    void display() {
        System.out.println(
                "ID: " + id +
                " | Name: " + name +
                " | Mark: " + mark +
                " | Grade: " + calculateGrade());
    }

    
    String calculateGrade() {

        if (mark >= 90)
            return "A+";
        else if (mark >= 80)
            return "A";
        else if (mark >= 70)
            return "B";
        else if (mark >= 60)
            return "C";
        else if (mark >= 50)
            return "D";
        else
            return "F";
    }
}