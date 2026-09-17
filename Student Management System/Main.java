// Student Management System Using Game

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Varibales
         String name;
         int age;
         int sub;
         int total_marks = 0;
         double percentage;
         int highest_marks = 1;
         int lowest_marks = 100;
         boolean is_running = true;


        System.out.println("\n\t\t ===== STUDENT MANAGEMNET STUDENT =====");
        System.out.println("\t\t-----------------------------------------\n");


        // Student Information Input
        System.out.println("\n========================");
        System.out.print("Enter Student Name: ");
        name = scanner.nextLine();


        while (is_running) { 

            System.out.print("Enter Student Age: ");
            age = scanner.nextInt();
            
            if (age <= 0){
                System.out.println("\nTo Young For Study!!\n");
                
            }
            else if (age > 30){
                System.out.println("\nTo Old For Study!!\n");
                
            }
            else{
                scanner.nextLine();
                System.out.print("\n");


                // Student Subjects Marks Input
                for (int i = 1; i <= 5; i++){

                    while (true){
                        System.out.print("Enter " + i + " Subject Marks: ");
                        sub = scanner.nextInt();

                        if (sub <= 0 || sub > 100) {
                            System.out.println("Invalid Marks Input!!\n");
                            
                            
                        }
                        else{
                            total_marks += sub;

                            if (sub > highest_marks) {
                                highest_marks = sub;
                            }
                            if (sub < lowest_marks) {
                                lowest_marks = sub;
                            }

                        break;
                        }
                    }
                    
                }

                // Calculate Percentage
                percentage = (total_marks / 500.0) * 100;


                // Final Output
                System.out.println("\n===============================");
                System.out.println("NAME: " + name);
                System.out.println("AGE: " + age);
                System.out.println("TOTAL MARKS: " + total_marks);
                System.out.printf("PERCENTAGE: %.1f%%" , percentage);


                // Student Grade Calculator
                if (total_marks >= 450){
                    System.out.println("\nGrade - O+");
                    System.out.println("You Got: Outstanding / Excellent");
                }
                else if (total_marks >= 400){
                    System.out.println("\nGrade -> A");
                    System.out.println("You Got: Very Good");
                }
                else if (total_marks >= 350){
                    System.out.println("\nGrade -> B");
                    System.out.println("You Got: Good");
                }
                else if (total_marks >= 300) {
                    System.out.println("\nGrade -> C");
                    System.out.println("You Got: Above Average");
                }
                else if (total_marks >= 250) {
                    System.out.println("\nGrade -> D");
                    System.out.println("You Got: Average");
                }
                else if (total_marks >= 175) {
                    System.out.println("\nGrade -> E");
                    System.out.println("You Got: Below Average");
                }
                else{
                    System.out.println("\nGrade -> Fail");
                    System.out.print("Try Next Time !!");
                }


                // Printing Highest & Lowest Marks
                System.out.println("Highest Marks: " + highest_marks);
                System.out.println("Lowest Marks: " + lowest_marks);
                System.out.println("===============================\n");

                is_running = false;
            }
        }

        // scanner.close();
    }
}