package com.example.zhelpbackend.controllers;

import com.example.zhelpbackend.Services.ContactosRepository;
import com.example.zhelpbackend.models.Contactos.Contactos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactosController {
    @Autowired
    private ContactosRepository contactosRepository;

    @GetMapping("/contactos")
    public List<Contactos> listadoContactos() {
        return contactosRepository.findAll();
    }
}
