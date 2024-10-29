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
public class Documentales extends streamflex.StreamFlex{
   private int duracionMin;
   private String enfoqueDocumental;
   private String nombre1; 

    public Documentales() {
    }

    public Documentales(int duracionMin, String enfoqueDocumental, String nombre1) {
        this.duracionMin = duracionMin;
        this.enfoqueDocumental = enfoqueDocumental;
        this.nombre1 = nombre1;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public String getEnfoqueDocumental() {
        return enfoqueDocumental;
    }

    public void setEnfoqueDocumental(String enfoqueDocumental) {
        this.enfoqueDocumental = enfoqueDocumental;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }
   

    public double descDocumental(){
        if(duracionMin > 90){
         return COSTO_BASE_SUSCRIPCION / 1.05;
        }else{
            return COSTO_BASE_SUSCRIPCION;
        }
    }

    @Override
    public String toString() {
        return "Documentales{" + "duracionMin=" + duracionMin + ", enfoqueDocumental=" + enfoqueDocumental + ", nombre1=" + nombre1 + '}';
    }
    
 
}
