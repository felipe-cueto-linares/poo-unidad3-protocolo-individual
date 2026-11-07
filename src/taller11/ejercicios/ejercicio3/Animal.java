package taller11.ejercicios.ejercicio3;

public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void moverse();

    public void hacerSonido() {
        System.out.println("Sonido generico");
    }
}