/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import uv.es.ligaajedrez.modelo.dao.IUsuarioDAO;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

/** 
 * @author vmarzal
 */
@Slf4j
public class MySQLUsuarioDAO implements IUsuarioDAO {

    public Connection obtenerConexion() {
        Connection conexionBD = null;
        
        String bd = "jdbc:mysql://localhost/practicaIS2";
        try {                        
            // Conexión usando usuario y clave de administrador de la BD
            conexionBD = DriverManager.getConnection(bd, "vmarzal", "1234");
            
        } catch (Exception e) {
            e.printStackTrace();
            // Error en la conexión con la BD
            log.error("Error de conexión");
        }
        return conexionBD;
    }
    
    @Override
    public Boolean guardarUsuario(Usuario usuario) {                
        Connection conexionBD = obtenerConexion();
                
        ResultSet resultados = null;
        try {            
            Statement stm = conexionBD.createStatement();
            
            // Operación de insercion SQL sobre la base de datos                        
            String con = "INSERT INTO usuarios VALUES (null,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con);
                                                            
            preparedStmt.setString(1, usuario.getLogin());
            preparedStmt.setString(2, usuario.getPassword());
            preparedStmt.setString(3, usuario.getDNI());
            preparedStmt.setString(4, usuario.getNombre());
            preparedStmt.setString(5, usuario.getApellidos());
            preparedStmt.setString(6, usuario.getEmail());
            preparedStmt.setString(7, usuario.getTelefono());
            preparedStmt.setString(8, usuario.getDireccion());            
            preparedStmt.setString(9, usuario.getFechaNacimiento().toString());
                                                              
            preparedStmt.executeUpdate();            
            return true;
            
        } catch (Exception e) { 
            e.printStackTrace();
            log.error("No se ha completado la operación");
        }
        return false; 
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
