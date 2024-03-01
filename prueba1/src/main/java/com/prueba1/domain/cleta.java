package com.prueba1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "cleta")
public class cleta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cleta")
    private long idCleta;

    private String modelo;
    private double tope;
    private int salidaCleta;
    private String imagen;
    

    public cleta() {
    }

    public cleta(String modelo, double tope, int salidaCleta, String imagen) {
        this.modelo = modelo;
        this.tope = tope;
        this.salidaCleta = salidaCleta;
        this.imagen = imagen;
        
    }
}
