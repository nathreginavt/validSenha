package com.example.demo.service;
import org.springframework.stereotype.Service;

@Service
public class ValidSenhaService{

    public boolean isValid(String senha){

        boolean temQtdCaracteres = senha.length() >= 9;
        boolean temDigito = senha.matches(".*[0-9].*");
        boolean temMaiuscula = senha.matches(".*[A-Z].*");
        boolean temMinuscula = senha.matches(".*[a-z].*");
        boolean temCaracterEspecial = senha.matches(".*[!@#$%^&*()-+].*");
        boolean naoRepete = !senha.matches(".*(.)\\1.*");  //nao funciona
        boolean naoTemEspacos = !senha.contains(" ");

        return temQtdCaracteres && temDigito &&
                 temMaiuscula && temMinuscula && temCaracterEspecial &&
                  naoRepete && naoTemEspacos; 

    }
}