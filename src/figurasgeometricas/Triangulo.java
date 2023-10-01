/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;
/**
 *
 * @author Alumno
 */
public class Triangulo {
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public double getPerimetro() {
        double lado1 = Math.sqrt(Math.pow(vertice1.getCoordenadaX() - vertice2.getCoordenadaX(), 2) + Math.pow(vertice1.getCoordenadaY() - vertice2.getCoordenadaY(), 2));
        double lado2 = Math.sqrt(Math.pow(vertice2.getCoordenadaX() - vertice3.getCoordenadaX(), 2) + Math.pow(vertice2.getCoordenadaY() - vertice3.getCoordenadaY(), 2));
        double lado3 = Math.sqrt(Math.pow(vertice3.getCoordenadaX() - vertice1.getCoordenadaX(), 2) + Math.pow(vertice3.getCoordenadaY() - vertice1.getCoordenadaY(), 2));
        
        return lado1 + lado2 + lado3;
    }

    public String getTipo() {
        double lado1 = Math.sqrt(Math.pow(vertice1.getCoordenadaX() - vertice2.getCoordenadaX(), 2) + Math.pow(vertice1.getCoordenadaY() - vertice2.getCoordenadaY(), 2));
        double lado2 = Math.sqrt(Math.pow(vertice2.getCoordenadaX() - vertice3.getCoordenadaX(), 2) + Math.pow(vertice2.getCoordenadaY() - vertice3.getCoordenadaY(), 2));
        double lado3 = Math.sqrt(Math.pow(vertice3.getCoordenadaX() - vertice1.getCoordenadaX(), 2) + Math.pow(vertice3.getCoordenadaY() - vertice1.getCoordenadaY(), 2));
        
        if (lado1 == lado2 && lado1 == lado3) {
            return "Equilatero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isoceles";
        } else {
            return "Escaleno";
        }
    }
}
