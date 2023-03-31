/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postnet;

/**
 *
 * @author Fabio
 */
public class Postnet {
        public static final double RECARGO_POR_CUOTA = 0.03;
        public static final int MIN_CANT_CUOTAS=1;
        public static final int MAX_CANT_CUOTAS=6;
        
        /**
         *  Método para efectuar un pago
         * @param tarjeta  objeto TarjetaCredito usada
         * @param montoAbonar cantidad que abona
         * @param cantidadCuotas cantidad de cuotas
         * @return en caso de error devuelve un ticket nulo. En caso de éxito devuelve un ticket
         */
        
        public Ticket efectuarPago (TarjetaCredito tarjeta, double montoAbonar, int cantidadCuotas) {

            Ticket ticket = null;
            if (datosValidos(tarjeta, montoAbonar, cantidadCuotas)) {
                
             double montoTotal = montoAbonar + montoAbonar * RECARGO_POR_CUOTA;
                
            }
            
            return ticket;
        }
        
                /**
         *  Método para comprobar los datos
         * @param tarjeta  tarjeta que va a usar
         * @param monto cantidad que abona es mayor a 0
         * @param cant cantidad de cuotas esta entre el minimo y maximo marcados
         * @return Envia true si todos los datos son correctos.
         */
        
         private boolean datosValidos(TarjetaCredito tarjeta, double monto, int cant) {
             boolean esTarjetaValida = tarjeta != null;
             boolean esMontoValido = monto>0;
             boolean cantCuotasValida = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;
             return esTarjetaValida && esMontoValido && cantCuotasValida;
         }
         
         private double recargoSegunCuotas(int cantCuotas) {
             return (cantCuotas-1) * RECARGO_POR_CUOTA;
         }
}