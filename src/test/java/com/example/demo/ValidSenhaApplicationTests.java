package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.ValidatePasswordController;

@SpringBootTest
class ValidSenhaApplicationTests {

	@Autowired
    private ValidatePasswordController controller;

    @Test
    public void testPasswordValidationIntegration() {
        boolean result = controller.validatePassword("AbTp9!fok");
        assertTrue(result);
    }

}
