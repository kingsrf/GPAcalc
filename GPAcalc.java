
/**
 * Program to calculate student GPA.
 *
 * @author King Sambonge - LinkedIn
 * @version 1.0 - 01/13/2025
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
        
        // Formula to calculate GPA results
        if (percentage >= 65.0 && percentage <= 94.9) {
            gpa = (percentage * 0.1) - 5.5;
            return Math.floor(gpa * 10) / 10;
        } else if (percentage >= 95.0 && percentage <= 100.0) {
            return 4.0;
        } else { 
            gpa = 0.0;}
        
        return gpa;
    }
}
