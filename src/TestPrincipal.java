
import Animales.Perro;
import Otros.Automovil;
import Otros.Celular;
import Otros.Mesa;
import Otros.Pelota;
import Personas.Empleado;
import Personas.Estudiante;
import figurasgeometricas.Circulo;
import figurasgeometricas.Figura;
import figurasgeometricas.Punto;
import figurasgeometricas.Rectangulo;
import figurasgeometricas.Triangulo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author diese
 */
public class TestPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void objeto1(String[] args){
        Perro miPerro = new Perro("Max", "Labrador", "Amarillo", 3);

        System.out.println("Nombre del perro: " + miPerro.getNombre());
        System.out.println("Tipo de raza del perro: " + miPerro.getTipoRaza());
        System.out.println("Edad del perro: " + miPerro.getEdad());
    }
    
    public static void objeto2(String[] args){
        Automovil miAutomovil = new Automovil("ABC123", "Toyota", "Corolla", "Rojo", "Sedán");

        System.out.println("Marca del automóvil: " + miAutomovil.getMarca());
        System.out.println("Modelo del automóvil: " + miAutomovil.getModelo());
    }
    
    public static void objeto3(String[] args){
        Celular miCelular = new Celular(123456789, "Samsung", "Negro", "Galaxy S21", "Plan Premium");

        System.out.println("Marca del celular: " + miCelular.getMarca());
        System.out.println("Modelo del celular: " + miCelular.getModelo());
    }
    
    public static void objeto4(String[] args){
        Mesa miMesa = new Mesa(120.5f, 80.0f, "Marrón", "Madera", "Rectangular");

        System.out.println("Material de la mesa: " + miMesa.getMaterial());
        System.out.println("Forma de la mesa: " + miMesa.getForma());
    }
    
    public static void objeto5(String[] args){
        Pelota miPelota = new Pelota("Pelota de Fútbol", "Desconocida", "Blanco y Negro", 1);

        System.out.println("Nombre de la pelota: " + miPelota.getNombre());
        System.out.println("Tipo de raza de la pelota: " + miPelota.getTipoRaza());
        System.out.println("Edad de la pelota: " + miPelota.getEdad());
    }
    
    public static void objeto6(String[] args){
        Empleado miEmpleado = new Empleado(1, "Juan", "Pérez", 50000);
        
        System.out.println("Salario del empleado: $" + miEmpleado.getSalario());
        System.out.println("Salario anual del empleado: $" + miEmpleado.getSalarioAnual());
    }
    
    public static void objeto7(String[] args){
        Estudiante miEstudiante = new Estudiante(1, "Juan", "Pérez", 20, "Matemáticas", 90.5f);

        System.out.println("Curso del estudiante: " + miEstudiante.getCurso());
        System.out.println("Calificación del estudiante: " + miEstudiante.getNota());
    }
    
    public static void objeto8(String[] args){
        Circulo miCirculo = new Circulo(5.0, "Rojo");

        System.out.println("Radio del círculo: " + miCirculo.getRadio());
        System.out.println("Área del círculo: " + miCirculo.getArea());
        System.out.println("Color del círculo: " + miCirculo.getColor());
        miCirculo.setColor("Azul");
        System.out.println("Nuevo color del círculo: " + miCirculo.getColor());
    }
    
    public static void objeto9(String[] args){
        Figura miFigura = new Figura("Cuadrado");

        System.out.println("Área de la figura: " + miFigura.getArea());
        boolean esRegular = miFigura.FiguraRegorIrreg();
        System.out.println("¿La figura es regular? " + esRegular);
    }
    
    public static void objeto10(String[] args){
        Punto miPunto = new Punto(3.5, 2.0);

        System.out.println("Coordenada X: " + miPunto.getCoordenadaX());
        System.out.println("Coordenada Y: " + miPunto.getCoordenadaY());
    }
    
    public static void objeto11(String[] args){
        Rectangulo miRectangulo = new Rectangulo();

        System.out.println("Largo del rectángulo: " + miRectangulo.getLargo());
        System.out.println("Ancho del rectángulo: " + miRectangulo.getAncho());
        System.out.println("Área del rectángulo: " + miRectangulo.getArea());
        miRectangulo.setLargo(4.0f);
        miRectangulo.setAncho(2.0f);
        System.out.println("Nuevo área del rectángulo: " + miRectangulo.getArea());
    }
    
    public static void objeto12(String[] args){
        Punto vertice1 = new Punto(0, 0);
        Punto vertice2 = new Punto(4, 0);
        Punto vertice3 = new Punto(2, 3);

        Triangulo miTriangulo = new Triangulo(vertice1, vertice2, vertice3);
        double perimetro = miTriangulo.getPerimetro();
        String tipo = miTriangulo.getTipo();
        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println("Tipo de triángulo: " + tipo);
    }
}

