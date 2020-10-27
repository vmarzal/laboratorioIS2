/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.usuarios;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString
@SuperBuilder
public class Usuario {

    private String login;
    private String password;
    
    public String DNI, nombre, apellidos, email, telefono, direccion;
    protected Date fechaNacimiento;

    public Usuario() {
    }

    
    
    public Usuario(String login, String password, String DNI, String nombre, String apellidos, String email, String telefono, String direccion, Date fechaNacimiento) {
        this.login = login;
        this.password = password;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    
}



