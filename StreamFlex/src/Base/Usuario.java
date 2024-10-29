/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

/**
 *
 * @author Cetecom
 */
public class Usuario {
    private  int calificacion;
    private String nombreUsuario;

    public Usuario() {
    }

    public Usuario(int calificacion, String nombreUsuario) {
        this.calificacion = calificacion;
        this.nombreUsuario = nombreUsuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "calificacion=" + calificacion + ", nombreUsuario=" + nombreUsuario + '}';
    }
    
}
