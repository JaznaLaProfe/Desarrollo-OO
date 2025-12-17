/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Jazna
 */
public class RegistroCriatura {
    private static ArrayList<Criatura> criaturas = new ArrayList();
    
    public static void agregar(Criatura nueva) throws Exception{
        if (!criaturas.contains(nueva)){
            criaturas.add(nueva);
        }
        else{
            throw new Exception("Criatura repetida");
        }
    }

    public static ArrayList<Criatura> getCriaturas() {
        return criaturas;
    }
    
    
}
