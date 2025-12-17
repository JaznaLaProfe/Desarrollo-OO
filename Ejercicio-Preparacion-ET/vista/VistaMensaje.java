/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Jazna
 */
public class VistaMensaje {
    public static void verMensajeError(JDialog parent, String mensaje) {
        JOptionPane.showMessageDialog(parent, mensaje,
                "Descripción error", JOptionPane.ERROR_MESSAGE);
    }

    public static void verMensajeInfo(JDialog parent, String mensaje) {
        JOptionPane.showMessageDialog(parent, mensaje, "Información",
                JOptionPane.INFORMATION_MESSAGE);
    }    
}
