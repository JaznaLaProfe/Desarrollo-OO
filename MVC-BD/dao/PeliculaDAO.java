/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.Conexion;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.Pelicula;

/**
 *
 * @author Jazna
 */
public class PeliculaDAO implements CrudDAOable<Pelicula> {

    @Override
    public void create(Pelicula t) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        String sql = "INSERT INTO pelicula(nombre, aparicion, popularidad) VALUES(?,?,?)";
        try (Connection cx = Conexion.open()) {
            PreparedStatement ps = cx.prepareStatement(sql);
            ps.setString(1, t.getNombre());
            ps.setInt(2, t.getAparicion());
            ps.setDouble(3, t.getPopularidad());
            ps.executeUpdate();
        }
    }

    @Override
    public boolean read(Pelicula t) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Pelicula> read() throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        ArrayList<Pelicula> lista = new ArrayList();
        String sql = "SELECT nombre, aparicion, popularidad FROM pelicula;";
        try (Connection cx = Conexion.open()) {
            PreparedStatement ps = cx.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                /* Extrae los valores de los campos del registro */
                String nombre = rs.getString("nombre");
                int aparicion = rs.getInt("aparicion");
                double popularidad = rs.getDouble("popularidad");
                
                Pelicula p = new Pelicula(nombre, aparicion, popularidad);
                
                lista.add(p);
            }
        }
        return lista;
    }

    @Override
    public void update(Pelicula t) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Pelicula t) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
