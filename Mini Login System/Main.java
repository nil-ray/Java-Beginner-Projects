// Mini Login System

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String username = "luffy@21";
        String Password = "LUFFY@2026";
        String input_username;
        String input_password;
        int attempt = 3;

        System.out.println("\n\t\t ===== USER LOGIN =====");
        System.out.println("\t\t==============================");

        while (attempt > 0) { 

            System.out.println("\nAttempts Remaining: " + attempt + "\n");
            System.out.print("Enter Your Username: ");
            input_username = scanner.nextLine();

            System.out.print("Enter Your Password: ");
            input_password = scanner.nextLine();


            if (!input_username.equals(username) && !input_password.equals(Password)){
                System.out.println("\nInvalid credentials!!");
                System.out.println("=========================");
                attempt--;
            }
            else if (input_username.equals(username) && !input_password.equals(Password)) {
                System.out.println("\nWrong Password!!");
                System.out.println("=========================");
                attempt--;
            }
            else if (!input_username.equals(username) && input_password.equals(Password)) {
                System.out.println("\nWrong Username!!");
                System.out.println("=========================");
                attempt--;
            }
            else{
                System.out.println("\n======================");
                System.out.println("Username: " + username);
                System.out.println("Password: " + Password);
                System.out.println("Login Successful! 🎉");
                System.out.println("=========================\n");
                break;
            }
        }
        
        if (attempt == 0) {
            System.out.println("\nToo Many Failed Attempts!");
            System.out.println("Account Locked! 🔒\n");
        }

        // scanner.close();
    }
}