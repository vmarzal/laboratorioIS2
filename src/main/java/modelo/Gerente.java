/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Ezzedine
 */
public class Gerente {
    protected DatosPersonales datosPersonales;
    protected ArrayList<Club> historicoClubes = new ArrayList<Club>();
    protected ArrayList<Float> historicoNominas= new ArrayList<Float>();
    protected ArrayList<Float> historicoRetenciones= new ArrayList<Float>();
    protected float nomina, IRPF;

    public Gerente() {
    }

    public Gerente(DatosPersonales datosPersonales, float nomina, float IRPF) {
        this.datosPersonales = datosPersonales;
        this.nomina = nomina;
        this.IRPF = IRPF;
    }
    
    
    
}
