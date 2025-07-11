
package Clases;

import Interfaz.Facturable;
import java.util.Date;


 abstract class Servicio implements Facturable  {

   private String codigo; 
   private String nombre; 
   private String descripcion;
   private double precio; 
   private Date fecha;

    public Servicio(String codigo, String nombre, String descripcion, double precio, Date fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
    }
    
   @Override
   public double calcularTotal(){
       return precio; 
   }
   
   @Override
   public String generarFactura(){
       return "Servicio: " + nombre + "$$ : " + precio;
   }
   
   @Override
   public Date getFecha(){
       return fecha; 
   }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
   
}
