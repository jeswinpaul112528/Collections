/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentgrademanagement;

/**
 *
 * @author jeswinnnn
 */
import java.util.*;

public class ProcessingQueue {
    private Queue<Integer> processingQueue = new LinkedList<>();

    public void addStudent(int studentID) {
        processingQueue.add(studentID);
    }

    public void processStudents() {

        System.out.println("\n--- Processing Queue ---");

        while (!processingQueue.isEmpty()) {

            int studentID = processingQueue.poll();

            System.out.println(
                    "Processing Student ID: " + studentID);
        }
    }
}