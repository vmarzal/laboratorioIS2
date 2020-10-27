package uv.es.ligaajedrez.modelo.usuarios;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import uv.es.ligaajedrez.modelo.Club;

@Getter
@SuperBuilder
public class Entrenador extends Usuario {
    
    protected List<Club> clubesDondeTrabaja = new ArrayList<Club>();
   
}
