package Assignment_1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Simple Banking System

Problem Statement: 
Create a simple banking system that allows a user to deposit and withdraw money. 
The program should:
Start with an initial balance of $1000.
Prompt the user to enter the amount to deposit or withdraw.
Ensure that the withdrawal does not exceed the current balance.
Display the updated balance after each transaction.

Requirements:
Use variables to store the balance and transaction amounts.
Implement type casting if necessary (e.g., converting user input to double).
Use escape sequences to format the output.
 */
		Scanner scanner = new Scanner(System.in);
        double balance = 1000; // Initial balance
        int choice;

        // ATM menu using a do-while loop
        do {
            System.out.println("************** Banking System **************");
            System.out.println("");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	 System.out.print("Enter amount to deposit: ");
                     double deposit = scanner.nextDouble();
                     balance += deposit; // Update balance
                     System.out.println("Deposited: $" + balance);
                     break;
                case 2:
                	System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw; // Update balance
                        System.out.println("Withdrawn: $" + balance);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 3:
                	System.out.println("Current balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for visiting.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4); // Continue until the user chooses to exit

	}

}
