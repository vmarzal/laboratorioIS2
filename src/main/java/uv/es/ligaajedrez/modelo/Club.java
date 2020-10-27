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

/**
 *
 * @author Ezzedine
 */
public class Club {
    protected String sede, federacion;
    protected ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    protected Entrenador entrenador;
    protected Gerente gerente;

    public Club() {
    }

    public Club(String sede, String federacion, Entrenador entrenador, Gerente gerente) {
        this.sede = sede;
        this.federacion = federacion;
        this.entrenador = entrenador;
        this.gerente = gerente;
    }
    
    
    
    
}
