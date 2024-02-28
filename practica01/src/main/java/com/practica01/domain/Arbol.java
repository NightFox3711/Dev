package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")

public class Arbol implements Serializable { //serializacion porque se va almacenar ciertos datos en el disco

    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria de los arboles.

    @Id //id arbol es la llave de la tabla categoria. 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que estrategia usan, identico a la BD 
    @Column(name = "id_arbol") //decir cual es el nombre en la base de datos. Se hace la asociación 
    private long idArbol;
    private int durezaMadera;
    private String rutaImagen;
    private String tipoFlor;
    private String nombreComun;
    private String tipoArbol;

    public Arbol() {
    }

    public Arbol(int durezaMadera, String tipoFlor, String nombreComun, String tipoArbol) {
        this.durezaMadera = durezaMadera;
        this.tipoFlor = tipoFlor;
        this.nombreComun = nombreComun;
        this.tipoArbol = tipoArbol;
    }

    
}