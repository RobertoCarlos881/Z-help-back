package com.example.zhelpbackend.Services;

import com.example.zhelpbackend.models.RespuestaPublicacion.RespuestaPublicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaPublicacionRepository extends JpaRepository<RespuestaPublicacion, Integer> {
}
