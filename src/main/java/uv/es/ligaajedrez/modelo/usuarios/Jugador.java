/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.usuarios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import uv.es.ligaajedrez.modelo.Club;
import uv.es.ligaajedrez.modelo.LigaAjedrez;
import uv.es.ligaajedrez.modelo.Partida;
import uv.es.ligaajedrez.modelo.Torneo;

@Getter
@SuperBuilder
public class Jugador extends Usuario {

    
    private ArrayList<Partida> partidas = new ArrayList<Partida>();
    private List<Club> historicoClubes = new ArrayList<Club>();
    
    protected Torneo torneo;
    private Club club;
    private Entrenador entrenador;
    private int elo;    
    private boolean cuotaPagada;
    private float cuota; 
    protected LigaAjedrez ligaAjedrez;
    
    public void introResultPartida (String j1, String j2, String ganador, String ubi, Date fecha, float duracion)
    {
        System.out.println("llega a la clase jugador");
        System.out.println(j1 + " " + j2+ " " + ganador+ " " +ubi+ " " +fecha+ " " +duracion );
        Partida partida = new Partida(j1, j2, ganador, fecha, duracion, ubi);
        partidas.add(partida);
        
        System.out.println("lo anyade con exito");
        //aNadimos la partida a la lista de partidas de la liga, del rival , del club y del torneo
        ligaAjedrez.introResultPartida(partida);
        System.out.println("lo anyade a la liga");
        club.introResultPartida(partida);
        System.out.println("lo anyade al club");
        torneo.introResultPartida(partida);
        System.out.println("lo anyade al torneo");
        
    }
    public void addPartida(Partida p)
    {
        partidas.add(p);
    }
//    public boolean reservarSede(Jugador j)
//    {
//        return club.reservarSede();
//    }
    
    
    
    public boolean pagarCuota(){
        
        return (cuotaPagada = true);
    }
    
    public boolean apuntarseTorneo(Jugador jugador){
        
        return (torneo.addJugador(jugador));
    }
    
    public boolean desapuntarseTorneo(Jugador jugador){
        
        return (torneo.removeJugador(jugador));
    }
    
    public void cambiarClub(Jugador jugador, Club club){
        jugador.historicoClubes.add(jugador.getClub());
        jugador.setClub(club);
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
    
//    /**
//     * @return the partidas
//     */
//    public List<Partida> getPartidas() {
//        return partidas;
//    }
//
//    /**
//     * @param partidas the partidas to set
//     */
//    public void setPartidas(List<Partida> partidas) {
//        this.partidas = partidas;
//    }

    
    
}
