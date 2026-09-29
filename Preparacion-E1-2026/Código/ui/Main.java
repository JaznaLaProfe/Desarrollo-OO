package ui;

import modelo.GestionVehiculos;
import modelo.Automovil;
import modelo.Camioneta;
import modelo.Vehiculo;

public class Main {
    public static void main(String[] args) {
        GestionVehiculos listado = new GestionVehiculos();
        try {
            Automovil ax = new Automovil("BRPY46", 3, 25000, true);
            if (listado.agregarVehiculo(ax)){
                System.out.println("[" + ax.getPatente() + "] agregado con éxito");
            }
            else{
                System.out.println("[" + ax.getPatente() + "] NO FUE agregado con éxito");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Mensaje : " + e.getMessage());
        }

        try {
            Camioneta cx = new Camioneta("BBJS12", 5, 40000, 2.5);
            /* Cambia el precio base */
            cx.setPrecioBaseArriendo(cx.getPrecioBaseArriendo()*1.2);
            System.out.println("Precio base nuevo es " + cx.getPrecioBaseArriendo());
            if (listado.agregarVehiculo(cx)){
                System.out.println("[" + cx.getPatente() + "] agregado con éxito");
            }
            else{
                System.out.println("[" + cx.getPatente() + "] NO FUE agregado con éxito");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Mensaje : " + e.getMessage());
        }

        try {
            Automovil ay = new Automovil("DDJD75", 4, 22000, false);
            if (listado.agregarVehiculo(ay)){
                System.out.println("[" + ay.getPatente() + "] agregado con éxito");
            }
            else{
                System.out.println("[" + ay.getPatente() + "] NO FUE agregado con éxito");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Mensaje : " + e.getMessage());
        }
        try {
            Camioneta cy = new Camioneta("GHDD89", 2, 35000, 1.0);
            if (listado.agregarVehiculo(cy)){
                System.out.println("[" + cy.getPatente() + "] agregado con éxito");
            }
            else{
                System.out.println("[" + cy.getPatente() + "] NO FUE agregado con éxito");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Mensaje : " + e.getMessage());
        }

        /* Busca una patente*/
        if (listado.existeVehiculo("GHDD89")){
            System.out.println("Vehiculo existe");
        }
        else{
            System.out.println("Vehiculo NO existe");
        }
        for(Vehiculo v : listado.getVehiculos()){
            System.out.println(v);
        }
    }
}
