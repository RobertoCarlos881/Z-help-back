package com.example.zhelpbackend.Services;

import com.example.zhelpbackend.models.Actividad.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActividadRepository extends JpaRepository<Actividad, Integer> {
}
