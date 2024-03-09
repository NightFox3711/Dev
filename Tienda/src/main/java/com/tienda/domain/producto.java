package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data // Tipo Data 
@Entity //Identidad
@Table(name = "producto") //Nombre de la tabla

//Almacenar la información
public class producto implements Serializable { //serializacion porque se va almacenar ciertos datos en el disco

    //Autoincrementelo uno, id1, id2, id3...
    private static final long serialVersionUID = 1L; 

    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que estrategia usan, identico a la BD 
    @Column(name = "id_producto") //decir cual es el nombre en la base de datos. Se hace la asociación 
    private long idproducto; 
    private long idCategoria; 
    private String descripcion; 
    private String detalle; 
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;

    // Constructor con y sin parametros 
    public producto() {
    }
    
    public producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}

