package taller11.ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(2);
        Figura rectangulo = new Rectangulo(4, 5);

        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}