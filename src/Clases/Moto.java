
package Clases;


public class Moto extends Vehiculo{
    
    private int cilindraje; 
    private String tipoMoto;

    public Moto(int cilindraje, String tipoMoto, String placa, String marca, String modelo, int año, String color) {
        super(placa, marca, modelo, año, color);
        this.cilindraje = cilindraje;
        this.tipoMoto = tipoMoto;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindraje=" + cilindraje + ", tipoMoto=" + tipoMoto + '}';
    }
}
