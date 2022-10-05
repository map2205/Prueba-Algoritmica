/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_personas;

/**
 *
 * @author marce
 */
public class Persona {
    
    private int edad, sexo;

    public Persona(int edad, int sexo) {
        this.edad = edad;
        this.sexo = sexo;
        
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    public String dameDatos(){
        return "la personas tiene " + edad + "años y el sexo es "+ sexo;
    }
}
