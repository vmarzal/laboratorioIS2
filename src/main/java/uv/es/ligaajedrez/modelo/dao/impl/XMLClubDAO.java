/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.dao.impl;

import java.util.Arrays;
import java.util.List;
import uv.es.ligaajedrez.modelo.Club;
import uv.es.ligaajedrez.modelo.dao.IClubDAO;

/** 
 * @author vmarzal
 */
public class XMLClubDAO implements IClubDAO {

    @Override
    public Boolean guardarClub(Club club) {
        return true;
    }

    @Override
    public Boolean actualizarClub(Club club) {
        return true;
    }

    @Override
    public Club obtenerClub(String nombre) {
        return new Club();
    }

    @Override
    public List<Club> obtenerTodosLosClubes() {
        return Arrays.asList(new Club());        
    }
    
    
}
