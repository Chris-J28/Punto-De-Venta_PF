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
 * Clase que centraliza los datos del sistema.
 * Aquí se guarda el inventario y los usuarios.
 * Es una forma sencilla de que todos los Frames compartan la misma información.
 */
public class Sistema {
    
    public static Inventario inventario = new Inventario();
    public static List<Cliente> clientes = new ArrayList<>();
    public static Administrador admin = new Administrador("Administrador", "admin", "1234");

    /**
     * Busca un cliente por su nombre de usuario.
     */
    public static Cliente buscarClientePorUsuario(String usuario) {
        for (Cliente c : clientes) {
            if (c.getUsuario().equals(usuario)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Registra un nuevo cliente en el sistema.
     */
    public static void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
