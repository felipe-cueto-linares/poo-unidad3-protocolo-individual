package taller12.ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Felipe Cueto");

        persona.hablar();
        persona.trabajar();

        Hablador hablador = persona;
        Trabajador trabajador = persona;
        hablador.hablar();
        trabajador.trabajar();
    }
}