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
// RET = 9
// DET = 0
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
    /* EI
    DET = 1
    FTR = 1
    */
    
    public String toString() {
        return "(login=" + login + ", password=" + password + ")";
    }
    /* EQ
    DET = 0
    FTR = 1
    */
    
}

/* TOTAL USUARIO
    /*  EI
    DET = 1
    FTR = 1
    
        EQ
    DET = 0
    FTR = 1

        EO
    DET = 0
    FTR = 0
    */

/* totales:
EI:     4b 0m 0a
EO:     0b 0m 0a
EQ:     9b 0m 0a
ILF:     1b 0m 0a
ELF:     0b 0m 0a
*/