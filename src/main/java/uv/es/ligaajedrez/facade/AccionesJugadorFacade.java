/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.facade;

import uv.es.ligaajedrez.modelo.DatosLigaAjedrez;
import uv.es.ligaajedrez.modelo.usuarios.Jugador;

/**
 * Sacamos metodos de busqueda, borrado e insercion de datos a una clase fachada 
 */
public class AccionesJugadorFacade {

    private DatosLigaAjedrez data;
    
    public AccionesJugadorFacade() {
        data = DatosLigaAjedrez.getSingletonInstance();
    }
          
    public Jugador buscarJugador(String loginJugador) {    
        if (data.getJugadoresParticipantes().containsKey(loginJugador)) {
            return data.getJugadoresParticipantes().get(loginJugador);
        } else {
            return null;
        }       
    }       
       
}
