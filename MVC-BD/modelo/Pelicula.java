/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import dao.PeliculaDAO;
import java.util.ArrayList;

/**
 *
 * @author Jazna
 */
public class Pelicula {
   private String nombre;
   private int aparicion;
   private double popularidad;

    public Pelicula() {
    }

    public Pelicula(String nombre, int aparicion, double popularidad) {
        this.nombre = nombre;
        this.aparicion = aparicion;
        this.popularidad = popularidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAparicion() {
        return aparicion;
    }

    public void setAparicion(int aparicion) {
        this.aparicion = aparicion;
    }

    public double getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(double popularidad) {
        this.popularidad = popularidad;
    }
   
    public ArrayList<Pelicula> leer() throws InstantiationException, IllegalAccessException, Exception{
        PeliculaDAO dao = new PeliculaDAO();
        return dao.read();
    }
    
    public void agregar() throws InstantiationException, IllegalAccessException, Exception{
        PeliculaDAO dao = new PeliculaDAO();
        dao.create(this);
    }
}
