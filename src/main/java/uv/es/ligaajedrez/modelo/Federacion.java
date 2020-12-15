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
    Complejidad baja
    */
            
    FEDERACION_VALENCIANA("Federación de La Comunidad Valenciana"),
    FEDERACION_MURCIANA("Federación de La Comunidad Murciana");
    
    private Federacion(String display) {
        this.display = display;
    }  
    /* EI
    DET = 1
    FTR = 1  
    Complejidad baja
    */
    
    private final String display;
    
    @Override
    public String toString() {
        return display;
    }
    /* EI
    DET = 0
    FTR = 1    
    Complejidad baja
    */
            
}

/* totales:
EI:     2b 0m 0a
EO:     0b 0m 0a
EQ:     0b 0m 0a
ILF:     1b 0m 0a
ELF:     1b 0m 0a
*/