/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao.impl;

import java.util.Arrays;
import java.util.List;
import uv.es.ligaajedrez.modelo.dao.IUsuarioDAO;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

/** 
 * @author vmarzal
 */
public class XMLUsuarioDAO implements IUsuarioDAO {

    @Override
    public Boolean guardarUsuario(Usuario usuario) {
        return true;
    }

    @Override
    public Boolean actualizarUsuario(Usuario usuario) {
        return true;
    }

    @Override
    public Usuario obtenerUsuario(String login) {
        return new Usuario();
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return Arrays.asList(new Usuario());
    }
    
}
