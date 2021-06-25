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
public class AlumnoMedicina extends Alumno{
    private String instrumento;

    public AlumnoMedicina() {
    }

    public AlumnoMedicina(String instrumento, int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(numCuenta, tieneBeca, nombre, edad, genero);
        this.instrumento = instrumento;
    }
    
    
    
    public void curar(){
        System.out.println("Paracetamol 250g cada 8h por 7 diás. Si sigue sin sentir el brazo, regrese.");
    }  

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        return super.toString()+ "AlumnoMedicina{" + "instrumento=" + instrumento + '}';
    }
    
}

