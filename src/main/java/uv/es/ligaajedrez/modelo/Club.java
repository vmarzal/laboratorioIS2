/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import uv.es.ligaajedrez.modelo.usuarios.Jugador;
import uv.es.ligaajedrez.modelo.usuarios.Entrenador;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Club {

    private String nombre;
    private Sede sede;
    private Federacion federacion;

    protected List<Jugador> listaJugadores = new ArrayList<Jugador>();
    private List<Partida> partidasJugadoresDelClub;

    protected Entrenador entrenador;

    public Club(String nombre, Sede sede, Federacion federacion) {
        this.nombre = nombre;
        this.sede = sede;
        this.federacion = federacion;
        partidasJugadoresDelClub = new ArrayList<Partida>();
    }

    public Club(String nombre, Sede sede, Federacion federacion, Entrenador entrenador) {
        this.nombre = nombre;
        this.sede = sede;
        this.federacion = federacion;
        this.entrenador = entrenador;
        partidasJugadoresDelClub = new ArrayList<Partida>();
    }

    public String toString() {
        return nombre;
    }

    public void addPartidaJugadoresDelClub(Partida partida) {
        partidasJugadoresDelClub.add(partida);
    } 
    
    public String getNomSede() {
        return sede.getNombre();
    }

    public List<String> getHorariosDisponible(Date fecha) {        
        return sede.getHorariosDisponible(fecha);
    }

    public void asignarFranjaHoraria(Date d, int i) {
        sede.asignarFranjaHoraria(d, i);
    }

}
