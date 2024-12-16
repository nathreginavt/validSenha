package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ValidSenhaService;

@RestController
@RequestMapping("/senha")
public class ValidSenhaController {

    @Autowired
    private ValidSenhaService validSenhaService;

    @PostMapping("/validar/{senha}")
    public boolean validarSenha(@PathVariable String senha) {
        boolean senhaValida = validSenhaService.isValid(senha);
        return senhaValida;
    }

}
