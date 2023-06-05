package com.example.zhelpbackend.controllers;

import com.example.zhelpbackend.Services.InstitucionesRepository;
import com.example.zhelpbackend.models.ActividadCercana.ActividadCercana;
import com.example.zhelpbackend.models.Instituciones.Instituciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class InstitucionesController {
    @Autowired
    private InstitucionesRepository institucionesRepository;

    @GetMapping("/instituciones")
    public List<Instituciones> listadoInstituciones() {
        return institucionesRepository.findAll();
    }
}
