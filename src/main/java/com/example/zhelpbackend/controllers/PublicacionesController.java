package com.example.zhelpbackend.controllers;

import com.example.zhelpbackend.Services.PublicacionesRepository;
import com.example.zhelpbackend.models.Publicaciones.Publicaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PublicacionesController {
    @Autowired
    PublicacionesRepository publicacionesRepository;

    @GetMapping("/publicaciones")
    public List<Publicaciones> listadoPublicaciones() {
        return publicacionesRepository.findAll();
    }
}
