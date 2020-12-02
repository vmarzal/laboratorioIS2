/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.usuarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import uv.es.ligaajedrez.modelo.Club;
import uv.es.ligaajedrez.modelo.Federacion;
import uv.es.ligaajedrez.modelo.Sede;
import uv.es.ligaajedrez.modelo.Torneo;

/** 
 * @author vmarzal
 */
public class JugadorTest {
    
    public JugadorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    private Jugador jugadorTest1, jugadorTest2, jugadorTest3;
    
    @BeforeEach
    public void setUp() {
        Torneo torneo = new Torneo("Torneo internacional de Murcia", Federacion.FEDERACION_MURCIANA);
          
        Sede sedeValencia = Sede.builder().nombre("Valencia").direccion("C/ de Guillem de Castro, 65")
                .telefono("963153005").build();                
        
        Club clubInicial = new Club("Source club", sedeValencia, Federacion.FEDERACION_VALENCIANA);
                        
        jugadorTest1 = Jugador.builder().login("ezz").password("ezz").nombre("Ezzideen").apellidos("Naasan")
                .DNI("1111111111").torneo(torneo).club(clubInicial).build();

        jugadorTest2 = Jugador.builder().login("adri").password("adri").nombre("Adrian").apellidos("Cozma")
                .DNI("2222222222").torneo(torneo).build();

        jugadorTest3 = Jugador.builder().login("vic").password("vic").nombre("Victor").apellidos("Marzal Llopis")
                .DNI("3333333333").torneo(torneo).build();
        
    }      
    
    @Test
    public void testApuntarseTorneo() {
        System.out.println("apuntarseTorneo");                        
        boolean result = jugadorTest3.apuntarseTorneo();
        assertTrue(result);
    }
    
    @Test
    public void testDesapuntarseTorneo() {
        System.out.println("desapuntarseTorneo");                        
        boolean result = jugadorTest3.desapuntarseTorneo();
        assertFalse(result);        
    }
    
    @Test
    public void testCambiarClub() {
        System.out.println("cambiarClub");
        
        Sede sedeMurcia = Sede.builder().nombre("Murcia").direccion("C/ Mayor, 65")
                .telefono("8682143105").build();
        Club clubFinal = new Club("Target club", sedeMurcia, Federacion.FEDERACION_MURCIANA);
        
        // Primero comprobamos que el jugadorTest1 pertenece al club inicial
        assertEquals(jugadorTest1.getClub().getSede().getNombre(), "Valencia");
        
        // Cambiamos al jugador de Club
        jugadorTest1.cambiarClub(clubFinal);
        
        // Comprobamos su nueva sede
        assertEquals(jugadorTest1.getClub().getSede().getNombre(), "Murcia");               
    }
        
}