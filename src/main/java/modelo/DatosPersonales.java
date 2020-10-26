/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ezzedine
 */
public class DatosPersonales {
    public String DNI, nombre, apellidos, email, telefono, direccion;

    public DatosPersonales(String DNI, String nombre, String apellidos, String email, String telefono, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
}
