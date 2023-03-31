/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postnet;

/**
 * 
 * @author Fabio
 */

public class Ticket {
/**
 *
 * 
 * @param nombreApellido Nombre y apellido del titular.
 * @param montoTotal Monto total.
 * @param montoPorCuota Monto dependiendo de la cuota adquirida.
 * @param Ticket Almacena todos los datos del ticket.
 * @return Devuelve el nombre, monto total y monto por cuota.
 */
    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;

    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }
    
    /**
     *  Metodo para obtener el nombre, monto y cuota.
     * @return devuelve en un toString el nombre el monto y la cuota.
     */
    
    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montoTotal=" + montoTotal + ", montoPorCuota" + '}';
    }
    
}
