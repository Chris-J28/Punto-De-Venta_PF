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
 * Representa a un cliente del sistema.
 * Puede tener un historial de compras (ventas realizadas).
 */
public class Cliente extends Usuario {
       private List<Venta> comprasRealizadas;
    public Cliente(String nombre, String usuario, String password) {
        super(nombre, usuario, password);
         this.comprasRealizadas = new ArrayList<>();
    }
    public void agregarCompra(Venta venta) {
        comprasRealizadas.add(venta);
    }

    public List<Venta> getComprasRealizadas() {
        return comprasRealizadas;
    }

    Object getUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
