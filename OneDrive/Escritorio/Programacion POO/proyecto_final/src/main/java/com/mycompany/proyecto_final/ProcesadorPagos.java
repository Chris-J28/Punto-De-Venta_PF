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
 * Clase de apoyo para procesar pagos de forma polimórfica.
 * Acepta cualquier objeto que sea de tipo Pago.
 */
public class ProcesadorPagos {
    /**
     * Procesa un pago sin importar si es tarjeta, PayPal o efectivo.
     */
    public boolean procesarPago(Pago pago) {
        boolean exito = pago.realizarPago();

        if (exito) {
            System.out.println("El pago fue procesado correctamente.");
        } else {
            System.out.println("Hubo un problema al procesar el pago.");
        }

        return exito;
    }
}
