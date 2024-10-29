/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamflex;

import Base.Documentales;
import Base.Pelicula;
import Base.Series;
import java.util.Scanner;


/**
 *
 * @author Cetecom
 */
public class StreamFlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula pelicula1 = new Pelicula();
        Series series1 = new Series();
        Documentales documentales1 = new  Documentales();
        
        Scanner entrada  = new Scanner(System.in);
        
        while (true) { 
            System.out.println("**********************");
            System.out.println("***** STREAMFLEX *****");
            System.out.println("**********************");
            System.out.println("[1.] Agregar Pelicula.");
            System.out.println("[2.] Agregar Serie.");
            System.out.println("[3.] Agregar Documental.");
            System.out.println("[4.] Ver Lista del catalogo.");
            System.out.println("[5.] Estado de la suscripcion.");
            System.out.println("[6.] Canselar suscripcion.");
            System.out.println("[7.] Salir de STREAM-FLIXS");
            
            int opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la Pelicula.");
                    pelicula1.setNomPelicula(entrada.next());
                    System.out.println("Pelicula Agregada");
                    
                case 2:
                    System.out.println("Ingrese el nombre de la Serie.");
                    series1.setNombre(entrada.next());
                    System.out.println("serie agregada.");
                    
                case 3:
                    System.out.println("Ingrese el nombre del documental.");
                    documentales1.setNombre1(entrada.next());
            } 
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
