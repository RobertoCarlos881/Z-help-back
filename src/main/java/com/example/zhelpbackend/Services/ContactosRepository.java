package com.example.zhelpbackend.Services;

import com.example.zhelpbackend.models.Contactos.Contactos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactosRepository extends JpaRepository<Contactos, Integer> {
}
