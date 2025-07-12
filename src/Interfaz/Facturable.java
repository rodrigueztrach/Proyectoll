
package Interfaz;

import java.util.Date;

public interface Facturable {
    String generarFactura();
    double calcularTotal();
    Date getFecha(); 
}
