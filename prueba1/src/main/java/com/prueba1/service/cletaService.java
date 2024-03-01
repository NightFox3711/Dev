package com.prueba1.service;

import com.prueba1.domain.cleta;
import java.util.List;

public interface cletaService {

    // Se obtiene un listado de cletas en un List
    public List<cleta> getcletas(boolean activos);

    // Se obtiene un cleta, a partir del id de un cleta
    public cleta getcleta(cleta cleta);

    // Se inserta un nuevo cleta si el id del cleta esta vacío
    // Se actualiza un cleta si el id del cleta NO esta vacío
    public void save(cleta cleta);

    // Se elimina el cleta que tiene el id pasado por parámetro
    public void delete(cleta cleta);

}
