/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.usuarios;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import uv.es.ligaajedrez.modelo.Club;
import uv.es.ligaajedrez.modelo.Partida;
import uv.es.ligaajedrez.modelo.Torneo;

@Getter
@SuperBuilder
public class Jugador extends Usuario {
    
    protected List<Partida> partidas = new ArrayList<Partida>();
    protected List<Club> historicoClubes = new ArrayList<Club>();
    
    protected Torneo torneo;
    protected Club club;
    protected Entrenador entrenador;
    protected int elo;    
    private boolean cuotaPagada, apuntado, desapuntado;
    private float cuota; 
    
    
    public boolean pagarCuota(){
        
        return (cuotaPagada = true);
    }
    
    public boolean apuntarseTorneo(Jugador jugador){
        
        return (torneo.addJugador(jugador));
    }
    
    public boolean desapuntarseTorneo(Jugador jugador){
        
        return (torneo.removeJugador(jugador));
    }
    
}
