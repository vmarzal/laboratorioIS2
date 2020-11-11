/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.usuarios;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import uv.es.ligaajedrez.modelo.DatosLigaAjedrez;
import uv.es.ligaajedrez.modelo.Partida;

@Getter
@SuperBuilder
public class Administrador extends Usuario {
       private ArrayList<Partida> partidasSinSedeAsignado;
       protected DatosLigaAjedrez ligaAjedrez;
       
       
       
       public void cargarPartidasSinSede()
       {
           partidasSinSedeAsignado = new ArrayList<Partida>();
           
       }
       public void aNadirPartidasSinSede(Partida p)
       {
           partidasSinSedeAsignado.add(p);
           
       }
      public ArrayList getPartidasSinSede()
      {
          return partidasSinSedeAsignado;
      }
      public void removePartidoSinSede(int i )
      {
          partidasSinSedeAsignado.remove(i);
      }
      
      public Jugador buscarJugador(String j)
      {
          System.out.println(ligaAjedrez.buscarJugador(j).getNombre() + " " + ligaAjedrez.buscarJugador(j).getApellidos());
          return ligaAjedrez.buscarJugador(j);
      }
       
    
}
