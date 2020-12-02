/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

/**
 * @author vmarzal
 */
@Slf4j
@ExtendWith(MockitoExtension.class)
public class MySQLUsuarioDAOTest {

    @Mock
    private DataSource ds;

    @Mock
    private Connection connection;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private ResultSet resultSet;

    private Usuario usuario;

    @BeforeEach
    public void setUp() throws Exception {
        assertNotNull(ds);

        when(connection.prepareStatement(any(String.class))).thenReturn(stmt);
        when(ds.getConnection()).thenReturn(connection);

        usuario = new Usuario();
        usuario.setLogin("test");
        usuario.setNombre("NOMBRE PRUEBA");
        usuario.setApellidos("APELLIDOS PRUEBA");
        usuario.setDNI("XXXXXXXXXXXXXXXXX");
        usuario.setDireccion("direccionTest");
        usuario.setTelefono("telefonoTest");
        usuario.setEmail("emailTest");
        usuario.setFechaNacimiento(LocalDate.now());

    }

    @Test
    public void testGuardarYObtenerUsuario() throws SQLException {
        when(resultSet.first()).thenReturn(true);
        when(resultSet.getString(1)).thenReturn(usuario.getLogin());
        when(resultSet.getString(2)).thenReturn(usuario.getPassword());
        when(resultSet.getString(3)).thenReturn(usuario.getDNI());
        when(resultSet.getString(4)).thenReturn(usuario.getNombre());
        when(resultSet.getString(5)).thenReturn(usuario.getApellidos());
        when(resultSet.getString(6)).thenReturn(usuario.getEmail());
        when(resultSet.getString(7)).thenReturn(usuario.getTelefono());
        when(resultSet.getString(8)).thenReturn(usuario.getDireccion());
        when(resultSet.getString(9)).thenReturn(usuario.getFechaNacimiento().toString());

        when(stmt.executeQuery()).thenReturn(resultSet);

        MySQLUsuarioDAO dao = new MySQLUsuarioDAO(ds);
        assertTrue(dao.guardarUsuario(usuario));

        Usuario result = dao.obtenerUsuario("test");
        assertEquals(usuario.getNombre(), result.getNombre());
    }

    @Test
    public void testObtenerUsuarioNotFound() throws SQLException {
        when(resultSet.first()).thenReturn(false);
        when(stmt.executeQuery()).thenReturn(resultSet);

        MySQLUsuarioDAO dao = new MySQLUsuarioDAO(ds);
        dao.guardarUsuario(usuario);

        Usuario result = dao.obtenerUsuario("notFound");
        assertNull(result);
    }

}
