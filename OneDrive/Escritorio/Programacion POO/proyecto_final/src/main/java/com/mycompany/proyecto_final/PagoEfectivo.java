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
 * Implementa un pago en efectivo.
 */
public class PagoEfectivo extends Pago{
    
  // Crea un pago en efectivo.
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public String realizarPago() {
        // Simulación de registro de pago en efectivo.
        return "Pago en EFECTIVO registrado.\n"
             + "Monto recibido: $" + String.format("%.2f", monto);
    }
}
