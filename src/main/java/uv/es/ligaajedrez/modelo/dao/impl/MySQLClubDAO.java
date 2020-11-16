/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao.impl;

import java.util.List;
import uv.es.ligaajedrez.modelo.Club;
import uv.es.ligaajedrez.modelo.dao.IClubDAO;

/** 
 * @author vmarzal
 */
public class MySQLClubDAO implements IClubDAO {

    @Override
    public Boolean guardarClub(Club club) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Boolean actualizarClub(Club club) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Club obtenerClub(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Club> obtenerTodosLosClubes() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
}
