package taller13.ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(4, 5);
        Figura triangulo = new Triangulo(6, 3);

        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
    }
}