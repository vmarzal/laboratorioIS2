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
import lombok.Getter;

@Getter
public class Club {
    
    private String nombre;
    private Sede sede;            
    private Federacion federacion;    
    
    protected List<Jugador> listaJugadores = new ArrayList<Jugador>();
    private List<Partida> partidasJugadoreDelClub = new ArrayList<Partida>();

    protected Entrenador entrenador;    
   
    public Club(String nombre, Sede sede, Federacion federacion) {
        this.nombre = nombre;
        this.sede = sede;
        this.federacion = federacion;
    }
    
    public Club(String nombre, Sede sede, Federacion federacion, Entrenador entrenador) {
        this.nombre = nombre;
        this.sede = sede;
        this.federacion = federacion;
        this.entrenador = entrenador;        
    }
    
    public Club(String nombre) {
        this.nombre = nombre;
    }

    public Club() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString() {
        return nombre;
    }
       
    public void introResultPartida ( Partida p) {
        partidasJugadoreDelClub.add(p);

    }

}
