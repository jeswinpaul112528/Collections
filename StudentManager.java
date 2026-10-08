/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentgrademanagement;
import java.util.*;

/**
 *
 * @author jeswinnnn
 */
public class StudentManager {


    private List<Student> Students = new ArrayList<>();

    private Map<Integer, Double> marks = new HashMap<>();

    
    public void addStudent(Student student) {

        Students.add(student);

        marks.put(student.id, student.mark);
    }
    public void displayStudents() {

        System.out.println("\n--- Student List ---");

        for (Student student : Students) {
            student.display();
        }
    }

    // Display marks
    public void displayMarks() {

        System.out.println("\n--- Student Marks ---");

        for (Map.Entry<Integer, Double> entry : marks.entrySet()) {

            System.out.println(
                    "Student ID: " + entry.getKey()
                    + " | Mark: " + entry.getValue());
        }
    }

    // Find class topper
    public void findTopper() {

        double highest = 0;
        Student topper = null;

        for (Student student : Students) {

            if (student.mark > highest) {
                highest = student.mark;
                topper = student;
            }
        }

        System.out.println("\n--- Class Topper ---");

        if (topper != null) {

            System.out.println("Topper: " + topper.name);
            System.out.println("Mark: " + topper.mark);
        }
    }

    // Return total number of students
    public int getStudentCount() {
        return Students.size();
    }

    // Return students for queue processing
    public List<Student> getStudents() {
        return Students;
    }
}