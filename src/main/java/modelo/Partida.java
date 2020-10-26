/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Ezzedine
 */
public class Partida {
    protected Jugador j1, j2, ganador;
    protected Date fecha;
    protected float duracion;
    protected Club sede;

    public Partida() {
    }

    public Partida(Jugador j1, Jugador j2, Jugador ganador, Date fecha, float duracion, Club sede) {
        this.j1 = j1;
        this.j2 = j2;
        this.ganador = ganador;
        this.fecha = fecha;
        this.duracion = duracion;
        this.sede = sede;
    }
    
    
    
    
    
}
