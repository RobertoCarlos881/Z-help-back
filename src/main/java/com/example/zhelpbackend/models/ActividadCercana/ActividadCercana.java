package com.example.zhelpbackend.models.ActividadCercana;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Table(name="ActividadCercana")
@Entity(name="ActividadCercana")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ActividadCercana {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_actividadcercana;
    private Date fecha;
    private int id_usuario;
    private int id_actividadprincipal;
}
