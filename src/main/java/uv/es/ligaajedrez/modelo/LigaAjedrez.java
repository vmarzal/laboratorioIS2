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
public class LigaAjedrez {
    protected ArrayList<String> federaciones = new ArrayList<String>();
    protected ArrayList<Jugador> jugadoresParticipantes = new ArrayList<Jugador>();
    protected ArrayList<Club> clubesParticipantes = new ArrayList<Club>();
    protected ArrayList<Entrenador> entrenadoresParticipantes = new ArrayList<Entrenador>();
    protected ArrayList<Torneo> torneos = new ArrayList<Torneo>();
    protected ArrayList<Gerente> gerentes = new ArrayList<Gerente>();

    public LigaAjedrez() {
    }
    
    

    
}
