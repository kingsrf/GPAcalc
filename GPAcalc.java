
/**
 * Write a description of class GPAcalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class GPAcalc{
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Student name & percentage
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student's percentage: ");
        double percentage = scanner.nextDouble();
        
        //
        double gpa = calculateGPA(percentage);
        
        // Output: Display student's name,percentage & GPA 
        System.out.println("Student's Name: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("GPA: " + gpa);
        
        scanner.close();
    }
    
    //
    public static double calculateGPA(double percentage) {
        double gpa;
        
        if (percentage >= 65.0 && percentage <= 100.0) {
            gpa = (percentage * 0.1) - 5.5;
            return Math.floor(gpa * 10) / 10;
        } else {
            return 0.0;
        }
    }
}
