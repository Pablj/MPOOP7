/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop7;

/**
 *
 * @author drago
 */
public class AlumnoIngenieria extends Alumno{
    private String circuito;

    public AlumnoIngenieria() {
    }

    public AlumnoIngenieria(String circuito, int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(numCuenta, tieneBeca, nombre, edad, genero);
        this.circuito = circuito;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

   
    
    
    public void calcular(){
        System.out.println("Ya cambie la resistencia y sigue sin funcionar. ");
        
    }

    @Override
    public String toString() {
        return super.toString()+"AlumnoIngenieria{" + "circuito=" + circuito + '}';
    }
   
}
