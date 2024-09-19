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

    
}
