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
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import uv.es.ligaajedrez.modelo.dao.IUsuarioDAO;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

/** 
 * @author vmarzal
 */
@Slf4j
public class MySQLUsuarioDAO implements IUsuarioDAO {

    private DataSource ds;
    
    public MySQLUsuarioDAO(DataSource ds) {
        this.ds = ds;
    }

    public MySQLUsuarioDAO() {
        super();        
    }
    
    @Override
    public Boolean guardarUsuario(Usuario usuario) {                                
        ResultSet resultados = null;
        try {            
            Connection conexionBD = ds.getConnection();
            
            Statement stmt = conexionBD.createStatement();
            
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
                                                              
            preparedStmt.executeQuery();
            return true;
            
        } catch (SQLException e) { 
            e.printStackTrace();
            log.error("No se ha completado la operación");            
        }
        return false; 
    }
    
    @Override
    public Usuario obtenerUsuario(String login) {
        try (Connection conexionBD = ds.getConnection()) {
            
            PreparedStatement stmt = conexionBD.prepareStatement("SELECT * FROM usuarios WHERE login = ?");
            stmt.setString(1, login);
            
            ResultSet rs = stmt.executeQuery();
            if (!rs.first()) {
                return null;
            }
            
            Usuario usuario = new Usuario();
            usuario.setLogin(rs.getString(1));
            usuario.setPassword(rs.getString(2));
            usuario.setDNI(rs.getString(3));            
            usuario.setNombre(rs.getString(4));
            usuario.setApellidos(rs.getString(5));
            usuario.setEmail(rs.getString(6));
            usuario.setTelefono(rs.getString(7));
            usuario.setDireccion(rs.getString(8));
            usuario.setFechaNacimiento(LocalDate.parse(rs.getString(9)));
                                                
            return usuario;
            
        } catch (SQLException e) {
            e.printStackTrace();
            log.error("No se ha completado la operación");            
        } 
        return null;
    }

    @Override
    public Boolean actualizarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
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
}
