/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ezzedine
 */


import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class Jugador {
    protected ArrayList<Partida> partidas = new ArrayList<Partida>();
    protected ArrayList<Club> historicoClubes = new ArrayList<Club>();
    protected Torneo torneo;
    protected Club club;
    protected Entrenador entrenador;
    protected int elo;
    protected DatosPersonales datosPersonales;
//    protected tipoJugador tipoJugador;
    private boolean cuataPagada;
    private float cuata;
    
    
//constructor vacio
    public Jugador() {
    }
//constructor con elementos
    public Jugador(Torneo torneo, Club club, Entrenador entrenador, int elo, boolean cuataPagada, float cuata) {
        this.torneo = torneo;
        this.club = club;
        this.entrenador = entrenador;
        this.elo = elo;
        this.cuataPagada = cuataPagada;
        this.cuata = cuata;
    }
    
    
    
    
}
