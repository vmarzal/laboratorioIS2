/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo.usuarios;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import uv.es.ligaajedrez.modelo.Club;

@Getter
@SuperBuilder
public class Gerente extends Usuario {
        
    protected List<Club> historicoClubes = new ArrayList<Club>();
    protected List<Float> historicoNominas= new ArrayList<Float>();
    protected List<Float> historicoRetenciones= new ArrayList<Float>();
    protected float nomina, IRPF;
    
}
