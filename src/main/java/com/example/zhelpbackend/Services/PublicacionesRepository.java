package com.example.zhelpbackend.Services;

import com.example.zhelpbackend.models.Publicaciones.Publicaciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicacionesRepository extends JpaRepository<Publicaciones, Integer> {
}
