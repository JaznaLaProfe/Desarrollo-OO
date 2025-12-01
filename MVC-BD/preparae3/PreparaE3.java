/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preparae3;

import controlador.ControladorPelicula;
import vista.VistaPelicula;

/**
 *
 * @author Jazna
 */
public class PreparaE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaPelicula vista = new VistaPelicula();
        ControladorPelicula controlador = new ControladorPelicula(vista);
        controlador.inicializar();
    }
    
}
