/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.usuarios;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Usuario {

    protected String login;
    protected String password;
    
    protected String DNI, nombre, apellidos, email, telefono, direccion;
    protected LocalDate fechaNacimiento;
   
    protected Usuario(Usuario orig) {
        this.login = orig.getLogin();
        this.password = orig.getPassword();
        this.DNI = orig.getDNI();
        this.nombre = orig.getNombre();
        this.apellidos = orig.getApellidos();
        this.email = orig.getEmail();
        this.telefono = orig.getTelefono();
        this.direccion = orig.getDireccion();
        this.fechaNacimiento = orig.getFechaNacimiento();                
    }
    
    public String toString() {
        return "(login=" + login + ", password=" + password + ")";
    }
    
}