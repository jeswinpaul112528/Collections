/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgrademanagement;

/**
 *
 * @author jeswinnnn
 */
public class StudentGradeManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();
        ProcessingQueue processingQueue = new ProcessingQueue();
        
        Student s1 = new Student(101, "Arun", 85);
        Student s2 = new Student(102, "Priya", 92);
        Student s3 = new Student(103, "Rahul", 76);
        Student s4 = new Student(104, "Divya", 64);
        Student s5 = new Student(105, "Kiran", 48);

        studentManager.addStudent(s1);
        studentManager.addStudent(s2);
        studentManager.addStudent(s3);
        studentManager.addStudent(s4);
        studentManager.addStudent(s5);
        
         courseManager.addCourse("Java");
        courseManager.addCourse("Database");
        courseManager.addCourse("Computer Networks");
        courseManager.addCourse("Java");
        courseManager.addCourse("Operating Systems");
          for (Student student : studentManager.getStudents()) {

            processingQueue.addStudent(student.id);
        }
          System.out.println("======================================");
        System.out.println("     STUDENT GRADE MANAGEMENT");
        System.out.println("======================================");

       
        studentManager.displayStudents();

        
        courseManager.displayCourses();

     
        studentManager.displayMarks();


        processingQueue.processStudents();

      
        studentManager.findTopper();

       
        System.out.println("\nTotal Students: "
                + studentManager.getStudentCount());

        System.out.println(
                "Total Unique Courses: "
                + courseManager.getCourseCount());

    }
    
}
