package com.example.zhelpbackend.models.PublicacionesGuardadas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="PublicacionesGuardadas")
@Entity(name="PublicacionesGuardadas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PublicacionesGuardadas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_publicacionesguardadas;
    private int id_usuario;
    private int id_publicacion;
}
