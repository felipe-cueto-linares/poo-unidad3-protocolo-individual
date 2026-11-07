package taller11.ejercicios.ejercicio3;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void moverse() {
        System.out.println("El gato camina");
    }
}