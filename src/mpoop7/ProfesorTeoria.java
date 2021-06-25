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
public class ProfesorTeoria extends Profesor{
    private  String numSalon;
    
   
    public ProfesorTeoria() {
    }

    public ProfesorTeoria(String numSalon, int numEmpleado, float sueldo, String nombre, int edad, String genero) {
        super(numEmpleado, sueldo, nombre, edad, genero);
        this.numSalon = numSalon;
    }

   
    
    
     public void usoTraje(){
        System.out.println("Uso traje");
    }

    public String getNumSalon() {
        return numSalon;
    }

    public void setNumSalon(String numSalon) {
        this.numSalon = numSalon;
    }

    @Override
    public String toString() {
        return super.toString()+
                "ProfesorTeoria{" + "numSalon=" + numSalon + '}';
    }

    
}
