package Basics;
import java.util.Scanner;

public class InteractiveProgram {
    public static void main(String[] args) {
        // creatting a scanner object
        Scanner input = new Scanner(System.in);


        //1. Ask for a string
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();

        // 2. Ask for an integer (number) 
        System.out.println("Enter Your Age");
        int age = input.nextInt();

        // 3. Perform a simple calculation 
        int yearsToCentury = 100 - age;

        // 4. Output the result
        System.out.println("Nice to Meet You, " + name + "!");
        System.out.println("You will be 100 years old in "+ yearsToCentury + " years." );

        input.close(); // good practice to close the scanner
    }
}
