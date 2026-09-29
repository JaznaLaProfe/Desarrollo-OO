package modelo;

public abstract class Vehiculo implements ICalculable{
    /* Definiciòn de los atributos */
    private String patente;
    private int diasArriendo;
    private double precioBaseArriendo;

    /* Constructor */
    public Vehiculo(String patente, int diasArriendo, double precioBaseArriendo){
        this.setPatente(patente);
        this.setDiasArriendo(diasArriendo);
        this.setPrecioBaseArriendo(precioBaseArriendo);
    }
    /* Métodos GETTER */
    public String getPatente(){
        return this.patente;
    }

    public int getDiasArriendo(){ return this.diasArriendo;}

    public double getPrecioBaseArriendo(){ return this.precioBaseArriendo;}

    /* Métodos SETTER */
    public void setPatente(String patente){
        if (patente != null && patente.length() == 6){
            this.patente = patente;
        }
        else {
            throw new IllegalArgumentException("Patente no cumple con requisito");
        }
    }

    public void setDiasArriendo(int diasArriendo){
        if (diasArriendo <= 0){
            throw new IllegalArgumentException("Dìas de arriendo no cumple con requisito");
        }
        this.diasArriendo = diasArriendo;
    }

    public void setPrecioBaseArriendo(double precioBaseArriendo){
        if (precioBaseArriendo <= 15000){
            throw new IllegalArgumentException("Precio base no cumple con requisito");
        }
        this.precioBaseArriendo = precioBaseArriendo;
    }

    public String toString(){
        return "Matricula " + this.patente + " Dias arriendo " + this.diasArriendo +
                " Precio base arriendo " + this.precioBaseArriendo;
    }
}
