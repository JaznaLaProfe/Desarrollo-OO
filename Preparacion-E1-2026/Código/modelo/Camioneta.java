package modelo;

public class Camioneta extends Vehiculo{
    private double carga;
    public Camioneta(String patente, int diasArriendo, double precioBaseArriendo, double carga){
        super(patente, diasArriendo, precioBaseArriendo);
        this.setCarga(carga);
    }

    public double getCarga(){ return this.carga; }

    public void setCarga(double carga){
        this.carga = carga;
    }

    public double calcularValorArriendo(){
        return this.getPrecioBaseArriendo()*this.carga;
    }

    public String toString(){
        return super.toString() +" carga de " + this.carga +
                " toneladas - Costo total arriendo " + this.calcularValorArriendo();
    }
}
