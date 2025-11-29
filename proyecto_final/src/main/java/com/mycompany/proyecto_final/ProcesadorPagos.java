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
 * Clase de utilidad que procesa pagos de forma polimórfica.
 *
 * El método procesarPago recibe cualquier objeto que herede de Pago
 * (PagoTarjeta, PagoPayPal, PagoEfectivo, etc.) y llama a realizarPago()
 * sin saber de qué tipo de pago se trata.
 */
public class ProcesadorPagos {
   
    // Procesa el pago recibido usando polimorfismo.   
    public static String procesarPago(Pago pago) {
        return pago.realizarPago();
    }
}
