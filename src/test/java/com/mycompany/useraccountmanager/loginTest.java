/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.useraccountmanager;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class loginTest {
    
    public loginTest() {
    }

    /**
     * Test of checkUserName method, of class login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
      
        //Valid username that contains underscore and is no more than 5 characters long
        
        String username = "Kyl_1";
        
         //Create instance of a class login
        
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        
        // Assert that the result matches the expected result
        assertEquals(expResult, result);
        
        // Print the result for manual verification
        System.out.println("Result for '" + username + "': " + result);

      
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @org.junit.jupiter.api.Test
    
    /**
     * Another test of checkUserName with an invalid input
     */
    
    public void testCheckUserNameInvalid() {
        System.out.println("checkUserName");
        String username = "Kyle!!!!!";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        // Assert that the result matches the expected result
       assertEquals(expResult, result);
       // Print the result for manual verification
        System.out.println("username is not correctly formatted,Please ensure that your username contains underscore and is no more than 5 characters  in length");

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }


    /**
     * Test of checkPasswordComplexity method, of class login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        // Valid password (meets all complexity requirements)
        String password = "Ch&&sec@ke99!";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
         // Assert that the result matches the expected result
        assertEquals(expResult, result);
        
        // Print a message: "Password successfully captured
        System.out.println("Password successfully captured");
        // TODO review the generated test code and remove the default call to fail.
        
        
    }
    
    @org.junit.jupiter.api.Test
    /**
     * Test of checkPasswordComplexity method with an invalid password.
     */
    public void testCheckPasswordComplexityInvalid() {
        System.out.println("checkPasswordComplexity");  
        
        //Invalid password (does not meet complexity requirements)
        String password = "password";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        // Assert that the result matches the expected result
        assertEquals(expResult, result);
        
        /* Print: "Password is not correctly formatted,Password is not correctly formatted, please ensure the password
        contains at least 8 characters, a capital letter, a number, and a special character."
        */
        System.out.println("password is not correctly formatted ,Please ensure that the password contains atleast 8 characters ,a capital letter,a number and a special character");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }

    /**
     * Test of registerUser method, of class login.
     */
    @org.junit.jupiter.api.Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "Kyl_1";  // valid username (with underscore)
        String password = "Ch&&sec@ke99!";// Valid password
        login instance = new login();
        String expResult = "User registered successfully.";
        String result = instance.registerUser(username, password);
        // Assert that the result matches the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
        
    }
    
     @org.junit.jupiter.api.Test
    public void testRegisterUser_InvalidUsername() {
        System.out.println("registerUser with invalid username");
        String username = "Kyle!!!!!!";  // Invalid username (no underscore)
        String password = "Ch&&sec@ke99!";  // Valid password
        login instance = new login();
        String expResult = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        String result = instance.registerUser(username, password);
        // Assert that the result matches the expected result
        assertEquals(expResult, result);
    }
    
   
    @org.junit.jupiter.api.Test
    public void testRegisterUser_InvalidPassword() {
        System.out.println("registerUser with invalid password");

        // Set test data
        String username = "Kyl_1";  // Valid username
        String password = "password";  // Invalid password (no capital letter, no number, no special character)

        // Create an instance of the login system
        login instance = new login();

        // Expected result for invalid password
        String expResult = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";

        // Perform the test
        String result = instance.registerUser(username, password);

        // Assert that the result matches the expected result
        assertEquals(expResult, result);
    }

    /**
     * Test of loginUser method, of class login.
     */
    @org.junit.jupiter.api.Test
    public void testLoginUserValid() {
        System.out.println("loginUser with valid credentials");
        String username = "Kyl_1";//registered username
        String password = "Ch&&sec@ke99!";//registered password
       
        
        // Create an instance of the login system and register a user
        login instance = new login();
        instance.registerUser(username, password);// Assuming the user has been registered previously
        
        //Expected results
        boolean expResult = true;
        boolean result = instance.loginUser(username, password);
        
        // Assert that the result matches the expected output
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
         @org.junit.jupiter.api.Test
    public void testLoginUserInvalid() {
        System.out.println("loginUser with invalid credentials");

        // Set up test data
        String username = "Kyl_1";  //registered username
        String password = "password";  // Incorrect password

        // Create an instance of the login system and register a user
        login instance = new login();
        instance.registerUser("Kyl_1", "Ch&&sec@ke99!");  // Registered with valid credentials

        // Expected result 
        boolean expResult = false;

       
        boolean result = instance.loginUser(username, password);

        // Assert that the result matches the expected output
        assertEquals(expResult, result);
        
    }
    


    /**
     * Test of returnLoginStatus method, of class login.
     */
    
        @org.junit.jupiter.api.Test
    public void testReturnLoginStatus_InvalidCredentials() {
        System.out.println("returnLoginStatus");

        
        String username = "Kyl_1";// Registered username
        String password = "password";// Incorrect password
        String firstName = "Angel";
        String lastName = "sinugo";

        // Create a Login instance and register the same user
        login instance = new login();
         instance.registerUser("Kyl_1", "Ch&&sec@ke99!");  // Registering with valid credentials
        
        // Expected 
        String expResult = "Username or password incorrect, please try again.";

         
        
        String result = instance.returnLoginStatus(username, password, firstName, lastName);
        
        // Assert that the result matches the expected result
        assertEquals(expResult, result);
    }
       
    @org.junit.jupiter.api.Test
  public void testReturnLoginStatus_ValidCredentials() {
        System.out.println("returnLoginStatus with valid credentials");

        // Set test data
        String username = "Kyl_1";  // Valid username
        String password = "Ch&&sec@ke99!";  // Valid password
        String firstName = "Angel";
        String lastName = "sinugo";

         // Create an instance of the login system and register a user
        login instance = new login();
        instance.registerUser(username, password);  // Registering valid user

        // Expected result 
        String expResult = "Welcome Angel sinugo, it is great to see you again.";

        // Perform the test
        String result = instance.returnLoginStatus(username, password, firstName, lastName);

        // Assert that the result matches the expected result
        assertEquals(expResult, result);
    }
}
    

