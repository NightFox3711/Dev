/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.Tienda.dao;
import com.tienda.Tienda.domain.producto;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author NightFox
 */
public interface productoDao extends JpaRepository <producto,Long> {
    
}
