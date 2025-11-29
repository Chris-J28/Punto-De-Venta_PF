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
    
     private String correo;
    private String contrasena;

    
     // Crea un pago PayPal.
     
    public PagoPayPal(double monto, String correo, String contrasena) {
        super(monto);
        this.correo = correo;
        this.contrasena = contrasena;
    }
//Polimorfismoo de mensaje
    @Override
    public String realizarPago() {
        // Simulación de pago exitoso con PayPal.
        return "Pago con PAYPAL confirmado.\n"
             + "Cuenta: " + correo + "\n"
             + "Monto: $" + String.format("%.2f", monto);
    }
}
