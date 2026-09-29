package modelo;

public class Automovil extends Vehiculo{
    private boolean tieneSeguro;
    public Automovil(String patente, int diasArriendo, double precioBaseArriendo, boolean tieneSeguro){
        super(patente, diasArriendo, precioBaseArriendo);
        this.setTieneSeguro(tieneSeguro);
    }

    public boolean getTieneSEguro(){ return this.tieneSeguro;}
    public void setTieneSeguro(boolean tieneSeguro){
        this.tieneSeguro = tieneSeguro;
    }
    public double calcularValorArriendo(){
        double costoBase = this.getDiasArriendo()*this.getPrecioBaseArriendo();
        return (this.tieneSeguro? costoBase + 15000: costoBase);
    }

    public String toString(){
        return super.toString() + (this.tieneSeguro?" CON ": " SIN ") +
                "SEGURO - Costo total arriendo " + this.calcularValorArriendo();
    }
}
