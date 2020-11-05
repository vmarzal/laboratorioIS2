/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

@Slf4j
public class DatosLigaAjedrez {
    
    private static Map<String, Usuario> loadedUsersList;
    private static DatosLigaAjedrez singleton;
                
    private DatosLigaAjedrez(Map<String, Usuario> loadedUsersList) {
        DatosLigaAjedrez.loadedUsersList = loadedUsersList;                
    } 
    
    public DatosLigaAjedrez() {}
    
    public static DatosLigaAjedrez getSingletonInstance() {
        if (singleton == null) {
            singleton = new DatosLigaAjedrez();
            loadedUsersList = new HashMap<>();
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
   
    public Map<String, Usuario> getLoadedUsersList() {
        return loadedUsersList;
    }
    
    public boolean loadedUsersListIsEmpty() {
        return loadedUsersList.isEmpty();
    }
    
}
