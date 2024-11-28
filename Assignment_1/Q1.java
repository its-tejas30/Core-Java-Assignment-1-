package Assignment_1;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input subject marks
        System.out.println("Enter Math marks: ");
        int maths = sc.nextInt();

        System.out.println("Enter Science marks: ");
        int science = sc.nextInt();

        System.out.println("Enter English marks: ");
        int english = sc.nextInt();

        // Calculate average
        double averageScore = (maths + science + english) / 3.0; // Ensure floating-point division

        // Determine grade
        
        char grade;
        
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 75) {
            grade = 'B';
        } else if (averageScore >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // Display the report
        System.out.println("\n********** Student Report **********");
        System.out.printf("Math:\t\t%d\n", maths);
        System.out.printf("Science:\t%d\n", science);
        System.out.printf("English:\t%d\n", english);
        System.out.println("------------------------------------");
        System.out.printf("Average:\t%.2f\n", averageScore);
        System.out.printf("Grade:\t\t%c\n", grade);
        System.out.println("************************************");

        sc.close(); // Close the scanner
    }
}
