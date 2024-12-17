package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatePasswordServiceTest {

    private final ValidatePasswordService validatePasswordService = new ValidatePasswordService();

    @Test
    public void testSenhaValida(){
        assertTrue(validatePasswordService.isValid("AbTp9!fok"));
    }

    @Test
    public void testSenhaCurta() {
        assertFalse(validatePasswordService.isValid("Ab9!fo"));
    }

    @Test
    public void testSenhaVazia() {
        assertFalse(validatePasswordService.isValid(""));
    }

    @Test
    public void testSenhaSemDigito(){
        assertFalse(validatePasswordService.isValid("AbTp!fok"));
    }

    @Test
    public void testSenhaSemMinuscula(){
        assertFalse(validatePasswordService.isValid("ABTP9!FOK"));
    }

    @Test
    public void testSenhaSemMaiuscula(){
        assertFalse(validatePasswordService.isValid("abtp9!fok"));
    }

    @Test
    public void testSenhaSemCaractEspecial(){
        assertFalse(validatePasswordService.isValid("Abtp98fok"));
    }

    @Test
    public void testSenhaCaractRepetidos() {
        assertFalse(validatePasswordService.isValid("AbTp9!fokAp"));
    }

    @Test
    public void testSenhaCaractRepetidosSeguidos() {
        assertFalse(validatePasswordService.isValid("AAbTp9!fok"));
    }

    @Test
    public void testSenhaComEspaco(){
        assertFalse(validatePasswordService.isValid("AbTp9! fok"));
    }

}