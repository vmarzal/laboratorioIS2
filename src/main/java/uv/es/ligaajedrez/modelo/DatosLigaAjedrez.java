/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import uv.es.ligaajedrez.modelo.usuarios.Administrador;
import uv.es.ligaajedrez.modelo.usuarios.Entrenador;
import uv.es.ligaajedrez.modelo.usuarios.Gerente;
import uv.es.ligaajedrez.modelo.usuarios.Jugador;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

@Slf4j
public class DatosLigaAjedrez {
    
    private static Map<String, Usuario> usuarios;
    private static Map<String, Jugador> jugadoresParticipantes;
    private static Map<String, Entrenador> entrenadoresParticipantes;
    private static Map<String, Gerente> gerentes;
    private static List<Club> clubesParticipantes;
    protected static List<Partida> partidas ;
    
    public static List<String> federaciones;
    public static List<Torneo> torneos;
        
    private static DatosLigaAjedrez singleton;
                
    private DatosLigaAjedrez(Map<String, Usuario> loadedUsersList) {
        DatosLigaAjedrez.usuarios = loadedUsersList;                
    } 
    
    public DatosLigaAjedrez() {}
    
    public static DatosLigaAjedrez getSingletonInstance() {
        if (singleton == null) {
            singleton = new DatosLigaAjedrez();
            
            federaciones = new ArrayList<String>();
            usuarios = new HashMap<>();
            jugadoresParticipantes = new HashMap<>();
            entrenadoresParticipantes = new HashMap<>();
            gerentes = new HashMap<>();
            torneos = new ArrayList<Torneo>();
            clubesParticipantes = new ArrayList<Club>();
            partidas = new ArrayList<Partida>();            
        }      
        return singleton;        
    }
   
    public static DatosLigaAjedrez getSingletonInstance(Map<String, Usuario> loadedUsersList) {
        if (singleton == null) {
            singleton = new DatosLigaAjedrez(loadedUsersList);
        }       
        return singleton;
    }    
    
    public static void initUsuariosPorDefecto() {   
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String federacion = "Federación de La Comunidad Valenciana";        
        federaciones.add(federacion);        

        Torneo torneo = new Torneo("Torneo internacional de La Comunidat Valenciana", federacion);
        torneos.add(torneo);                        
        
        Administrador adminUser = Administrador.builder().login("admin").password("admin").build();                     
        usuarios.put(adminUser.getLogin(), adminUser);                                                               

        Entrenador e1, e2;
        LocalDate fechaNacEntrenador1 = LocalDate.parse("20/03/1977", df);        
        LocalDate fechaNacEntrenador2 = LocalDate.parse("04/01/1950", df);
                
        e1 = Entrenador.builder().login("entrenador1").password("entrenador1").nombre("Alonso")
               .apellidos("Quijano").fechaNacimiento(fechaNacEntrenador1).build();               
               
        e2 = Entrenador.builder().login("entrenador2").password("entrenador2").nombre("Pepe")
               .apellidos("Botella").fechaNacimiento(fechaNacEntrenador2)               
               .build();              
                       
        Sede sedeValencia = Sede.builder().direccion("C/ de Guillem de Castro, 65").telefono("963153005").build();
        Sede sedeVillareal = Sede.builder().direccion("C/ Federico de Saboya, 102").telefono("9867030303").build();
        
        Club clubMassanassa, clubVilaReal;
                
        clubMassanassa = new Club("Club de Ajedrez Massanassa", sedeValencia, federacion, e1);
        clubVilaReal = new Club("Club de Ajedrez Vila-real", sedeVillareal, federacion, e2);
        
        clubesParticipantes.add(clubMassanassa);
        clubesParticipantes.add(clubVilaReal);
        
        e1.setClubesDondeTrabaja(new ArrayList<Club>() {{ add(clubMassanassa); }});
        e2.setClubesDondeTrabaja(new ArrayList<Club>(){{ add(clubVilaReal); }});
        
        entrenadoresParticipantes.put(e1.getLogin(), e1);
        entrenadoresParticipantes.put(e2.getLogin(), e2);
        usuarios.put(e1.getLogin(), e1);
        usuarios.put(e2.getLogin(), e2);
                   
        LocalDate fechaNacGerente1 = LocalDate.parse("02/04/1960", df);        
        LocalDate fechaNacGerente2 = LocalDate.parse("14/12/1980", df);        
                
        Gerente g1, g2;
        g1 = Gerente.builder().login("gerente1").password("gerente1")
                .nombre("Manuel Antonio").apellidos("Benitez Plasencia")
                .fechaNacimiento(fechaNacGerente1).nomina(2400).IRPF(23).clubActual(clubMassanassa).build();        
        g2 = Gerente.builder().login("gerente2").password("gerente2")
                .nombre("Antonio David").apellidos("Garcia Fuertes").fechaNacimiento(fechaNacGerente2)
                .nomina(3400).IRPF(26).clubActual(clubVilaReal).build();
        
        usuarios.put(g1.getLogin(), g1);
        usuarios.put(g2.getLogin(), g2);
        gerentes.put(g1.getLogin(), g1);
        gerentes.put(g2.getLogin(), g2);
        
        Jugador ezz, vic, adri;        
        ezz = Jugador.builder().login("ezz").password("ezz").nombre("Ezzideen")
                    .DNI("1111111111").club(clubMassanassa).entrenador(e1).torneo(torneo).ligaAjedrez(singleton).build(); 
        ezz.crearListaPartidas();
        adri = Jugador.builder().login("adri").password("adri").nombre("Adrian")
                    .DNI("2222222222").club(clubVilaReal).entrenador(e2).torneo(torneo).ligaAjedrez(singleton).build();                        
        adri.crearListaPartidas();
        vic = Jugador.builder().login("vic").password("vic").nombre("Victor")
                    .DNI("3333333333").club(clubVilaReal).entrenador(e2).torneo(torneo).ligaAjedrez(singleton).build();
        vic.crearListaPartidas();
        
        jugadoresParticipantes.put(ezz.getLogin(), ezz);
        jugadoresParticipantes.put(adri.getLogin(), adri);
        jugadoresParticipantes.put(vic.getLogin(), vic);                                                
        usuarios.put(ezz.getLogin(), ezz);
        usuarios.put(adri.getLogin(), adri);
        usuarios.put(vic.getLogin(), vic);               
    }
    
     //Ezz-anyadimos la partida ala lista de partidas de la liga
    public boolean introResultPartida(Partida p) {
        boolean existe = false;
        if (jugadoresParticipantes.containsKey(p.j2)) {
            partidas.add(p);
            //aNadimos la partida al rival en el caso que el rival existe
            jugadoresParticipantes.get(p.j2).addPartida(p);
            existe = true;
        }

        return existe;
    }
        
        
    public List<String> getFederaciones() {
        return federaciones;                
    }
    
    public boolean isUsuariosEmpty() {
        return usuarios.isEmpty();
    }
    
    public Map<String, Usuario> getUsuarios() {
        return usuarios;
    }
    
    public Map<String, Jugador> getJugadoresParticipantes() {
        return jugadoresParticipantes;
    }
    
    public Map<String, Entrenador> getEntrenadoresParticipantes() {
        return entrenadoresParticipantes;
    }
    
    public Map<String, Gerente> getGerentes() {
        return gerentes;
    }
    
    public List<Club> getClubesParticipantes() {
        return clubesParticipantes;
    }
    public List<Partida> getPartidas() {
        return partidas;
    }
        
    public List<Torneo> getTorneos() {
        return torneos;
    }
    
    public String toString() {
        return "usuarios: " + usuarios.toString() + "\n" + 
               "jugadoresParticipantes: " + jugadoresParticipantes.toString() + "\n" + 
               "entrenadoresParticipantes: " + entrenadoresParticipantes.toString() + "\n" + 
               "gerentes: " + gerentes.toString() + "\n" + 
               "clubesParticipantes: " + clubesParticipantes.toString() + "\n" +
               "federaciones: " + federaciones.toString() + "\n" +
               "torneos: " + torneos.toString();
    }
    
}
