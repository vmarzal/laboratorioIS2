/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uv.es.ligaajedrez.modelo.usuarios.Jugador;

/**
 *
 * @author En10
 */
public class TorneoTest {
    
    public TorneoTest() {
    }

    
    @Test
    public void testAddJugador() {
         //fail("el test falla");
         
         Torneo torneo = new Torneo("Torneo internacional de La Comunidat Valenciana", Federacion.FEDERACION_VALENCIANA);
         Sede sedeValencia = Sede.builder().nombre("Valencia").direccion("C/ de Guillem de Castro, 65")
                .telefono("963153005").build(); 
         Club clubInicial = new Club("Source club", sedeValencia, Federacion.FEDERACION_VALENCIANA);
                        
        Jugador jugadorTest1 = Jugador.builder().login("ezz").password("ezz").nombre("Ezzideen").apellidos("Naasan")
                .DNI("1111111111").torneo(torneo).club(clubInicial).build();
        
        assertTrue(torneo.addJugador(jugadorTest1));
    }

    @Test
    public void testRemoveJugador() {
         //fail("el test falla");
         
         Torneo torneo = new Torneo("Torneo internacional de La Comunidat Valenciana", Federacion.FEDERACION_VALENCIANA);
         Sede sedeValencia = Sede.builder().nombre("Valencia").direccion("C/ de Guillem de Castro, 65")
                .telefono("963153005").build(); 
         Club clubInicial = new Club("Source club", sedeValencia, Federacion.FEDERACION_VALENCIANA);
                        
        Jugador jugadorTest1 = Jugador.builder().login("ezz").password("ezz").nombre("Ezzideen").apellidos("Naasan")
                .DNI("1111111111").torneo(torneo).club(clubInicial).build();
        
        torneo.addJugador(jugadorTest1);
        assertTrue(torneo.removeJugador(jugadorTest1));
    }
   
    
}
