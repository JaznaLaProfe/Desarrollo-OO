package modelo;

import java.util.ArrayList;

public class GestionVehiculos {
    private final ArrayList<Vehiculo> vehiculos;

    public GestionVehiculos(){
        this.vehiculos = new ArrayList();
    }

    public ArrayList<Vehiculo> getVehiculos(){
        return this.vehiculos;
    }

    public boolean existeVehiculo(String patente){
        for(Vehiculo v : this.vehiculos){
            if (v.getPatente().equalsIgnoreCase(patente)){
                return true;
            }
        }
        return false;
    }

    public boolean agregarVehiculo(Vehiculo v){
        if (!this.existeVehiculo(v.getPatente())){
            /* Agregar el elemento a la colección */
            this.vehiculos.add(v);
            return true;
        }
        return false;
    }

}
