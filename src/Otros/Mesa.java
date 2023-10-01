/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Otros;

/**
 *
 * @author Alumno
 */
public class Mesa {
    private float ancho;
    private float altura;
    private String color;
    private String material;
    private String forma;

    public Mesa(float ancho, float altura, String color, String material, String forma) {
        this.ancho = ancho;
        this.altura = altura;
        this.color = color;
        this.material = material;
        this.forma = forma;
    }

    public String getMaterial() {
        return material;
    }

    public String getForma() {
        return forma;
    }
}
