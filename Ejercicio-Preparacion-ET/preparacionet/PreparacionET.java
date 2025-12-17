/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preparacionet;

import controlador.ControladorCriatura;
import vista.VistaCriatura;

/**
 *
 * @author Jazna
 */
public class PreparacionET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaCriatura vista = new VistaCriatura();
        ControladorCriatura controlador = new ControladorCriatura(vista);
        controlador.inicializar();
        
    }
    
}
