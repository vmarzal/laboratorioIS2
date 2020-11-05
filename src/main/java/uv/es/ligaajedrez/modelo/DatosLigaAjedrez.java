/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import uv.es.ligaajedrez.modelo.usuarios.Administrador;
import uv.es.ligaajedrez.modelo.usuarios.Entrenador;
import uv.es.ligaajedrez.modelo.usuarios.Gerente;
import uv.es.ligaajedrez.modelo.usuarios.Jugador;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

@Slf4j
public class DatosLigaAjedrez {
    
    private static Map<String, Usuario> usuarios;
    private static Map<String, Jugador> jugadoresParticipantes;
    private static Map<String, Entrenador> entrenadoresParticipantes;
    private static Map<String, Gerente> gerentes;
    private static List<Club> clubesParticipantes;
    
    public static List<String> federaciones;
    public static List<Torneo> torneos;
        
    private static DatosLigaAjedrez singleton;
                
    private DatosLigaAjedrez(Map<String, Usuario> loadedUsersList) {
        DatosLigaAjedrez.usuarios = loadedUsersList;                
    } 
    
    public DatosLigaAjedrez() {}
    
    public static DatosLigaAjedrez getSingletonInstance() {
        if (singleton == null) {
            singleton = new DatosLigaAjedrez();
            
            federaciones = new ArrayList<String>();
            usuarios = new HashMap<>();
            jugadoresParticipantes = new HashMap<>();
            entrenadoresParticipantes = new HashMap<>();
            gerentes = new HashMap<>();
            torneos = new ArrayList<Torneo>();
            clubesParticipantes = new ArrayList<Club>();
            
        } else {
            log.info("Devolvemos la instancia única de datos comunes.");                        
        }        
        return singleton;        
    }
   
    public static DatosLigaAjedrez getSingletonInstance(Map<String, Usuario> loadedUsersList) {
        if (singleton == null) {
            singleton = new DatosLigaAjedrez(loadedUsersList);
        } else {
            log.info("Devolvemos la instancia única de datos comunes.");            
        }        
        return singleton;
    }    
    
    public static void initUsuariosPorDefecto() {   
        String federacion = "Federación de La Comunidad Valenciana";        
        federaciones.add(federacion);        

        Torneo torneo = new Torneo("Torneo internacional de La Comunidat Valenciana", federacion);
        torneos.add(torneo);                        
        
        Administrador adminUser = Administrador.builder().login("admin").password("admin").build();                     
        usuarios.put(adminUser.getLogin(), adminUser);                                                               

        Entrenador e1, e2;
        e1 = Entrenador.builder().login("entrenador1").password("entrenador1").nombre("Entrenador de Valencia").build();
        e2 = Entrenador.builder().login("entrenador2").password("entrenador2").nombre("Entrenador de Villareal").build();
        
        entrenadoresParticipantes.put(e1.getLogin(), e1);
        entrenadoresParticipantes.put(e2.getLogin(), e2);
        usuarios.put(e1.getLogin(), e1);
        usuarios.put(e2.getLogin(), e2);
        
        Gerente g1, g2;
        g1 = Gerente.builder().login("gerente1").password("gerente1").nombre("Gerente de Valencia").nomina(900).IRPF(15).build();        
        g2 = Gerente.builder().login("gerente2").password("gerente2").nombre("Gerente de Villareal").nomina(900).IRPF(15).build();
        
        usuarios.put(g1.getLogin(), g1);
        usuarios.put(g2.getLogin(), g2);
        gerentes.put(g1.getLogin(), g1);
        gerentes.put(g2.getLogin(), g2);
               
        Club valencia, villareal;
        valencia = new Club("Valencia", federacion, e1, g1);
        villareal = new Club("Villareal", federacion, e2, g2);
        
        clubesParticipantes.add(valencia);
        clubesParticipantes.add(villareal);
                       
        Jugador ezz, vic, adri;        
        ezz = Jugador.builder().login("ezz").password("ezz").nombre("Ezzedine")
                    .DNI("1111111111").club(valencia).entrenador(e1).build();
        adri = Jugador.builder().login("adri").password("adri").nombre("Adrian")
                    .DNI("2222222222").club(villareal).entrenador(e2).build();                        
        vic = Jugador.builder().login("vic").password("vic").nombre("Victor")
                    .DNI("3333333333").club(villareal).entrenador(e2).build();
        
        jugadoresParticipantes.put(ezz.getLogin(), ezz);
        jugadoresParticipantes.put(adri.getLogin(), adri);
        jugadoresParticipantes.put(vic.getLogin(), vic);                                                
        usuarios.put(ezz.getLogin(), ezz);
        usuarios.put(adri.getLogin(), adri);
        usuarios.put(vic.getLogin(), vic);               
    }
              
    public List<String> getFederaciones() {
        return federaciones;                
    }
    
    public boolean loadedUsersListIsEmpty() {
        return usuarios.isEmpty();
    }
    
    public Map<String, Usuario> getLoadedUsersList() {
        return usuarios;
    }
    
    public Map<String, Jugador> getJugadoresParticipantes() {
        return jugadoresParticipantes;
    }
    
    public Map<String, Entrenador> getEntrenadoresPaticipantes() {
        return entrenadoresParticipantes;
    }
    
    public Map<String, Gerente> getGerentes() {
        return gerentes;
    }
    
    public List<Club> getClubesParticipantes() {
        return clubesParticipantes;
    }
        
    public List<Torneo> getTorneos() {
        return torneos;
    }
    
    public String toString() {
        return "usuarios: " + usuarios.toString() + "\n" + 
               "jugadoresParticipantes: " + jugadoresParticipantes.toString() + "\n" + 
               "entrenadoresParticipantes: " + entrenadoresParticipantes.toString() + "\n" + 
               "gerentes: " + gerentes.toString() + "\n" + 
               "clubesParticipantes: " + clubesParticipantes.toString() + "\n" +
               "federaciones: " + federaciones.toString() + "\n" +
               "torneos: " + torneos.toString();
    }
    
}
