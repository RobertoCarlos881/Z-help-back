package com.example.zhelpbackend.Services;

import com.example.zhelpbackend.models.PublicacionesGuardadas.PublicacionesGuardadas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicacionesGuardadasRepository extends JpaRepository<PublicacionesGuardadas, Integer> {
}
