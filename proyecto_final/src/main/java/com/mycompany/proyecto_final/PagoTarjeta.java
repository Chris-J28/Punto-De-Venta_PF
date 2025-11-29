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
 * Representa un pago realizado con tarjeta de crédito o débito.
 */
public class PagoTarjeta extends Pago {
    
    private String numeroTarjeta;
    private String nombreTitular;
    private String cvv;
    private String fechaExp;
//Crea un pago con tarjeta.
    public PagoTarjeta(double monto, String numeroTarjeta,
                       String nombreTitular, String cvv, String fechaExp) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
        this.fechaExp = fechaExp;
    }

    @Override
    public String realizarPago() {
      return "Pago con tarjeta aprobado.\n" +
            "Titular: " + nombreTitular +
           "\nMonto: $" + String.format("%.2f", monto);
        
    }
    
}

