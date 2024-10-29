/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

import static Base.Suscripcion.COSTO_BASE_SUSCRIPCION;


/**
 *
 * @author Cetecom
 */
public class Series extends streamflex.StreamFlex{
    private boolean finalizada;
    private int numTemporadas;
    private String nombre;

    public Series() {
    }

    public Series(boolean finalizada, int numTemporadas, String nombre) {
        this.finalizada = finalizada;
        this.numTemporadas = numTemporadas;
        this.nombre = nombre;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public double aumentoSerie(){
        if (numTemporadas > 3 ){
            if(finalizada  = false){
                return COSTO_BASE_SUSCRIPCION * 1.8;
            }
        }
        return COSTO_BASE_SUSCRIPCION;
        
    }        

    @Override
    public String toString() {
        return "Series{" + "finalizada=" + finalizada + ", numTemporadas=" + numTemporadas + ", nombre=" + nombre + '}';
    }



    
}
