/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao.factories;

import uv.es.ligaajedrez.modelo.dao.IClubDAO;
import uv.es.ligaajedrez.modelo.dao.IUsuarioDAO;

/**
 * @author vmarzal
 */
public interface IDaoFactory {
   
    /**     
     * Método para crear un DAO para la gestión de usuarios
     * 
     * @return 
     */
    IUsuarioDAO crearUsuarioDAO();
    
    /**
     * Método para crear un DAO para la gestión de clubes
     * 
     * @return 
     */
    IClubDAO crearClubDAO();
        
}
