package taller11.ejercicios.ejercicio3;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void moverse() {
        System.out.println("El perro corre");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}