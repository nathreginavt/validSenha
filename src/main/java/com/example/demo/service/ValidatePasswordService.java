package com.example.demo.service;
import java.util.HashSet;

import org.springframework.stereotype.Service;

@Service
public class ValidatePasswordService {

    public boolean isValid(String password){

        if(password == null || password.length() < 9 || password.contains(" ") ){
            return false;
        }

        HashSet<Character> charSet = new HashSet<>();
        for (char c : password.toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }

        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasLowerCase = password.matches(".*[a-z].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()-+].*");

        return hasDigit && hasUpperCase && hasLowerCase && hasSpecial; 

    }
}