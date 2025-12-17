/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jazna
 */
public class HechiceroOscuro extends Criatura {

    private String grimonio;

    public HechiceroOscuro(String grimonio, String nombre, int nivelPoder) {
        super(nombre, nivelPoder);
        this.grimonio = grimonio;
    }

    public String getGrimonio() {
        return grimonio;
    }

    public void setGrimonio(String grimonio) {
        if (grimonio.equalsIgnoreCase("conjuro")
                || grimonio.equalsIgnoreCase("rituales")
                || grimonio.equalsIgnoreCase("magia prohibida")) {
            this.grimonio = grimonio;
        } else {
            throw new IllegalArgumentException("Grimonio inválido");
        }
    }

}
