/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao;

import java.util.List;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

/** 
 * @author vmarzal
 */
public interface IUsuarioDAO {

    /**
     * Método para guardar un nuevo usuario
     * 
     * @param usuario
     * @return true si el usuario se ha creado con éxito
     */
    Boolean guardarUsuario(Usuario usuario);
    
    /**
     * Método para actualizar un nuevo usuario
     * 
     * @param usuario
     * @return true si el usuario se ha actualizado con éxito
     */
    Boolean actualizarUsuario(Usuario usuario);
    
    /**
     * Método para obtener un usuario a partir del login
     * 
     * @param login
     * @return el usuario buscado
     */
    Usuario obtenerUsuario(String login);
    
    /**
     * Método que devuelve todos los usuarios
     * 
     * @return todos los usuarios
     */
    List<Usuario> obtenerTodosLosUsuarios();
    
}
