/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Producto;

/**
 *
 * @author Alumno
 */
public interface ProductoDao {
    void insertarProducto(Producto producto);
    List<Producto> listarProductos();
    Producto obtenerProducto(Integer idProducto);
    void actualizarProducto(Producto producto);
    void eliminarProducto(Integer idProducto);
}
