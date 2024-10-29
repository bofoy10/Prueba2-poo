/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Auxiliar {
    private List<Pelicula> peliculaList = new ArrayList<>();
     private List<Series> seriesList = new ArrayList<>();
      private List<Documentales> documentalesList = new ArrayList<>();
    
    public void agregarPelicula(Pelicula pelicula){
        peliculaList.add(pelicula);
    }
    
    public void agregarSerie(Series serie){
        seriesList.add(serie);
    }
    
    public void agregarDocumental(Documentales documental){
        documentalesList.add(documental);
    }
    
    public void listarPeliculas (){
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
