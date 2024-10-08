/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.useraccountmanager;

/**
 *
 * @author RC_Student_lab
 */
public class login {
     
    private String username;
    private String password;

    // This Method ensures that any username contains an under score(_) and length is no more than 5
    public boolean checkUserName(String username) {
        // Ensure the username contains an underscore and is no more than 5 characters
        return username.length() <= 5 && username.contains("_");
    }
    
    // This method ensures that password meet the following password complexity rules ,the password must be:Atleast 8 characters long ,Contains capital letter,Contains a number,Contains special character 
    public boolean checkPasswordComplexity(String password) {
        this.password = password;

        // Flags for password complexity checks
        boolean hasCapital = false;
        boolean hasSpecialcharacter = false;
        boolean hasDigit = false;

          for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);  // Get character at index i

        if (Character.isUpperCase(c)) {
            hasCapital = true;
        } else if (Character.isDigit(c)) {
            hasDigit = true;
        } else if (!Character.isLetterOrDigit(c)) {  // Check for special character
            hasSpecialcharacter = true;
        }
          }



        // At least 8 characters, a capital letter, a number, and a special character
        return password.length() >= 8 && hasCapital && hasSpecialcharacter && hasDigit;
    }
    
    /* This method returns the necessary registreation messading indicating if the username is incorrectly formatted,The password does not meet complexity requrements
    The two abvve conditions have been and user has been registered successfully
    */
    public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        } else {
            this.username = username;
            this.password = password;
            return "User registered successfully.";
        }
    }

    
    // This  Method Verifies that login details entered matches the login details stored when the userregistered
    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);  // Dynamic username and password check
    }
    
     // This method returns the necessary messaging for :A successful log in ,A Failed log in 
    public String returnLoginStatus(String username, String password, String firstName, String lastName) { // firstName and lastName added
        if (loginUser(username, password)) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    
    }
    }

