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
public class Profesor extends Persona {
    private int numEmpleado;
    private float sueldo;

    public Profesor(int numEmpleado, float sueldo, String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

   

    public Profesor() {
    }
    
    
    public void calificar(){
        System.out.println("Las tareas llevaban el numero de actividad. Tienes 6 ");
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Profesor{" + "numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}
