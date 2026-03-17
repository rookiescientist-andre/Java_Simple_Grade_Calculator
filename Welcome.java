/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaila
 */

// Import all necessary libraries
import java.util.*;

public class Welcome {
    public static void main(String[] args) {
        // Initializes input object
        Scanner input = new Scanner(System.in);
        // Initializes variables for user input 
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        // Initializes boolean variable to control while-loop
        boolean validInput = false;
        
        // Creates a while-loop to ensure valid user input
        while (!validInput) {
            // Uses a try-catch exception to handle error
            try {
                // Prompts user to enter three integer scores
                System.out.println("Enter three exam scores");
                System.out.print("First exam score: ");
                score1 = input.nextInt();
                
                System.out.print("Second exam score: ");
                score2 = input.nextInt();
                
                System.out.print("Third exam score: ");
                score3 = input.nextInt();
                // Switches boolean variable to true and exits while-loop
                validInput = true;
            }
            // Catches InputMismatchException errors
            catch (InputMismatchException e) {
                // Prompts user to re-enter a valid input
                System.out.println("Invalid input! Please enter a valid score.");
                input.next(); // Clears invalid input
            }
        }
        // Calculates the average of the three inputs
        int averageScore = (score1 + score2 + score3) / 3;
        // if-else statements to display grade based on the average score
        if (averageScore >= 90)
            System.out.println("You got an A!");
        else if (averageScore >= 80)
            System.out.println("You got a B!");
        else if (averageScore >= 70)
            System.out.println("You got a C!");
        else if (averageScore >= 60)
            System.out.println("You got a D!");
        else
            System.out.println("You got an F!");
    }
}
