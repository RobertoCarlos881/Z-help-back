package com.example.zhelpbackend.models.Publicaciones;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Table(name="Publicaciones")
@Entity(name="Publicaciones")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Publicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_publicaciones;
    private String archivo_imagen;
    private String latitud;
    private String longitud;
    private String texto_publicacion;
    private Date fecha_generada;
    private Date fecha_publicacion;
    private int id_usuario;
}
