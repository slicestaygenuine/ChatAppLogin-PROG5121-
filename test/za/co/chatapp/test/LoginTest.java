/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.co.chatapp.test;

import za.co.chatapp.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
    
/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {

    @Test
    public void testPhoneNumberValidation() {
        Login login = new Login();
        assertTrue(login.isValidPhoneNumber("0821234567"));
        assertTrue(login.isValidPhoneNumber("+27821234567"));
        assertFalse(login.isValidPhoneNumber("12345"));
    }

    @Test
    public void testUserRegistrationAndLoginSuccess() {
        Login login = new Login();
        login.registerUser("testUser", "pass123", "0831234567");
        String result = login.loginUser("testUser", "pass123");
        assertEquals("Login successful.", result);
    }

    @Test
    public void testLoginFailureWrongPassword() {
        Login login = new Login();
        login.registerUser("testUser", "pass123", "0831234567");
        String result = login.loginUser("testUser", "wrongpass");
        assertEquals("Login failed. Incorrect username or password.", result);
    }
}   
