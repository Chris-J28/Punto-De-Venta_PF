/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;
import java.time.LocalDateTime;
/**
 *
 * @author chris
 */
/**
 * Representa una venta realizada en el sistema.
 * Contiene el carrito, la forma de pago y la fecha.
 */
public class Venta {
    
    private Carrito carrito;
    private Pago pago;
    private LocalDateTime fecha;

    public Venta(Carrito carrito, Pago pago) {
        this.carrito = carrito;
        this.pago = pago;
        this.fecha = LocalDateTime.now();
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public Pago getPago() {
        return pago;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

}
