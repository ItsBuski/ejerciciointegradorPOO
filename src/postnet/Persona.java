/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postnet;

/**
 * 
 * @author Fabio
 */

public class Persona {
 
        private final String DNI;
        private final String nombre;
        private final String apellido;
        private final String telefono;
        private final String mail;

    public Persona(String DNI, String nombre, String apellido, String telefono, String mail) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }
 
    /**
 *  Método para obtener el nombre y el apellido.
 * @return devuelve el nombre completo en un String.
 */
    
        public String nombreCompleto() {
            return nombre + " " + apellido;
        }
    
}
