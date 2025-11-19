/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author chris
 */
/**
 * Maneja la lista de productos del sistema.
 * El administrador da de alta productos en este inventario.
 */
public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo producto a la lista.
     */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    /**
     * Devuelve la lista completa de productos (para mostrar en el admin).
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Busca un producto por su ID.
     */
    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null; // No encontrado
    }

}
