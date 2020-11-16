/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao.impl;

import java.util.List;
import uv.es.ligaajedrez.modelo.dao.IUsuarioDAO;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

/** 
 * @author vmarzal
 */
public class MySQLUsuarioDAO implements IUsuarioDAO {

    @Override
    public Boolean guardarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Boolean actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Usuario obtenerUsuario(String login) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
