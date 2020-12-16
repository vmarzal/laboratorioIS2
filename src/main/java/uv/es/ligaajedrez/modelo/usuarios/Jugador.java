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
// RET = 6
// DET = 6
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
    /* EQ
    DET = 0
    FTR = 2
    */
    
    public void setLigaAjedrez(DatosLigaAjedrez ligaAje) {
        ligaAjedrez = ligaAje;
    }
    /* EI
    DET = 1
    FTR = 2
    */

    public void crearListaPartidas() {
        partidas = new ArrayList<Partida>();
    }
    /* EI
    DET = 0
    FTR = 2
    */

    public void addPartida(Partida p) {
        partidas.add(p);
    }
    /* EI
    DET = 1
    FTR = 2
    */

    public boolean apuntarseTorneo() {
        return (torneo.addJugador(this));
    }
    /* EI
    DET = 0
    FTR = 2
    */

    public boolean desapuntarseTorneo() {
        return (torneo.removeJugador(this));
    }
    /* EI
    DET = 0
    FTR = 2
    */

    public void cambiarClub(Club club) {
        if (historicoClubes == null) {
            this.historicoClubes = new ArrayList<>();
        }        
        this.historicoClubes.add(club);
        this.setClub(club);        
    }
    /* EI
    DET = 1
    FTR = 2
    */
   
    public List<String> getHorariosDisponible(Date d) {
        return club.getHorariosDisponible(d);
    }
    /* EQ
    DET = 1
    FTR = 2
    */

    public void asignarFranjaHoraria(Date d, int i) {
        club.asignarFranjaHoraria(d, i);
    }
    /* EI
    DET = 2
    FTR = 2
    */
    
    public String toString() {
        return nombre + " " + apellidos;
    }
    /* EQ
    DET = 0
    FTR = 1
    */

    public String getNomSede() {
        return club.getNomSede();
    }
    /* EQ
    DET = 0
    FTR = 2
    */

    public String getNomClub() {
        return club.getNombre();
    }
    /* EQ
    DET = 0
    FTR = 2
    */
     
}


/* TOTAL JUGADOR
    /*  EI
    DET = 5
    FTR = 14
    
        EQ
    DET = 1
    FTR = 9

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


