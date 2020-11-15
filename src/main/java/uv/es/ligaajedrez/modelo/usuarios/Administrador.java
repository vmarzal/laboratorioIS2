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
import uv.es.ligaajedrez.modelo.DatosLigaAjedrez;
import uv.es.ligaajedrez.modelo.Partida;

@Getter
@SuperBuilder
public class Administrador extends Usuario {

    private List<Partida> partidasSinSedeAsignada;
    protected DatosLigaAjedrez ligaAjedrez;

    public void cargarPartidasSinSede() {
        partidasSinSedeAsignada = new ArrayList<Partida>();
    }

    public void addPartidaSinSede(Partida p) {
        partidasSinSedeAsignada.add(p);
    }

    public List getAllPartidasSinSede() {
        return partidasSinSedeAsignada;
    }

    public void removePartidaSinSede(int i) {
        partidasSinSedeAsignada.remove(i);
    }

    public Jugador buscarJugador(String j) {        
        return ligaAjedrez.buscarJugador(j);
    }

}
