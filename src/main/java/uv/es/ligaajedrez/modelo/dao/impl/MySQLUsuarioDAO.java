/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.ZoneId;
import java.util.List;
import java.util.TimeZone;
import uv.es.ligaajedrez.modelo.dao.IUsuarioDAO;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

/** 
 * @author vmarzal
 */
public class MySQLUsuarioDAO implements IUsuarioDAO {

    private Connection obtenerConexion() {
        Connection conexionBD = null;
        
        String bd = "jdbc:mysql://localhost/practicaIS2?serverTimezone=" + TimeZone.getDefault().getID();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
            
            // Conexión usando usuario y clave de administrador de la BD
            conexionBD = DriverManager.getConnection(bd, "vmarzal", "1234");
            
        } catch (Exception e) {
            // Error en la conexión con la BD
            System.out.println("Error de conexión");
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
            String con = "INSERT INTO usuarios VALUES (null,?,?,?,?,?,?,?,?,null)";
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con);
                                                
            preparedStmt.setString(2, usuario.getLogin());
            preparedStmt.setString(3, usuario.getPassword());
            preparedStmt.setString(4, usuario.getDNI());
            preparedStmt.setString(5, usuario.getNombre());
            preparedStmt.setString(6, usuario.getApellidos());
            preparedStmt.setString(7, usuario.getEmail());
            preparedStmt.setString(8, usuario.getTelefono());
            preparedStmt.setString(9, usuario.getDireccion());
                                                              
            preparedStmt.executeUpdate();            
            return true;
            
        } catch (Exception e) { 
            System.out.println("No se ha completado la operación");
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
