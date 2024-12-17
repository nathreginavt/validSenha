package com.example.demo.service;
import org.springframework.stereotype.Service;

@Service
public class ValidSenhaService {

    public boolean isValid(String senha){

        if(senha == null || senha.length() < 9 || senha.contains(" ") ){
            return false;
        }

        boolean temDigito = senha.matches(".*[0-9].*");
        boolean temMaiuscula = senha.matches(".*[A-Z].*");
        boolean temMinuscula = senha.matches(".*[a-z].*");
        boolean temCaracterEspecial = senha.matches(".*[!@#$%^&*()-+].*");
        boolean naoRepete = !senha.matches(".*(.)\\1.*");

        return temDigito && temMaiuscula && temMinuscula 
            && temCaracterEspecial && naoRepete; 

    }
}