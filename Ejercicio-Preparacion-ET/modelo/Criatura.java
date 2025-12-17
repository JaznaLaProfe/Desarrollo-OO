/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import dao.CriaturaDAO;
import java.util.ArrayList;

/**
 *
 * @author Jazna
 */
public class Criatura {
    private String nombre;
    private int nivelPoder;

    public Criatura(String nombre, int nivelPoder) {
        this.setNombre(nombre);
        this.setNivelPoder(nivelPoder);
    }

    public Criatura() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()){
            this.nombre = nombre;
        }
        else{
            throw new IllegalArgumentException("Nombre no puede ser vacío");
        }
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        if (nivelPoder >= 0 && nivelPoder <= 100){
            this.nivelPoder = nivelPoder;
        }
        else{
            throw new IllegalArgumentException("Nivel de poder debe estar entre 0 y 100\nValor " + nivelPoder + " es inválido");
        }        
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Criatura){
            return this.nombre.equalsIgnoreCase(((Criatura) o).nombre);
        }
        return false;
    }
    
    public void agregar() throws InstantiationException, IllegalAccessException, Exception{
        CriaturaDAO dao = new CriaturaDAO();
        dao.create(this);
    }
    
    public ArrayList<Criatura> leer() throws InstantiationException, IllegalAccessException, Exception{
        CriaturaDAO dao = new CriaturaDAO();
        return dao.read();
    }
}
