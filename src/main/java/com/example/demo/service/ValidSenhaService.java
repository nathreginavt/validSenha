package com.example.demo.service;
import java.util.HashSet;

import org.springframework.stereotype.Service;

@Service
public class ValidSenhaService {

    public boolean isValid(String senha){

        if(senha == null || senha.length() < 9 || senha.contains(" ") ){
            return false;
        }

        HashSet<Character> charSet = new HashSet<>();
        for (char c : senha.toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }

        boolean temDigito = senha.matches(".*[0-9].*");
        boolean temMaiuscula = senha.matches(".*[A-Z].*");
        boolean temMinuscula = senha.matches(".*[a-z].*");
        boolean temCaracterEspecial = senha.matches(".*[!@#$%^&*()-+].*");

        return temDigito && temMaiuscula && temMinuscula && temCaracterEspecial; 

    }
}