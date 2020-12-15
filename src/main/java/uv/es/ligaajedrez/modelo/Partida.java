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
    /*
        RET = 6
        DETS = 1
    Complejidad media
    */
    public String toString() {
        return ("Partida entre: |" + jugador1 + " | " + jugador2 + "| Fecha: | " + fecha);
    }
    /* EI
    DET = 0
    FTR = 1  
    Complejidad baja
    */
          
}

/* totales:
EI:     1b 0m 0a
EO:     0b 0m 0a
EQ:     0b 0m 0a
ILF:     0b 1m 0a
ELF:     0b 1m 0a
*/