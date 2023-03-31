/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postnet;

/**
 * 
 * @author Fabio
 */

public class TarjetaCredito {
    
        private String entidadBancaria;
        private String numeroTarjeta;
        private double saldo;
        private EntidadFinanciera entidadFinanciera;
        private Persona titular;

    public TarjetaCredito(String entidadBancaria, String numeroTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }
    
    /**
     *  Metodo para comprobar el saldo disponible en la cuenta
     * @param monto cantidad que se desea sacar.
     * @return devuelve true si la cantidad es superior o igual.
     */
    
    public boolean tieneSaldoDisponible(double  monto) {
        
        return saldo >= monto;
        
    }
    
    /**
     *  Metodo para descontar el saldo por el monto a sacar
     * @param monto monto que descuenta al saldo..
     */
    
    public void descontar(double monto) {
        saldo -= monto;
    }
    
    /**
     * Metodo para obtener el nombre completo del titular.
     * @return devuelve el nombre completo mediante el metodo toString
     */
    
    public String nombreCompletoDeTitular() {
        return titular.nombreCompleto();
    }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria="  + entidadBancaria + ", numeroTarjeta=" + numeroTarjeta + ", saldo= " + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
}
