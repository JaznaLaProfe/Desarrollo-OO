/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Criatura;
import modelo.Dragon;
import modelo.HechiceroOscuro;
import vista.VistaCriatura;
import vista.VistaMensaje;

/**
 *
 * @author Jazna
 */
public class ControladorCriatura {
    private VistaCriatura vista;
    private Criatura modelo;

    public ControladorCriatura(VistaCriatura vista) {
        this.vista = vista;
    }
    
    public void inicializar(){
        /* Setea los valores del combobox del tipo */
        this.vista.getCbTipo().removeAllItems();
        this.vista.getCbTipo().addItem("Dragón");
        this.vista.getCbTipo().addItem("Hechicero oscuro");
        
        this.vista.getCbCaracteristica().removeAllItems();
        this.vista.getCbCaracteristica().addItem("Fuego");
        this.vista.getCbCaracteristica().addItem("Hielo");
        this.vista.getCbCaracteristica().addItem("Rayo");
        this.vista.getCbCaracteristica().addItem("Veneno");
        
        
        this.vista.getCbTipo().addActionListener(e -> setearControles());
        this.vista.getBtnLimpiar().addActionListener(e -> limpiarFormulario());
        this.vista.getBtnAgregar().addActionListener(e -> agregarCriatura());
        
        this.vista.setVisible(true);
    }
    
    public void setearControles(){
        ArrayList<String> opciones = new ArrayList();
        /* Obtener la selección del tipo de criatura */
        String tipo = (String) this.vista.getCbTipo().getSelectedItem();
        if (tipo.equalsIgnoreCase("dragón")){
            this.vista.getLbCaracteristica().setText("TIPO DE FUEGO");
            opciones.add("Fuego"); opciones.add("Hielo");
            opciones.add("Veneno"); opciones.add("Rayo");
        }
        else{
            this.vista.getLbCaracteristica().setText("GROMINIO");
            opciones.add("Conjuro"); opciones.add("Ritual");
            opciones.add("Magia prohibida"); 
        }
        
        this.vista.getCbCaracteristica().removeAllItems();
        for(String opcion : opciones){
            this.vista.getCbCaracteristica().addItem(opcion);
        }
    }
    
    public void limpiarFormulario(){
        this.vista.getTfNombre().setText("");
        this.vista.getTfNivelPoder().setText("0");
        this.vista.getCbTipo().setSelectedIndex(0);
        this.vista.getCbCaracteristica().setSelectedIndex(0);
        
        this.vista.getTfNombre().requestFocus();
    }
    
    public void agregarCriatura(){
        try {
            String nombre = this.vista.getTfNombre().getText();
            int nivelPoder = Integer.parseInt(this.vista.getTfNivelPoder().getText());
            String tipo = (String) this.vista.getCbTipo().getSelectedItem();
            if (tipo.equalsIgnoreCase("dragón")){
                String tipoFuego = (String) this.vista.getCbCaracteristica().getSelectedItem();
                this.modelo = new Dragon(tipoFuego, nombre, nivelPoder);
            }
            else{
                String grimonio = (String) this.vista.getCbCaracteristica().getSelectedItem();
                this.modelo = new HechiceroOscuro(grimonio, nombre, nivelPoder);
            }
            /* Guarda el objeto en la colección */
            this.modelo.agregar();
            VistaMensaje.verMensajeInfo(null, "Criatura agregada");
            this.vista.verRegistros(this.modelo.leer());
            this.limpiarFormulario();
        } catch (IllegalAccessException ex) {
            VistaMensaje.verMensajeError(null, "Problema al agregar criatura\n" + 
                    ex.getMessage());
        } catch (Exception ex) {
            VistaMensaje.verMensajeError(null, "Problema al agregar criatura\n" + 
                    ex.getMessage());
        }
                
                
    }
}
