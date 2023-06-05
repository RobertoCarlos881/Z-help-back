package com.example.zhelpbackend.controllers;

import com.example.zhelpbackend.Services.RespuestaPublicacionRepository;
import com.example.zhelpbackend.models.RespuestaPublicacion.RespuestaPublicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RespuestaPublicacionController {
    @Autowired
    private RespuestaPublicacionRepository respuestaPublicacionRepository;

    @GetMapping("/respuestaPublicacion")
    public List<RespuestaPublicacion> listadoRespuestaPublicaciones() {
        return respuestaPublicacionRepository.findAll();
    }
}
