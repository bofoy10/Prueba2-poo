/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

import static Base.Suscripcion.COSTO_BASE_SUSCRIPCION;
import streamflex.StreamFlex;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends StreamFlex{
    private String duracion;
    private String nomPelicula;
    private Usuario usuario;

    public Pelicula() {
    }

    public Pelicula(String duracion, String nomPelicula, Usuario usuario) {
        this.duracion = duracion;
        this.nomPelicula = nomPelicula;
        this.usuario = usuario;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNomPelicula() {
        return nomPelicula;
    }

    public void setNomPelicula(String nomPelicula) {
        this.nomPelicula = nomPelicula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    public double aumentoPelicula(){
        if (usuario.getCalificacion() > 4.5){
            return COSTO_BASE_SUSCRIPCION * 1.10;
        }else{
            return COSTO_BASE_SUSCRIPCION;
        }
       
    }
    
    
    
    @Override
    public String toString() {
        return "Pelicula{" + "duracion=" + duracion + ", nomPelicula=" + nomPelicula + ", usuario=" + usuario + '}';
    }

    void add(Pelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}