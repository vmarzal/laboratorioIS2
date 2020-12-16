/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.usuarios;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import uv.es.ligaajedrez.modelo.Partida;

@Getter
@SuperBuilder
// RET = 0
// DET = 1
public class Administrador extends Usuario {

    private List<Partida> partidasSinSedeAsignada;
    
    public void cargarPartidasSinSede() {
        partidasSinSedeAsignada = new ArrayList<Partida>();
    }
    /* EI
    DET = 0
    FTR = 2
    */

    public void addPartidaSinSede(Partida p) {
        partidasSinSedeAsignada.add(p);
    }
    /* EI
    DET = 1
    FTR = 2
    */

    public List getAllPartidasSinSede() {
        return partidasSinSedeAsignada;
    }
    /* EQ
    DET = 0
    FTR = 2
    */

    public void removePartidaSinSede(int i) {
        partidasSinSedeAsignada.remove(i);
    }
    /* EI
    DET = 1
    FTR = 2
    */

}

/* TOTAL ADMINISTRADOR
    /*  EI
    DET = 2
    FTR = 8
    
        EQ
    DET = 0
    FTR = 2

        EO
    DET = 0
    FTR = 0
    */

/* totales:
EI:     4b 0m 0a
EO:     0b 0m 0a
EQ:     9b 0m 0a
ILF:     1b 0m 0a
ELF:     1b 0m 0a
*/
