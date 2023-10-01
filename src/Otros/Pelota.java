/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Otros;

/**
 *
 * @author Alumno
 */
public class Pelota {
    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public Pelota(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getTipoRaza() {
        return raza + " Pelota";
    }

    public int getEdad() {
        return edad;
    }
}
