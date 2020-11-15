/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.facade;

import java.util.Date;
import uv.es.ligaajedrez.modelo.DatosLigaAjedrez;
import uv.es.ligaajedrez.modelo.Partida;
import uv.es.ligaajedrez.modelo.usuarios.Jugador;

public class PartidasFacade {

    private DatosLigaAjedrez data;
    private AccionesJugadorFacade jugadorFacade;
        
    public PartidasFacade() {
        jugadorFacade = new AccionesJugadorFacade();
        data = DatosLigaAjedrez.getSingletonInstance();
    }         

    public boolean introducirResultadoPartida(String jugador1, String jugador2, String ganador, 
            String ubicacion, Date fecha, float duracion) {
         
        Partida partida = new Partida();
        Jugador jugadorObj1 = jugadorFacade.buscarJugador(jugador1);
        Jugador jugadorObj2 = jugadorFacade.buscarJugador(jugador2);
        
        // Validacion de existencia de los jugadores 1 y 2
        if ((jugadorObj1 != null) && (jugador2 != null)) {
            if (!jugadorObj1.equals(jugadorObj2)) {
                partida = Partida.builder().jugador1(jugador1).jugador2(jugador2).ganador(ganador)
                        .fecha(fecha).duracion(duracion).build();                        
            } else {
               // Los jugadores enfrentados no pueden ser iguales
               return false; 
            }            
        } else {
            // Algún jugador no existe
            return false;
        }
        
        // Añadimos la partida a la lista de partidas de la liga y a los propios jugadores
        data.getPartidas().add(partida);        
        jugadorObj1.addPartida(partida);
        jugadorObj2.addPartida(partida);
        
        // Añadimos la partida a las partidas de los clubs correspondientes
        jugadorObj1.getClub().addPartidaJugadoresDelClub(partida);
        jugadorObj2.getClub().addPartidaJugadoresDelClub(partida);
        
        // Añadimos por último la partida a los torneos en los que participan
        jugadorObj1.getTorneo().addPartidaDelTorneo(partida);
        jugadorObj2.getTorneo().addPartidaDelTorneo(partida);
        
        return true;                                            
    }
       
}
