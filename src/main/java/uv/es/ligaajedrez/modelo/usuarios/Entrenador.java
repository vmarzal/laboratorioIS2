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
// RET = 0
// DET = 1
public class Entrenador extends Usuario {
    
    private List<Club> clubesDondeTrabaja = new ArrayList<Club>();
               
}

/* totales:
EI:     0b 0m 0a
EO:     0b 0m 0a
EQ:     0b 0m 0a
ILF:     1b 0m 0a
ELF:     0b 0m 0a
*/
