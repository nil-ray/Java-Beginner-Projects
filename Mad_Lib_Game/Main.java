import java.util.Scanner;

public class Main{

    public static void main(String[] argh){

        // Variables
        String name;
        String adjective1;
        String noun;
        String place;
        String animal;
        String verb;
        String food;
        int    number;
        String adjective2;


        Scanner scanner = new Scanner(System.in);

        // User Inputs
        System.out.print("\nEnter Name (Person Name): ");
        name = scanner.nextLine();

        System.out.print("Enter Adjective-1 (e.g crazy,brave,funny): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter Noun (e.g ship,sword,banana): ");
        noun = scanner.nextLine();

        System.out.print("Enter Place (e.g. Grand Line,island,forest): ");
        place = scanner.nextLine();

        System.out.print("Enter Animal (e.g. monkey,dog,dragon): ");
        animal = scanner.nextLine();

        System.out.print("Enter Verb (e.g. run,fight,dance): ");
        verb = scanner.nextLine();

        System.out.print("Enter Food (e.g. meat,pizza): ");
        food = scanner.nextLine();

        System.out.print("Enter Number (e.g. 100): ");
        number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Adjective-2 (e.g. crazy,brave,funny): ");
        adjective2 = scanner.nextLine();


        // Final OutPut
        System.out.println("\n=================================================================");
        System.out.println("\t\t\tPIRATE ADVENTURE");
        System.out.println("=================================================================");

        System.out.println("\nOne day, " + name + " decided to become a " + adjective1 + " pirate");
        System.out.println("He found a mysterious " + noun + " near " + place + ".");
        System.out.println("Suddenly, a giant " + animal + " appeared and started to " + verb + "!");
        System.out.println(name + " quickly grabbed some " + food + " and shouted,");
        System.out.println("'I will become Pirate King in' " + number + " days!");
        System.out.println("After a " + adjective2 + " battle, the pirate and the " + animal + " become best friends.\n");

        System.out.println("=================================================================");
        System.out.println("\t\t\t THE END!");
        System.out.println("=================================================================");

        // scanner.close();
    }


}