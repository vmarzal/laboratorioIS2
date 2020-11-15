/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Partida {
    
    protected String jugador1, jugador2, ganador;
    protected Date fecha;
    protected float duracion;
    protected String sede;
    protected Sede sedePartida;                    
    
    public String toString() {
        return ("Partida entre: |" + jugador1 + " | " + jugador2 + "| Fecha: | " + fecha);
    }
          
}
