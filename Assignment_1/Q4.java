package Assignment_1;

import java.util.Scanner;

public class Q4 {
	 public static void main(String[] args) {
		 /*
4. Area and Perimeter of a Rectangle

Problem Statement: 
Create a program that calculates the area and perimeter of a rectangle.
The user should input the length and width of the rectangle, and the program should output the area and perimeter.

Requirements:
Use appropriate data types for length, width, area, and perimeter.
Implement the formulas:Area = length × width
Perimeter = 2 × (length + width)
Use escape sequences to format the output clearly.*/
		 
		  Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();

	        System.out.print("Enter the width of the rectangle: ");
	        double width = scanner.nextDouble();

	       
	        double area = length * width;
	        double perimeter = 2 * (length + width);
	        
	        System.out.println("*Calculating result......*");
	        System.out.println("\nResults :");
	        System.out.println("Area of Rectangle is : " + area);
	        System.out.println("Perimeter of Rectangle is : " + perimeter);

	        scanner.close();
	        
	        
}



	 }