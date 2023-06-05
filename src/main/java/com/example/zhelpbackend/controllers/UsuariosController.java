package com.example.zhelpbackend.controllers;

import com.example.zhelpbackend.Services.UsuariosRepository;
import com.example.zhelpbackend.models.Usuarios.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuariosController {
    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/usuarios")
    public List<Usuarios> listadoUsuarios() {
        return usuariosRepository.findAll();
    }
}
