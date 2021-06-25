/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop7;

/**
 *
 * @author bigva_001
 */
public class MPOOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente ger1 = new Gerente();
        ger1.setNombre("Raul");
        ger1.setNumEmpleado(9876);
        ger1.setSueldo(15000);
        System.out.println(ger1);
        ger1.asignarPresupuesto(100000);
        System.out.println(ger1);
        System.out.println("Presupuesto" + ger1.getPresupuesto());
        
        System.out.println("####################");
        
        Gerente ger2 = new Gerente(500000,"Julieta",15,30000);
        System.out.println(ger2);
        ger2.aumentarSueldo(10);
        System.out.println(ger2);
        
        System.out.println("####################");
        
        Gerente ger3 = new Gerente();
        if(ger3 instanceof Gerente){
            System.out.println("Es una instancia de Gerente");
        }if(ger3 instanceof Empleado){
            System.out.println("Si es una instancia de Empleado");
        }else{
            System.out.println("No es instancia de Empleado");    
        }if(ger3 instanceof Object){
            System.out.println("Si es una instancia de Objeto");
        }else{
            System.out.println("No es instancia de Object");     
    }
        
        
        System.out.println("***************Actividades***************");
        AlumnoIngenieria alumnoIng=new AlumnoIngenieria("Circuito", 1351212, false, "Pablo", 21, "Masculino");
        AlumnoMedicina alumnoMed=new AlumnoMedicina("Estetoscopio", 1234545, true, "Oliver", 20, "Masculino");
        ProfesorLaboratorio profesorLab=new ProfesorLaboratorio("Lab 123-f", 33, 24002, "Armando", 38, "Masculino");
        ProfesorTeoria profesorTeo=new ProfesorTeoria("126-E", 124, 4579, "ximena", 45, "Femenino");
        System.out.println("Instancias");
        System.out.println(alumnoIng);
        System.out.println(alumnoMed);
        System.out.println(profesorLab);
        System.out.println(profesorTeo);
 }
}