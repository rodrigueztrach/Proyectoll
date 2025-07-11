
package Clases;


public class Auto extends Vehiculo {
    
    private int numeroPuertas; 
    private String tipoTransmicion; 

    public Auto(int numeroPuertas, String tipoTransmicion, String placa, String marca, String modelo, int año, String color) {
        super(placa, marca, modelo, año, color);
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmicion = tipoTransmicion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoTransmicion() {
        return tipoTransmicion;
    }

    public void setTipoTransmicion(String tipoTransmicion) {
        this.tipoTransmicion = tipoTransmicion;
    }

    @Override
    public String toString() {
        return "Auto{" + "numeroPuertas=" + numeroPuertas + ", tipoTransmicion=" + tipoTransmicion + '}';
    }
}
