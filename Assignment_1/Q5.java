package Assignment_1;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
    /*
     * 
5. Basic Quiz Application

Problem Statement: 
Develop a simple quiz application that asks the user three multiple-choice questions. 
For each question, the user should input their answer, and the program should keep track of the score. 
At the end of the quiz, display the total score and percentage.

Requirements:
Use variables to store questions, options, user answers, and scores.
Implement type casting if necessary (e.g., converting user input to an integer for score calculation).
Use escape sequences to format the questions and options clearly.
Calculate the percentage based on the total score.
onion medha patkar
grapes  Sindhutai Sapkal 
banana	Savitribai Phule
mangose   rani Bang 

  
     */
    	Scanner sc = new Scanner(System.in);
    	
    	// Questions 
    	
    	String[] questions = 
    		{
    				"1. What is the capial of India ? ",
    				"2. Ratnagiri is famous for the production of",
    				"3. Who of the following is known as the Mother of Orphans because of her work in looking after abandoned children in Maharashtra?"
    		};
    	String [] [] options =
    	{
    		{"A. Delhi" , "B) Mumbai", "C) Kolkata", "D) Chennai"},
    		{"A. Onion" , "B) Grapes", "C) Bananas", "D) Mangeos"},
    		{"A. Medha Patkar" , "B) Sindhutai Sapkal", "C) Savitribai Phule ", "D) Indira Gandhi"}
    	};
    	
    	char [] RightAnswer = {'A' , 'D' , 'B' };
    	
    	int score = 0;
    	
    	System.out.println("Welcome to the Quiz...");
    	
    	for (int i=0; i < questions.length; i++ )
    	{
    		System.out.println((i + 1) + ". "+ questions[i]);
    		for (String option : options[i])
    		{
    			System.out.println(option);
    		}
    		System.out.println("Enter your option : ");
    		char userAnswer = sc.next().charAt(0);
    		
    		if (userAnswer == RightAnswer[i])
    		{
    			System.out.println("Good job!!!");
    			score++;
    		}
    		else
    		{
    			System.out.println("Better luch next time...");
    		}
    	}
    	System.out.println("Your Score is : "+ score + " out of "+ questions.length);
    	System.out.println("Your percentage is : "+(score * 100.0/questions.length));
    	
    	sc.close();
    	
    }
}



















