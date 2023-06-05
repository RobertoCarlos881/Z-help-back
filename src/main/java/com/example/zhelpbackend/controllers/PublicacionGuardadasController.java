package com.example.zhelpbackend.controllers;

import com.example.zhelpbackend.Services.PublicacionesGuardadasRepository;
import com.example.zhelpbackend.models.PublicacionesGuardadas.PublicacionesGuardadas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PublicacionGuardadasController {
    @Autowired
    private PublicacionesGuardadasRepository publicacionesGuardadasRepository;

    @GetMapping("/publicacionesGuardadas")
    public List<PublicacionesGuardadas> listadoPublicacionesGuardadas() {
        return publicacionesGuardadasRepository.findAll();
    }
}
