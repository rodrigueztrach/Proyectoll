
package Clases;

import java.util.ArrayList;


public class Cliente extends Persona {
    
  private String cedula; 
  private String direccion; 
  private ArrayList<Vehiculo> Vehiculos; 

    public Cliente(String cedula, String direccion, ArrayList<Vehiculo> Vehiculos, String nombre, String apellido, String email, String telefono) {
        super(nombre, apellido, email, telefono);
        this.cedula = cedula;
        this.direccion = direccion;
        this.Vehiculos = Vehiculos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return Vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> Vehiculos) {
        this.Vehiculos = Vehiculos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", direccion=" + direccion + ", Vehiculos=" + Vehiculos + '}';
    }
}
