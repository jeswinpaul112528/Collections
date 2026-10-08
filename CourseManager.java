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
public class CourseManager {

    // Set - stores unique courses
    private Set<String> courses = new HashSet<>();

    // Add course
    public void addCourse(String course) {
        courses.add(course);
    }
    public void displayCourses() {

        System.out.println("\n--- Available Courses ---");

        for (String course : courses) {
            System.out.println(course);
        }
    }

    public int getCourseCount() {
        return courses.size();
    }
}
