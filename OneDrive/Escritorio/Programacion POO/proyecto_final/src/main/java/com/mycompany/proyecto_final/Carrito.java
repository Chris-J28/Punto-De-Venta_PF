/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author chris
 */
/**
 * Carrito de compras de un cliente.
 * Contiene productos y cantidades.
 */
public class Carrito {
    
    // Mapa: Producto -> cantidad
    private Map<Producto, Integer> items;

    public Carrito() {
        this.items = new HashMap<>();
    }

    /**
     * Agrega un producto al carrito.
     */
    public void agregarProducto(Producto p, int cantidad) {
        if (items.containsKey(p)) {
            items.put(p, items.get(p) + cantidad);
        } else {
            items.put(p, cantidad);
        }
    }

    /**
     * Calcula el total a pagar del carrito.
     */
    public double calcularTotal() {
        double total = 0.0;
        for (Map.Entry<Producto, Integer> entry : items.entrySet()) {
            Producto p = entry.getKey();
            int cantidad = entry.getValue();
            total += p.getPrecio() * cantidad;
        }
        return total;
    }

    public Map<Producto, Integer> getItems() {
        return items;
    }
}
