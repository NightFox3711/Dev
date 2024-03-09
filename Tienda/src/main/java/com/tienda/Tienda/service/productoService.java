package com.tienda.Tienda.service;

import com.tienda.Tienda.domain.producto;
import java.util.List;

public interface productoService {

    // Se obtiene un listado de productos en un List
    public List<producto> getproductos(boolean activos);

    // Se obtiene un producto, a partir del id de un producto
    public producto getproducto(producto producto);

    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(producto producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(producto producto);

}
