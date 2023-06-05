package com.example.zhelpbackend.controllers;

import com.example.zhelpbackend.Services.ActividadRepository;
import com.example.zhelpbackend.models.Actividad.Actividad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ActividadController {
    @Autowired
    private ActividadRepository actividadRepository;

    @GetMapping("/actividad")
    public List<Actividad> listadoActividades() {
        return actividadRepository.findAll();
    }
}
