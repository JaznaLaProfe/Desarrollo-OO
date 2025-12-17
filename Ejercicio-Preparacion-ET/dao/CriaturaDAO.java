/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Criatura;
import modelo.RegistroCriatura;

/**
 *
 * @author Jazna
 */
public class CriaturaDAO implements CrudDAOable<Criatura> {

    @Override
    public void create(Criatura t) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        RegistroCriatura.agregar(t);
    }

    @Override
    public boolean read(Criatura t) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Criatura> read() throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        return RegistroCriatura.getCriaturas();
    }

    @Override
    public void update(Criatura t) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Criatura t) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
