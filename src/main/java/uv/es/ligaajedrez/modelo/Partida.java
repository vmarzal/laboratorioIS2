/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import java.util.Date;

/**
 *
 * @author Ezzedine
 */
public class Partida {
    
    protected String jugador1, jugador2, ganador;
    protected Date fecha;
    protected float duracion;
    protected String sede;
    protected Sede sedePartida;
        
    public Partida(String jugador1, String jugador2, String ganador, Date fecha, float duracion, String sede) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.ganador = ganador;
        this.fecha = fecha;
        this.duracion = duracion;
        this.sede = sede;

        System.out.println("Creamos partida  " + jugador1 + " " + jugador2 + " " + ganador + " " + sede 
                + " " + fecha + " " + duracion);
    }
        
    
    public String toString() {
        return ("Partida entre: |" + jugador1 + " | " + jugador2 + "| Fecha: | " + fecha);
    }
          
}
