/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import uv.es.ligaajedrez.modelo.usuarios.Jugador;
import java.util.Date;

/**
 *
 * @author Ezzedine
 */
public class Partida {
    protected String j1, j2, ganador;
    protected Date fecha;
    protected float duracion;
    protected String sede;

    public Partida() {
    }

    public Partida(String j1, String j2, String ganador, Date fecha, float duracion, String sede) {
        this.j1 = j1;
        this.j2 = j2;
        this.ganador = ganador;
        this.fecha = fecha;
        this.duracion = duracion;
        this.sede = sede;
        
        System.out.println("creamos partida  "+j1 + " " + j2+ " " + ganador+ " " +sede+ " " +fecha+ " " +duracion );
    }

    
    
    
    
    
    
}
