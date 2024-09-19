/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.useraccountmanager;

/**
 *
 * @author RC_Student_lab
 */

//// Class to store user informaion with attributes for username, password, first name, and last name

public class User{
    // Private variables to store user details
   
    private String username;
     private String password;
     private String firstname;
     private String Lastname;
     
    // Getter method to return the value of the username
     public String getusername(){
         return username;
     }
     
     // Setter method to set the value of the username
     public void setusername(String z){
         username = z;
     }
     
      // Getter method to return the value of the password
     public String getpassword(){
         return password;
     }
     
         // Setter method to set the value of the password
     public void  setpassword(String w){
         password= w;
     }
     
     // Setter method to set the first name of the user
     public void setfirstname(String n){
         firstname=n;
     }
     
     
    // Getter method to return the value of the first name
     public String getfirstname(){
        return firstname;
     }
}
