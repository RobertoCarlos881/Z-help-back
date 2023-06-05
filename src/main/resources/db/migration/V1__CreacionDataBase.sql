CREATE TABLE Usuarios(
                         id SERIAL NOT NULL PRIMARY KEY,
                         nombre VARCHAR(150) NOT NULL,
                         apellido_paterno VARCHAR(150) NOT NULL,
                         apellido_materno VARCHAR(150) NOT NULL,
                         email VARCHAR(100) NOT NULL,
                         institucion VARCHAR(150) NOT NULL,
                         identificador_politecnico VARCHAR(150) NOT NULL,
                         numero_telefonico VARCHAR(150) NOT NULL,
                         password varchar(256) NOT NULL,
                         foto varchar(256)
);

CREATE TABLE Publicaciones(
                              id_publicaciones SERIAL NOT NULL PRIMARY KEY,
                              archivo_imagen varchar(256),
                              latitud VARCHAR(150),
                              longitud VARCHAR(150),
                              texto_publicacion VARCHAR(256) NOT NULL,
                              id_usuario int not null,
                              fecha_generada time not null,
                              fecha_publicacion time not null,
                              CONSTRAINT PublicacionesID FOREIGN KEY (id_usuario) REFERENCES Usuarios (id)
);

CREATE TABLE PublicacionesGuardadas(
                                       id_publicacionesguardadas SERIAL NOT NULL PRIMARY KEY,
                                       id_usuario int not null,
                                       id_publicacion int not null,
                                       CONSTRAINT PublicacionGuardadasID FOREIGN KEY (id_usuario) REFERENCES Usuarios (id),
                                       CONSTRAINT PublicacionesOrigenID FOREIGN KEY (id_publicacion) REFERENCES Publicaciones (id_publicaciones)
);

CREATE TABLE RespuestaPublicacion(
                                     id_respuestapublicaciones SERIAL NOT NULL PRIMARY KEY,
                                     archivo_imagen varchar(256),
                                     latitud VARCHAR(150),
                                     longitud VARCHAR(150),
                                     texto_publicacion VARCHAR(256) NOT NULL,
                                     fecha_generada time not null,
                                     fecha_publicacion time not null,
                                     id_usuario int not null,
                                     id_publicacion int not null,
                                     CONSTRAINT PublicacionesRespuestaID FOREIGN KEY (id_usuario) REFERENCES Usuarios (id),
                                     CONSTRAINT PublicacionIDOrigen FOREIGN KEY (id_publicacion) REFERENCES Publicaciones (id_publicaciones)
);

CREATE TABLE Contactos(
                          id_contacto SERIAL NOT NULL PRIMARY KEY,
                          id_usuario int not null,
                          nombre_contacto varchar(256) not null,
                          numero_contacto varchar(256) not null,
                          CONSTRAINT ContactosID FOREIGN KEY (id_usuario) REFERENCES Usuarios (id)
);

CREATE TABLE Actividad(
                          id_actividad SERIAL NOT NULL PRIMARY KEY,
                          accion boolean not null,
                          latitud VARCHAR(150) not null,
                          longitud VARCHAR(150) not null,
                          fecha time not null,
                          activo boolean not null,
                          id_usuario int not null,
                          CONSTRAINT ActividadID FOREIGN KEY (id_usuario) REFERENCES Usuarios (id)
);

CREATE TABLE ActividadCercana(
                                 id_actividadcercana SERIAL NOT NULL PRIMARY KEY,
                                 fecha time not null,
                                 id_usuario int not null,
                                 id_actividadprincipal int not null,
                                 CONSTRAINT AlertaID FOREIGN KEY (id_usuario) REFERENCES Usuarios (id),
                                 CONSTRAINT ActividadesID FOREIGN KEY (id_actividadprincipal) REFERENCES Actividad (id_actividad)
);

CREATE TABLE Instituciones(
                              id_institucion SERIAL NOT NULL PRIMARY KEY,
                              nombre_institucion VARCHAR(150) not null,
                              zona_geografica VARCHAR(256) not null
);