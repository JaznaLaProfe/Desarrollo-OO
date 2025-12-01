/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pelicula;
import vista.VistaMensaje;
import vista.VistaPelicula;

/**
 *
 * @author Jazna
 */
public class ControladorPelicula {

    private VistaPelicula vista;
    private Pelicula modelo = new Pelicula();

    public ControladorPelicula(VistaPelicula vista) {
        this.vista = vista;
    }

    public void inicializar() {
        /* Setear las acciones de la vista */
        this.vista.getBtnLimpiar().addActionListener(e -> limpiarFormulario());
        this.vista.getBtnListar().addActionListener(e -> verRegistros());
        this.vista.getBtnAgregar().addActionListener(e -> agregarRegistro());
        this.vista.setVisible(true);
    }

    private void limpiarFormulario() {
        this.vista.getTfNombre().setText("");
        this.vista.getTfAparicion().setText("0");
        this.vista.getTfPopularidad().setText("0");
        this.vista.getTfNombre().requestFocus();
    }

    private void agregarRegistro() {
        /* Rescata los datos desde la vista */
        String nombre = this.vista.getTfNombre().getText();
        try {
            int aparicion = Integer.parseInt(this.vista.getTfAparicion().getText());
            double popularidad = Double.parseDouble(this.vista.getTfPopularidad().getText());
            this.modelo = new Pelicula(nombre, aparicion, popularidad);

            this.modelo.agregar();
            
            VistaMensaje.verMensajeInfo(null, "Película agregada con éxito");
            this.limpiarFormulario();
            this.verRegistros();

        } catch (NumberFormatException ex) {
            VistaMensaje.verMensajeError(null, "Problemas para registrar la película\n" + ex.getMessage());
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ControladorPelicula.class.getName()).log(Level.SEVERE, null, ex);

        } catch (Exception ex) {
            Logger.getLogger(ControladorPelicula.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    private void verRegistros() {
        try {
            /* Ordena a la vista que muestre los registros */
            this.vista.verRegistros(this.modelo.leer());
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ControladorPelicula.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
