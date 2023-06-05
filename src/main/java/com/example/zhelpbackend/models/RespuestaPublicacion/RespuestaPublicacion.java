package com.example.zhelpbackend.models.RespuestaPublicacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Table(name="RespuestaPublicacion")
@Entity(name="RespuestaPublicacion")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RespuestaPublicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_respuestapublicaciones;
    private String archivo_imagen;
    private String latitud;
    private String longitud;
    private String texto_publicacion;
    private Date fecha_generada;
    private Date fecha_publicacion;
    private int id_usuario;
    private int id_publicacion;
}
