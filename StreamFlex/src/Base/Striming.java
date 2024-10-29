/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

/**
 *
 * @author Cetecom
 */
public class Striming {
    private String id;
    private String nombre;
    private boolean recomendado;

    public Striming() {
    }

    public Striming(String id, String nombre, boolean recomendado) {
        this.id = id;
        this.nombre = nombre;
        this.recomendado = recomendado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRecomendado() {
        return recomendado;
    }

    public void setRecomendado(boolean recomendado) {
        this.recomendado = recomendado;
    }

    @Override
    public String toString() {
        return "Striming{" + "id=" + id + ", nombre=" + nombre + ", recomendado=" + recomendado + '}';
    }
    
    
}   
