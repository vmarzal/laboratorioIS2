/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import uv.es.ligaajedrez.modelo.usuarios.Jugador;
import uv.es.ligaajedrez.modelo.usuarios.Gerente;
import uv.es.ligaajedrez.modelo.usuarios.Entrenador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ezzedine
 */
public class Club {
    
    private String nombre;
    private Sede sede;            
    private String federacion;    
    
    protected List<Jugador> listaJugadores = new ArrayList<Jugador>();
    private List<Partida> partidasJugadoreDelClub = new ArrayList<Partida>();

    protected Entrenador entrenador;    
   
    public Club(String nombre, Sede sede, String federacion, Entrenador entrenador) {
        this.nombre = nombre;
        this.sede = sede;
        this.federacion = federacion;
        this.entrenador = entrenador;        
    }
    
    public String toString() {
        return nombre;
    }
    
    
//Ezz-anyadimos la partida ala lista de partidas del club
    public void introResultPartida ( Partida p)
    {
        partidasJugadoreDelClub.add(p);

    }
    //Ezz--creo que hay que crear una clase sede
//    public boolean consultarDisponibilidadSede (Date fecha, String time)
//    {
//        
//    }
//     public boolean reservarSede(Jugador j)
//    {
//        
//    }
}
