/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.usuarios;

import java.time.LocalDate;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString
@SuperBuilder
public class Usuario {

    protected String login;
    protected String password;
    
    protected String DNI, nombre, apellidos, email, telefono, direccion;
    protected LocalDate fechaNacimiento;
   
}