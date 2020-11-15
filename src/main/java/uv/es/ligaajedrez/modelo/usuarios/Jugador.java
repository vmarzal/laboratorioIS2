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
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import uv.es.ligaajedrez.modelo.Club;
import uv.es.ligaajedrez.modelo.DatosLigaAjedrez;
import uv.es.ligaajedrez.modelo.Partida;
import uv.es.ligaajedrez.modelo.Torneo;

@Getter
@Setter
@SuperBuilder
public class Jugador extends Usuario {

    private List<Partida> partidas;
    private List<Club> historicoClubes = new ArrayList<Club>();

    protected Torneo torneo;
    private Club club;
    private Entrenador entrenador;
    private int elo;
    private boolean cuotaPagada;
    private boolean esMenor;
    private float cuota;
    protected DatosLigaAjedrez ligaAjedrez;
    private String responsableMenor;
    private String nomClub;
    
    public Torneo getTorneo() {
        return torneo;
    }
    
    public void setLigaAjedrez(DatosLigaAjedrez ligaAje) {
        ligaAjedrez = ligaAje;
    }

    public void crearListaPartidas() {
        partidas = new ArrayList<Partida>();
    }

    public void addPartida(Partida p) {
        partidas.add(p);
    }

    public boolean apuntarseTorneo(Jugador jugador) {
        return (torneo.addJugador(jugador));
    }

    public boolean desapuntarseTorneo(Jugador jugador) {
        return (torneo.removeJugador(jugador));
    }

    public void cambiarClub(Jugador jugador, Club club) {
        jugador.historicoClubes.add(jugador.getClub());
        jugador.setClub(club);
    }

    public String toString() {
        return nombre + " " + apellidos;
    }

    public String getNomSede() {
        return club.getNomSede();
    }

    public String getNomClub() {
        return club.getNombre();
    }

    public List<String> getHorariosDisponible(Date d) {
        return club.getHorariosDisponible(d);
    }

    public void asignarFranjaHoraria(Date d, int i) {
        club.asignarFranjaHoraria(d, i);
    }
}
