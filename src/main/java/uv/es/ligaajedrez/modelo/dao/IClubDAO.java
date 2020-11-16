/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao;

import java.util.List;
import uv.es.ligaajedrez.modelo.Club;

/** 
 * @author vmarzal
 */
public interface IClubDAO {
   
    /**
     * Método para guardar un nuevo club
     * 
     * @param club
     * @return true si el club se ha creado con éxito
     */
    Boolean guardarClub(Club club);
        
    /**
     * Método para actualizar un nuevo club
     * 
     * @param club
     * @return true si el club se ha actualizado con éxito
     */
    Boolean actualizarClub(Club club);
    
    /**
     * Método para obtener un club a partir de su nombre
     * 
     * @param nombre
     * @return el club buscado
     */
    Club obtenerClub(String nombre);
    
    /**
     * Método que devuelve todos los clubes
     * 
     * @return todos los clubes
     */
    List<Club> obtenerTodosLosClubes();
    
}
