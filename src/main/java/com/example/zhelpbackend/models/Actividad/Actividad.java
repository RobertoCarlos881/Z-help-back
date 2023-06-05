package com.example.zhelpbackend.models.Actividad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Table(name="Actividad")
@Entity(name="Actividad")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_actividad;
    private Boolean accion;
    private String latitud;
    private String longitud;
    private Date fecha;
    private Boolean activo;
    private int id_usuario;
}
