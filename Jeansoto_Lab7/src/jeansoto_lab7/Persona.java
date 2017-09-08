/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeansoto_lab7;

/**
 *
 * @author jeansoto
 */
public class Persona {
    
    String nombre;
    String id;
    String lugar;
    String edad;
    String estatura;
    String profesion;

    public Persona(String nombre, String id, String lugar, String edad, String estatura, String profesion) {
        this.nombre = nombre;
        this.id = id;
        this.lugar = lugar;
        this.edad = edad;
        this.estatura = estatura;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    
    
   
   
}
