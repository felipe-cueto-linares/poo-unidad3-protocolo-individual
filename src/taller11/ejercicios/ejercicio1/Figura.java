package taller11.ejercicios.ejercicio1;

import java.util.Locale;

public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("Area: " + String.format(Locale.US, "%.2f", calcularArea()));
    }
}