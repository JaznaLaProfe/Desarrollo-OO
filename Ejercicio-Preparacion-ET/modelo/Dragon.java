/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jazna
 */
public class Dragon extends Criatura {

    private String tipoFuego;

    public Dragon(String tipoFuego, String nombre, int nivelPoder) {
        super(nombre, nivelPoder);
        this.setTipoFuego(tipoFuego);
    }

    public String getTipoFuego() {
        return tipoFuego;
    }

    public void setTipoFuego(String tipoFuego) {
        if (tipoFuego.equalsIgnoreCase("fuego")
                || tipoFuego.equalsIgnoreCase("veneno")
                || tipoFuego.equalsIgnoreCase("rayo")
                || tipoFuego.equalsIgnoreCase("hielo")) {
            this.tipoFuego = tipoFuego;
        } else {
            throw new IllegalArgumentException("Tipo de fuego inválido");
        }
    }

}
