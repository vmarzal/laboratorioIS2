/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

/** 
 * @author vmarzal
 */
public enum Federacion {
    /*
        RET = 1
        DETS = 0
    */
            
    FEDERACION_VALENCIANA("Federación de La Comunidad Valenciana"),
    FEDERACION_MURCIANA("Federación de La Comunidad Murciana");
    
    private Federacion(String display) {
        this.display = display;
    }  
    /* EI
    DET = 1
    FTR = 1    
    */
    
    private final String display;
    
    @Override
    public String toString() {
        return display;
    }
    /* EI
    DET = 0
    FTR = 1    
    */
            
}
