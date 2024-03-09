package com.tienda.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data // Tipo Data 
@Entity //Identidad
@Table(name = "producto") //Nombre de la tabla

public class producto implements Serializable { 


    private static final long serialVersionUID = 1L; 

    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_producto") 
    private long idproducto; 
    private long idCategoria;
    private String descripcion; 
    private String detalle; 
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;


    public producto() {
    }
    
    public producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}

