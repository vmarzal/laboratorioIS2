/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao.factories;

import uv.es.ligaajedrez.modelo.dao.IClubDAO;
import uv.es.ligaajedrez.modelo.dao.IUsuarioDAO;
import uv.es.ligaajedrez.modelo.dao.impl.XMLClubDAO;
import uv.es.ligaajedrez.modelo.dao.impl.XMLUsuarioDAO;

/** 
 * @author vmarzal
 */
public class XMLDaoFactory implements IDaoFactory {

    @Override
    public IUsuarioDAO crearUsuarioDAO() {
        return new XMLUsuarioDAO();
    }

    @Override
    public IClubDAO crearClubDAO() {
        return new XMLClubDAO();        
    }
    
}
