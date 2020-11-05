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
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import uv.es.ligaajedrez.modelo.usuarios.Entrenador;
import uv.es.ligaajedrez.modelo.usuarios.Gerente;
import uv.es.ligaajedrez.modelo.usuarios.Jugador;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

@Slf4j
public class DatosLigaAjedrez {
    
    private static Map<String, Usuario> usuarios;
    private static Map<String, Jugador> jugadoresParticipantes;
    private static Map<String, Entrenador> entrenadoresPaticipantes;
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
            entrenadoresPaticipantes = new HashMap<>();
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
        return entrenadoresPaticipantes;
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
               "entrenadoresParticipantes: " + entrenadoresPaticipantes.toString() + "\n" + 
               "gerentes: " + gerentes.toString() + "\n" + 
               "clubesParticipantes: " + clubesParticipantes.toString() + "\n" +
               "federaciones: " + federaciones.toString() + "\n" +
               "torneos: " + torneos.toString();
    }
    
}
