package com.example.zhelpbackend.models.Usuarios;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="Usuarios")
@Entity(name="Usuarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String email;
    private String institucion;
    private String identificador_politecnico;
    private String numero_telefonico;
    private String password;
    private String foto;
}
