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
import uv.es.ligaajedrez.modelo.DatosLigaAjedrez;
import uv.es.ligaajedrez.modelo.Partida;
import uv.es.ligaajedrez.modelo.Torneo;

@Getter
@SuperBuilder
public class Jugador extends Usuario {
    
    private List<Partida> partidas;
    private List<Club> historicoClubes = new ArrayList<Club>();
    
    protected Torneo torneo;
    private Club club;
    private Entrenador entrenador;
    private int elo;    
    private boolean cuotaPagada;
    private boolean isMenor;
    private float cuota; 
    protected DatosLigaAjedrez ligaAjedrez;
    
    public boolean introResultPartida (String j1, String j2, String ganador, String ubi, Date fecha, float duracion)
    {
        System.out.println("llega a la clase jugador");
        System.out.println(j1 + " " + j2+ " " + ganador+ " " +ubi+ " " +fecha+ " " +duracion );
        Partida partida = new Partida(j1, j2, ganador, fecha, duracion, ubi);
        
        //aNadimos la partida a la lista de partidas de la liga, del rival , del club y del torneo
        if(ligaAjedrez.introResultPartida(partida))
        {
            partidas.add(partida);
            System.out.println("lo anyade a la liga");
            System.out.println("lo anyade a la liga");
            club.introResultPartida(partida);
            System.out.println("lo anyade al club");
            torneo.introResultPartida(partida);
            System.out.println("lo anyade al torneo");
            return true;
        }
        else
        {
            System.out.println("el rival no existe");
            return false;
        }
        

    }
    
    public void setLigaAjedrez(DatosLigaAjedrez ligaAje)
    {
        ligaAjedrez = ligaAje;
    }
    
    public void crearListaPartidas(){
         partidas= new ArrayList<Partida>();
        
    }
    public void addPartida(Partida p)
    {
        partidas.add(p);
    }
    
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
     
    
}
