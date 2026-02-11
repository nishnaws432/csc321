// Nishat Nawshin
/*
 * CSC 321
 * Lab #4
 */

import java.util.Scanner;

public class nnawshin4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Welcome to Nishat Cafe =====");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Pasta");
        System.out.println("4. Exit");
        System.out.print("Please enter your choice (1-4): ");

        int choice = input.nextInt();
        System.out.println();

        if (choice == 1) {
            System.out.println("You ordered a Burger. Price: $6.99");
        } 
        else if (choice == 2) {
            System.out.println("You ordered Pizza. Price: $8.99");
        } 
        else if (choice == 3) {
            System.out.println("You ordered Pasta. Price: $7.99");
        } 
        else if (choice == 4) {
            System.out.println("Thank you for visiting Nishat Cafe!");
        } 
        else {
            System.out.println("Invalid choice. Please restart the program.");
        }

        input.close();
    }
}
