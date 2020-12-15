/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList; // import the ArrayList class
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class Sede {

    protected ArrayList<Fecha> fechas;// Create an ArrayList object

    private String direccion;
    private String telefono;
    private String nombre;
    /*
        RET = 3
        DETS = 1
    */

    //Ezz- funcion que carga las fechas de los 30 dias siguientes 
    public void loadFechas() {
        fechas = new ArrayList<Fecha>();
        for (int i = 1; i < 31; i++) {
            SimpleDateFormat cambioFecha = new SimpleDateFormat("dd/MM/yyyy");
            Date date = java.util.Calendar.getInstance().getTime(); //fecha de hoy

            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE, i); //aNadimos el dia

            String s = new SimpleDateFormat("dd/MM/yyyy").format(cal.getTime());
            Fecha f;
            try {
                Date y = cambioFecha.parse(s);
                f = new Fecha(y); //creamos la nueva fecha con sus franjas horarias
                fechas.add(f); //le aNadimos al arraylist
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }
    /* EI
    DET = 1
    FTR = 1  
    */

    public List<String> getHorariosDisponible(Date d) {
        System.out.println("3");
        List<String> horasDisponible = new ArrayList<String>();
        for (Fecha fecha : fechas) {
            //si una de las fechas de los siguientes 30 dias es equal ala fecha introducida
            //pues la aNadimos sus horariosCorrespondientes
            if (fecha.getFecha().compareTo(d) == 0) {
                horasDisponible = fecha.getHorariosDisponible();
            }
        }
        return horasDisponible;
    }
    /* EQ 
    DET = 1
    FTR =  1 
    */

    public void asignarFranjaHoraria(Date d, int i) {
        System.out.println("asignarFranjaHoraria()");
        System.out.println(d);
        for (Fecha fecha : fechas) {
            System.out.println(fecha.getFecha());
            if (fecha.getFecha().compareTo(d) == 0) {
                System.out.println("dentro");
                fecha.asignarFranjaHoraria(i);
            }
        }
    }
    /* EI
    DET = 2
    FTR = 1
    */

    public String getNombre() {
        return nombre;
    }
    /* EQ 
    DET = 0
    FTR =  1 
    */

}

class Fecha {

    Date fecha;
    List<String> horasDisponible = new ArrayList<String>(); // Create an ArrayList object

    public Fecha(Date fecha) {

        this.fecha = fecha;
        this.horasDisponible.add("8-10"); //elemento 0
        this.horasDisponible.add("10-12");//1  
        this.horasDisponible.add("12-14");//2
        this.horasDisponible.add("16-18");//3
        this.horasDisponible.add("18-20");//4
    }/* EI
    DET = 1
    FTR = 1  
    */

    public Date getFecha() {
        return fecha;
    }
    /* EQ 
    DET = 0
    FTR =  1 
    */

    public List<String> getHorariosDisponible() {        
        return horasDisponible;
    }
    /* EQ 
    DET = 0
    FTR =  1  
    */
    public void asignarFranjaHoraria(int i) {        
        horasDisponible.remove(i);
    }
    /* EI
    DET = 1
    FTR = 1    
    */
}
