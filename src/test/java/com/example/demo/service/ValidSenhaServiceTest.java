package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidSenhaServiceTest {

    private final ValidSenhaService validSenhaService = new ValidSenhaService();

    @Test
    public void testSenhaValida(){
        assertTrue(validSenhaService.isValid("AbTp9!fok"));
    }

    @Test
    public void testSenhaCurta() {
        assertFalse(validSenhaService.isValid("Ab9!fo"));
    }

    @Test
    public void testSenhaVazia() {
        assertFalse(validSenhaService.isValid(""));
    }

    @Test
    public void testSenhaSemDigito(){
        assertFalse(validSenhaService.isValid("AbTp!fok"));
    }

    @Test
    public void testSenhaSemMinuscula(){
        assertFalse(validSenhaService.isValid("ABTP9!FOK"));
    }

    @Test
    public void testSenhaSemMaiuscula(){
        assertFalse(validSenhaService.isValid("abtp9!fok"));
    }

    @Test
    public void testSenhaSemCaractEspecial(){
        assertFalse(validSenhaService.isValid("Abtp98fok"));
    }

    @Test
    public void testSenhaCaractRepetidos() {
        assertFalse(validSenhaService.isValid("AAbTp9!fok"));
    }

    @Test
    public void testSenhaComEspaco(){
        assertFalse(validSenhaService.isValid("AbTp9! fok"));
    }

}