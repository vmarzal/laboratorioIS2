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
import lombok.Getter;

// RET = 1
// DET = 5
@Getter
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
    /* EI
    DET = 3
    FTR = 4
    */
    
    
    public Club(String nombre, Sede sede, Federacion federacion, Entrenador entrenador) {
        this.nombre = nombre;
        this.sede = sede;
        this.federacion = federacion;
        this.entrenador = entrenador;
        partidasJugadoresDelClub = new ArrayList<Partida>();
    }
    /* EI
    DET = 4
    FTR = 5
    */

    public String toString() {
        return nombre;
    }
    /* EQ
    DET = 0
    FTR = 1
    */

    public void addPartidaJugadoresDelClub(Partida partida) {
        partidasJugadoresDelClub.add(partida);
    }
    /* EI
    DET = 1
    FTR = 2
    */
    
    public String getNomSede() {
        return sede.getNombre();
    }
    /* EQ
    DET = 0
    FTR = 2
    */

    public List<String> getHorariosDisponible(Date fecha) {        
        return sede.getHorariosDisponible(fecha);
    }
    /* EQ
    DET = 1
    FTR = 2
    */

    public void asignarFranjaHoraria(Date d, int i) {
        sede.asignarFranjaHoraria(d, i);
    }
    /* EI
    DET = 2
    FTR = 2
    */

}

/* TOTAL CLUB
    /*  EI
    DET = 10
    FTR = 13
    
        EQ
    DET = 1
    FTR = 4

        EO
    DET = 0
    FTR = 0
    */

/* totales:
EI:     4b 0m 0a
EO:     0b 0m 0a
EQ:     9b 0m 0a
ILF:     1b 0m 0a
ELF:     1b 0m 0a
*/
