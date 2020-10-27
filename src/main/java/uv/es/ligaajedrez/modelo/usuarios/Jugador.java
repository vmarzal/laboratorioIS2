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
    private List<Club> historicoClubes = new ArrayList<Club>();
    
    protected Torneo torneo;
    private Club club;
    private Entrenador entrenador;
    private int elo;    
    private boolean cuotaPagada;
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
    
    public boolean cambiarClub(Jugador jugador, Club club){
            jugador.setClub(club);
        
        return (jugador.historicoClubes.add(club));
    }
    
    
    /**
     * @return the club
     */
    public Club getClub() {
        return club;
    }

    /**
     * @param club the club to set
     */
    public void setClub(Club club) {
        this.club = club;
    }

    /**
     * @return the entrenador
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * @param entrenador the entrenador to set
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * @return the elo
     */
    public int getElo() {
        return elo;
    }

    /**
     * @param elo the elo to set
     */
    public void setElo(int elo) {
        this.elo = elo;
    }
    
    /**
     * @return the historicoClubes
     */
    public List<Club> getHistoricoClubes() {
        return historicoClubes;
    }

    /**
     * @param historicoClubes the historicoClubes to set
     */
    public void setHistoricoClubes(List<Club> historicoClubes) {
        this.historicoClubes = historicoClubes;
    }
    
}
