/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfredo Quezada
 * 31-03-2020
 * #191002 
 */
public class Paciente implements Comparable<Paciente> {
     //Atributos
    String nombre = "";
    String enfermedad = "";
    String categoria = "";

    Paciente(){
        nombre = "";
        enfermedad = "";
        categoria = "";
    }

    public Paciente(String nombre, String enfermedad, String categoria) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.categoria = categoria;
    }

    //Sets ands gets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
            this.nombre = nombre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Compare To para comparar el tipo de categoria de nuestros pacientes
    public int compareTo(Paciente o) {
        return categoria.compareTo(o.categoria);
    }

    //To String para imprimir todo en orden
    @Override
    public String toString() {
        return "Paciente:" +
                "Nombre'" +'\''+ nombre + '\'' +
                ", Enfermedad'" + enfermedad + '\'' +
                ", Categoria'" + categoria + '\'' ;
    }
    
}
