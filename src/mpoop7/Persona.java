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
public class Persona {
    private String nombre;
    private int edad;
    private String genero;

public Persona() {
    
}

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;        
        this.edad = edad;
        this.genero = genero;
    }

  

    public void hablar(){
    
        System.out.println("Holaa, Buenos días.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return  "Persona{" + " nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + '}';
    }
    
    
}



