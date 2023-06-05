package com.example.zhelpbackend.Services;

import com.example.zhelpbackend.models.Usuarios.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
}
