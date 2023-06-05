package com.example.zhelpbackend.models.Instituciones;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Table(name="Instituciones")
@Entity(name="Instituciones")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Instituciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_institucion;
    private String nombre_institucion;
    private String zona_geografica;
}
