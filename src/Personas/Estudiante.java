/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Alumno
 */
public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private float calificacion;

    public Estudiante(int id, String nombre, String apellido, int edad, String curso, float calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso; 
        this.calificacion = calificacion; 
     }

     public float getNota(){
         return calificacion; 
     }

     public String getCurso(){
         return curso; 
     }
}
