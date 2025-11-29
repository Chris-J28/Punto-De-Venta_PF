/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
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
    // Inventario general del sistema
    public static Inventario inventario = new Inventario();
     // Lista de clientes registrados
    public static List<Cliente> clientes = new ArrayList<>();
    // Administrador del sistema (usuario y contraseña fijos por ahora)
    public static Administrador admin = new Administrador("Administrador", "admin", "1234");
     //carritos por usuario (clave = nombreUsuario)
    private static Map<String, Carrito> carritosPorUsuario = new HashMap<>();
//Validar si las crednciales para ingresar a dmin esta bien
    public static boolean validarCredencialesAdmin(String usuario, String password) {
    return admin.getUsuario().equals(usuario) &&
           admin.getPassword().equals(password);}
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
    /**
     * Devuelve el carrito asociado a un cliente.
     * Si el cliente aún no tiene carrito, se crea uno nuevo y se guarda.
     *
     * @param cliente Cliente para el cual se desea obtener el carrito.
     * @return Carrito correspondiente a ese cliente.
     */
    public static Carrito obtenerCarritoParaCliente(Cliente cliente) {
        if (cliente == null) {
            return null;
        }

        String usuario = cliente.getUsuario();
        Carrito carrito = carritosPorUsuario.get(usuario);

        if (carrito == null) {
            carrito = new Carrito();
            carritosPorUsuario.put(usuario, carrito);
        }

        return carrito;
    }
}
