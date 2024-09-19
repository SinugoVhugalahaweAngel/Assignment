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
    
}
