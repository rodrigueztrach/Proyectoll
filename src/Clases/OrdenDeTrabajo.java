
package Clases;

import java.util.ArrayList;
import java.util.Date;


public class OrdenDeTrabajo {
    private String numeroOrden;
    private Cliente cliente; 
    private Vehiculo vehiculo; 
    private ArrayList<Servicio> servicios; 
    private Date fecha; 
    private String estado; 
    private String observaciones; 

    public OrdenDeTrabajo(String numeroOrden, Cliente cliente, Vehiculo vehiculo, ArrayList<Servicio> servicios, Date fecha, String estado, String observaciones) {
        this.numeroOrden = numeroOrden;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.servicios = servicios;
        this.fecha = fecha;
        this.estado = estado;
        this.observaciones = observaciones;
    }
    
    
    public void agregarServicio(Servicio servicio){
        servicios.add(servicio);
    }
    
    public double calcularTotal(){
        double total = 0;
        for (Servicio servicio : servicios ){
            total += servicio.calcularTotal();
            
        }
        return total; 
    }  
    
    public String generarFactura(){
        StringBuilder factura = new StringBuilder();
        
        factura.append("Orden de trabajo #").append(numeroOrden).append("\n");
        factura.append("Cliente: ").append(cliente.getNombre()).append("\n");
        factura.append("Vehiculo: ").append(vehiculo.toString()).append("\n");
        factura.append("Servicio : \n");
        
        for(Servicio servicio : servicios ) {
            factura.append("").append(servicio.generarFactura()).append("\n");
        }
        
        factura.append("Total: ").append(calcularTotal());
        return factura.toString();
    }
}
