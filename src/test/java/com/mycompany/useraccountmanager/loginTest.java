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

    /**
     * Test of registerUser method, of class login.
     */
    @org.junit.jupiter.api.Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        login instance = new login();
        String expResult = "";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class login.
     */
    @org.junit.jupiter.api.Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class login.
     */
    @org.junit.jupiter.api.Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "";
        String password = "";
        String firstName = "";
        String lastName = "";
        login instance = new login();
        String expResult = "";
        String result = instance.returnLoginStatus(username, password, firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
