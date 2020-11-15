/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uv.es.ligaajedrez.modelo.usuarios.Administrador;
import uv.es.ligaajedrez.modelo.usuarios.Entrenador;
import uv.es.ligaajedrez.modelo.usuarios.Gerente;
import uv.es.ligaajedrez.modelo.usuarios.Jugador;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

/**
 * Usamos Patron singleton para acceder a los datos persistentes desde cualquier
 * otra clase.
 */
public class DatosLigaAjedrez {
    
    private static Map<String, Usuario> usuarios;
    private static Map<String, Jugador> jugadoresParticipantes;
    private static Map<String, Entrenador> entrenadoresParticipantes;
    private static Map<String, Gerente> gerentes;
    private static List<Club> clubesParticipantes;
    private static List<Sede> sedes;
    protected static List<Partida> partidas;
    
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
            
            federaciones = new ArrayList<>();
            usuarios = new HashMap<>();
            jugadoresParticipantes = new HashMap<>();
            entrenadoresParticipantes = new HashMap<>();
            gerentes = new HashMap<>();
            torneos = new ArrayList<>();
            clubesParticipantes = new ArrayList<>();
            sedes = new ArrayList<>();
            partidas = new ArrayList<>();            
        }      
        return singleton;        
    }      
    
    public static void initUsuariosPorDefecto() {   
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        
        Torneo torneo = new Torneo("Torneo internacional de La Comunidat Valenciana", Federacion.FEDERACION_VALENCIANA);
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
                       
        Sede sedeValencia = Sede.builder().nombre("Valencia").direccion("C/ de Guillem de Castro, 65").telefono("963153005").build();sedeValencia.loadFechas();
        Sede sedeVillareal = Sede.builder().nombre("Villareal").direccion("C/ Federico de Saboya, 102").telefono("9867030303").build();sedeVillareal.loadFechas();
        sedes.add(sedeValencia); sedes.add(sedeVillareal);
        
        Club club1, club2, club3, club4, club5;
                
        club1 = new Club("Club de Ajedrez Massanassa", sedeValencia, Federacion.FEDERACION_VALENCIANA, e1);
        club2 = new Club("Club de Ajedrez Vila-real", sedeVillareal, Federacion.FEDERACION_VALENCIANA, e2);
        club3 = new Club("Club de Paiporta", sedeValencia, Federacion.FEDERACION_VALENCIANA);
        club4 = new Club("Club de Torrent", sedeValencia, Federacion.FEDERACION_VALENCIANA);
        club5 = new Club("Club de Sedaví", sedeValencia, Federacion.FEDERACION_VALENCIANA);
                
        clubesParticipantes.add(club1); clubesParticipantes.add(club2);
        clubesParticipantes.add(club3); clubesParticipantes.add(club4); 
        clubesParticipantes.add(club5);
                
        e1.setClubesDondeTrabaja(new ArrayList<Club>() {{ add(club1); }});
        e2.setClubesDondeTrabaja(new ArrayList<Club>(){{ add(club2); }});
        
        entrenadoresParticipantes.put(e1.getLogin(), e1);
        entrenadoresParticipantes.put(e2.getLogin(), e2);
        usuarios.put(e1.getLogin(), e1);
        usuarios.put(e2.getLogin(), e2);
                   
        LocalDate fechaNacGerente1 = LocalDate.parse("02/04/1960", df);        
        LocalDate fechaNacGerente2 = LocalDate.parse("14/12/1980", df);        
                
        Gerente g1, g2;
        g1 = Gerente.builder().login("gerente1").password("gerente1")
                .nombre("Manuel Antonio").apellidos("Benitez Plasencia")
                .fechaNacimiento(fechaNacGerente1).nomina(2400).IRPF(23).clubActual(club4).build();        
        g2 = Gerente.builder().login("gerente2").password("gerente2")
                .nombre("Antonio David").apellidos("Garcia Fuertes").fechaNacimiento(fechaNacGerente2)
                .nomina(3400).IRPF(26).clubActual(club2).build();
        
        usuarios.put(g1.getLogin(), g1);
        usuarios.put(g2.getLogin(), g2);
        gerentes.put(g1.getLogin(), g1);
        gerentes.put(g2.getLogin(), g2);
        
        Jugador ezz, vic, adri;        
        ezz = Jugador.builder().login("ezz").password("ezz").nombre("Ezzideen").apellidos("Naasan")
                    .DNI("1111111111").club(club1).entrenador(e1).torneo(torneo).ligaAjedrez(singleton).build(); 
        ezz.crearListaPartidas();
        adri = Jugador.builder().login("adri").password("adri").nombre("Adrian")
                    .apellidos("Cozma")
                    .DNI("2222222222").club(club2).entrenador(e2).torneo(torneo).ligaAjedrez(singleton).build();                        
        adri.crearListaPartidas();
        vic = Jugador.builder().login("vic").password("vic").nombre("Victor").apellidos("Marzal Llopis")
                    .DNI("3333333333").club(club2).entrenador(e2).torneo(torneo).ligaAjedrez(singleton).build();
        vic.crearListaPartidas();
        
        jugadoresParticipantes.put(ezz.getLogin(), ezz);
        jugadoresParticipantes.put(adri.getLogin(), adri);
        jugadoresParticipantes.put(vic.getLogin(), vic);                                                
        usuarios.put(ezz.getLogin(), ezz);
        usuarios.put(adri.getLogin(), adri);
        usuarios.put(vic.getLogin(), vic);   
        
        // Partidas sin sede asignada para comprobar cosas
        adminUser.cargarPartidasSinSede();
        String fechaAux = "25/11/2020";
        Date fecha ;
        SimpleDateFormat cambioFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fecha = cambioFecha.parse(fechaAux);
            Partida p1,p2;
            p1 = Partida.builder().jugador1("ezz").jugador2("adri2").fecha(fecha).build();
            p2 = Partida.builder().jugador1("adri").jugador2("ezz").fecha(fecha).build();            
            adminUser.addPartidaSinSede(p1);
            adminUser.addPartidaSinSede(p2);
        } catch (ParseException ex) {
            System.out.print(ex);
        }
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

    public List<Sede> getSedes() {
        return sedes;
    }
    
    public List<Partida> getPartidas() {
        return partidas;
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
