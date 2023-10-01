/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Alumno
 */
public class Empleado {
     private int id;
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado(int id, String nombre, String apellido, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public int getSalarioAnual() {
        return salario * 12;
    }
}
