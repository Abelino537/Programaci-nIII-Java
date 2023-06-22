/*
Laboratorio III
Abel Pierna
Clase 2
26/04/23
Modificadores de acceso (protected)
 */
package Parte4;

import Parte3.modificadorPublic;


public class modificadorProtected extends modificadorPublic {
    public modificadorProtected(){
        super("protected");
        this.atributoProtected = "Accedemos desde la clase hija";
        System.out.println("atributoProtected = " + atributoProtected);
                this.atributoPublic = "Es totalmente publico";
    }
    
}
