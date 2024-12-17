package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ValidatePasswordService;

@RestController
@RequestMapping("/password")
public class ValidatePasswordController {

    @Autowired
    private ValidatePasswordService validatePasswordService;

    @PostMapping("/validate/{password}")
    public boolean validatePassword(@PathVariable String password) {
        boolean passwordValid = validatePasswordService.isValid(password);
        return passwordValid;
    }

}
