package uv.es.ligaajedrez.modelo.usuarios;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import uv.es.ligaajedrez.modelo.Club;

@Getter
@Setter
@SuperBuilder
public class Entrenador extends Usuario {
    
    private List<Club> clubesDondeTrabaja = new ArrayList<Club>();
               
}
