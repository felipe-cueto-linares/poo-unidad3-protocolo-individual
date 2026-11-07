package taller13.ejercicios.ejercicio3;

public abstract class Equipo {
    protected String nombreEquipo;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    // Profe, al descomentar el siguiente método marca error de compilación:
    // modifier default not allowed here. La palabra default solo existe en las interfaces;
    // en una clase abstracta un método con cuerpo se declara como método concreto normal.
    // default void entrenar() {
    //     System.out.println("Entrenando");
    // }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
    }
}