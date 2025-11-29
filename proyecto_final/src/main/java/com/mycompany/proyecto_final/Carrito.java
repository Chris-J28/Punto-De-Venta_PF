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
 * Representa el carrito de compras de un cliente.
 * 
 * El carrito está compuesto por varias "líneas", donde cada línea
 * contiene un producto y la cantidad de ese producto que se desea comprar.
 */
public class Carrito {

    /**
     * Clase interna que representa una línea del carrito.
     * Contiene un producto y la cantidad de dicho producto.
     */
    public static class LineaCarrito {
        private Producto producto;
        private int cantidad;

        /**
         * Crea una nueva línea de carrito.
         * 
         * @param producto Producto asociado a la línea
         * @param cantidad Cantidad de ese producto
         */
        public LineaCarrito(Producto producto, int cantidad) {
            this.producto = producto;
            this.cantidad = cantidad;
        }

        public Producto getProducto() {
            return producto;
        }

        public void setProducto(Producto producto) {
            this.producto = producto;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        /**
         * Calcula el subtotal de esta línea: precio del producto por cantidad.
         * 
         * @return subtotal de la línea
         */
        public double getSubtotal() {
            return producto.getPrecio() * cantidad;
        }
    }

    /** Lista de líneas que componen el carrito. */
    private List<LineaCarrito> lineas;

    /**
     * Constructor por defecto.
     * Crea un carrito vacío (sin productos).
     */
    public Carrito() {
        this.lineas = new ArrayList<>();
    }

    /**
     * Devuelve la lista de líneas del carrito.
     * 
     * @return lista de LineaCarrito
     */
    public List<LineaCarrito> getLineas() {
        return lineas;
    }

    /**
     * Agrega un producto al carrito.
     * Si el producto ya existe en el carrito, simplemente aumenta la cantidad.
     * 
     * @param producto Producto a agregar
     * @param cantidad Cantidad a agregar
     */
    public void agregarProducto(Producto producto, int cantidad) {
        // Verificar si el producto ya está en alguna línea del carrito
        for (LineaCarrito linea : lineas) {
            if (linea.getProducto().getId() == producto.getId()) {
                // Si ya existe, sumamos la cantidad
                linea.setCantidad(linea.getCantidad() + cantidad);
                return;
            }
        }

        // Si no existe, creamos una nueva línea
        LineaCarrito nuevaLinea = new LineaCarrito(producto, cantidad);
        lineas.add(nuevaLinea);
    }

    /**
     * Quita del carrito cualquier línea que tenga el producto indicado.
     * 
     * @param producto Producto que se desea quitar del carrito
     */
    public void quitarProducto(Producto producto) {
        if (producto == null) {
            return;
        }

        // removeIf elimina cualquier línea cuyo producto tenga el mismo ID
        lineas.removeIf(linea -> linea.getProducto().getId() == producto.getId());
    }

    /**
     * Elimina todas las líneas del carrito, dejándolo vacío.
     */
    public void vaciar() {
        lineas.clear();
    }

    /**
     * Calcula el total del carrito sumando los subtotales de todas las líneas.
     * 
     * @return total a pagar por todos los productos del carrito
     */
    public double calcularTotal() {
        double total = 0.0;
        for (LineaCarrito linea : lineas) {
            total += linea.getSubtotal();
        }
        return total;
    }
}
