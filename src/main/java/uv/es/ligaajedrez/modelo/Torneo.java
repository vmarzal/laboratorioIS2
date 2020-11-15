/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import uv.es.ligaajedrez.modelo.usuarios.Jugador;
import uv.es.ligaajedrez.modelo.usuarios.Entrenador;
import java.util.ArrayList;
import java.util.List;
import lombok.ToString;

@ToString
public class Torneo {
    
    private String nombre;
    private Federacion federacion;
    
    protected List<Jugador> jugadoresParticipantes = new ArrayList<Jugador>();
    protected List<Club> clubesParticipantes = new ArrayList<Club>();
    protected List<Entrenador> entrenadoresParticipantes = new ArrayList<Entrenador>();
    protected List<Partida> partidasTorneo = new ArrayList<Partida>();
    
    public Torneo(String nombre, Federacion federacion) {
        this.nombre = nombre;
        this.federacion = federacion;
    }
          
    public void addPartidaDelTorneo(Partida partida) {
        partidasTorneo.add(partida);
    }

    public boolean addJugador(Jugador jugador){
        return (jugadoresParticipantes.add(jugador));
    }
    
    public boolean removeJugador(Jugador jugador){
        return (jugadoresParticipantes.remove(jugador));
    }
    
}
