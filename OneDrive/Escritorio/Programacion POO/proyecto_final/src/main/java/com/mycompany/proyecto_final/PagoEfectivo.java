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
    
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean realizarPago() {
        System.out.println("Pago en EFECTIVO recibido por $" + monto);
        return true;
    }
}
