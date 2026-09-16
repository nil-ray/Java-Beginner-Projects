// Number Guessing Game Using Java

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Varibales
        String userName;
        int user_guess;
        int count_guesses = 0;
        int computer = random.nextInt(1, 101);
        boolean gameRunning = true;
        
        // Display Game Menu
        System.out.println("\n\t\t\t ====== WELCOME ======");
        System.out.println("\t\t ======== NUMBER GUESSING GAME ========\n");
        
        System.out.println("\t\t*Please Enter Your Name To Start Playing*");
        System.out.println("\t\t-------------------------------------------\n");
        

        // Ask Player Name To Enter
        System.out.print("Enter Your Name: ");
        userName = scanner.nextLine();
        
        // Game Start
        System.out.println("Game Starting.........\n");

        while(gameRunning){

            System.out.print("\nGuess A Number Between (1-100): ");
            user_guess = scanner.nextInt();
            

            if (user_guess > 100 || user_guess < 1) {
                System.out.println("You Enter A Invalid Number !!");
    
            }
            else if (user_guess > computer) {
                System.out.println("To High !!");
                count_guesses++;
            }
            else if (user_guess < computer) {
                System.out.println("To Low !!");
                count_guesses++;
            }
            else{
                System.out.println("You Guessed Correct");
                count_guesses++;
                gameRunning = false;
            }
        }

        System.out.println("\nHello!! " + userName);
        System.out.println("You Guessed Correct In: " + count_guesses + " Attempts\n");
        
        // scanner.close();
    }
}