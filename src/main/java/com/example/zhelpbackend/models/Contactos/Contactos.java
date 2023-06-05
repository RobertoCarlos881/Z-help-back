package com.example.zhelpbackend.models.Contactos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Table(name="Contactos")
@Entity(name="Contactos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Contactos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_contacto;
    private int id_usuario;
    private String nombre_contacto;
    private String numero_contacto;
}
