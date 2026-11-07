package taller13.ejercicios.ejercicio2;

public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato esta volando");
    }

    @Override
    public void nadar() {
        System.out.println("El pato esta nadando");
    }
}