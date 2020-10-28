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
import java.util.Date;

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
    protected ArrayList<Partida> partidas = new ArrayList<Partida>();

    public LigaAjedrez() {
    }
    
    //Ezz-al hacer login, nos carga estos datos predifinidos en nuestra aplicacion 
    public void cargarDatos(){
        federaciones.add("La comunidad valenciana");
        Torneo t = new Torneo("La comunidad valenciana");
        torneos.add(t);
        
        Entrenador e1, e2;
        e1= Entrenador.builder().nombre("eValencia").build();
        e2= Entrenador.builder().nombre("eVillareal").build();
        entrenadoresParticipantes.add(e1);
        entrenadoresParticipantes.add(e2);
        
        Gerente g1, g2;
        g1 = Gerente.builder().nombre("gValencia").nomina(900).IRPF(15).build();
        g2 = Gerente.builder().nombre("gVillareal").nomina(900).IRPF(15).build();
        gerentes.add(g1);
        gerentes.add(g2);
                
        Club valencia, villareal;
        valencia = new Club("valencia", "La comunidad valenciana", e1, g1);
        villareal = new Club("villareal", "La comunidad valenciana", e2, g2);
        clubesParticipantes.add(valencia);
        clubesParticipantes.add(villareal);
            
        Jugador ezz, vic,adri;
        ezz = Jugador.builder().login("ezz").password("ezz").ligaAjedrez(this).DNI("ezz").nombre("ezz").club(valencia).entrenador(e1).build();
        vic = Jugador.builder().ligaAjedrez(this).DNI("vic").nombre("vic").club(villareal).entrenador(e2).build();
        adri = Jugador.builder().ligaAjedrez(this).DNI("adri").nombre("adri").club(villareal).entrenador(e2).build();
        jugadoresParticipantes.add(ezz);
        jugadoresParticipantes.add(vic);
        jugadoresParticipantes.add(adri);
        }
    
        //Ezz-anyadimos la partida ala lista de partidas de la liga
        public void introResultPartida ( Partida p)
        {
            partidas.add(p);
            
            Jugador j2;
            //aNadimos la partida a la lista de partidas del rival
            for (Jugador jug: jugadoresParticipantes)
            {
                //se debe realizar con los dnis
                if(jug.getNombre() == p.j2)
                {
                    jug.addPartida(p);
                }
            }
            
        }
    }
