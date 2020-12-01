/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.facade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import uv.es.ligaajedrez.modelo.usuarios.Jugador;

/**
 * @author vmarzal
 */
public class AccionesJugadorFacadeTest {
    
    public AccionesJugadorFacadeTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }        

    /**
     * Test of buscarJugador method, of class AccionesJugadorFacade.
     */
    @Test
    public void testBuscarJugador() {
        System.out.println("buscarJugador");
        String loginJugador = "vic";
        AccionesJugadorFacade instance = new AccionesJugadorFacade();
                                
        Jugador expResult = Jugador.builder().login("vic").password("vic").nombre("Victor")
                .apellidos("Marzal Llopis")
                .DNI("3333333333").build();
                                
        Jugador result = instance.buscarJugador(loginJugador);
        assertEquals(expResult.getNombre(), result.getNombre());
        
    }
    
}
