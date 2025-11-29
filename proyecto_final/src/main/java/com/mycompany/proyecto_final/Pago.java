/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;

/**
 *
 * @author chris
 */
/**
 * Clase abstracta que representa un pago.
 * Define el método abstracto realizarPago(), que será implementado
 * de forma diferente por cada tipo de pago.
 */
public abstract class Pago {
    
    protected double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
 /**
     * Método abstracto que ejecuta el pago.
     * Cada subtipo de pago devuelve un mensaje describiendo
     * el resultado del pago (éxito, datos relevantes, etc.).
     *
     * @return Mensaje con el resultado del pago.
     */
    public abstract String realizarPago();
}
