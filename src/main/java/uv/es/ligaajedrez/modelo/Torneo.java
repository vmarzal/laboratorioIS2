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

public class Torneo {
    protected String federacion;
    protected ArrayList<Jugador> jugadoresParticipantes = new ArrayList<Jugador>();
    protected ArrayList<Club> clubesParticipantes = new ArrayList<Club>();
    protected ArrayList<Entrenador> entrenadoresParticipantes = new ArrayList<Entrenador>();
    protected ArrayList<Partida> partidasTorneo = new ArrayList<Partida>();

    public Torneo() {
    }

    public Torneo(String federacion) {
        this.federacion = federacion;
    }
    
        //Ezz-anyadimos la partida ala lista de partidas del torneo
    public void introResultPartida ( Partida p)
    {
        partidasTorneo.add(p);


    }

    public boolean addJugador(Jugador jugador){
        return (jugadoresParticipantes.add(jugador));
    }
    
    public boolean removeJugador(Jugador jugador){
        return (jugadoresParticipantes.remove(jugador));
    }
}
