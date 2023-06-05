package com.example.zhelpbackend.controllers;

import com.example.zhelpbackend.Services.ActividadCercanaRepository;
import com.example.zhelpbackend.models.ActividadCercana.ActividadCercana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ActividadCercanaController {
    @Autowired
    private ActividadCercanaRepository actividadCercanaRepository;

    @GetMapping("/actividadCercana")
    public List<ActividadCercana> listadoActividadesCercanas() {
        return actividadCercanaRepository.findAll();
    }
}
