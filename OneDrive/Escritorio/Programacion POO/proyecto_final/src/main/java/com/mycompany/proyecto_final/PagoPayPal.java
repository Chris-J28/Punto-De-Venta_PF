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
 * Implementa un pago con PayPal.
 */
public class PagoPayPal extends Pago{
    
    private String correoCuenta;

    public PagoPayPal(double monto, String correoCuenta) {
        super(monto);
        this.correoCuenta = correoCuenta;
    }

    @Override
    public boolean realizarPago() {
        System.out.println("Procesando pago con PAYPAL por $" + monto + " de la cuenta " + correoCuenta);
        return true;
    }
}
