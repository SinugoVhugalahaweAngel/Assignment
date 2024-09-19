/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.useraccountmanager;
//import scanner
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Useraccountmanager {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their first name
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();  // Read first name from user input

        // Prompt the user to enter their last name
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();   // Read last name from user input

        // Create an instance of the Login class to handle registration and login
        login login = new login();

        // Start the registration process
        System.out.println("Register your account.");
        System.out.println("Enter a username (max 5 characters, must include an underscore): ");
        String username = sc.nextLine();   // Read username from user input

    }
}
