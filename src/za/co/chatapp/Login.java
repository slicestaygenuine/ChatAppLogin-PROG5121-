/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.co.chatapp;

import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    private User registeredUser;

    public String registerUser(String username, String password, String phoneNumber) {
        if (!isValidPhoneNumber(phoneNumber)) {
            return "Invalid phone number. Must be a valid South African number.";
        }
        registeredUser = new User(username, password, phoneNumber);
        return "Registration successful!";
    }

    public String loginUser(String username, String password) {
        if (registeredUser == null) return "No registered user found.";
        if (registeredUser.getUsername().equals(username) && registeredUser.getPassword().equals(password)) {
            return "Login successful.";
        } else {
            return "Login failed. Incorrect username or password.";
        }
    }

    public boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.matches("^(\\+27|0)[6-8][0-9]{8}$", phoneNumber);
    }
}