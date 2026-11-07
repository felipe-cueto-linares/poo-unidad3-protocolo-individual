package taller13.ejercicios.ejercicio3;

public interface Jugador {
    void jugar();

    default void descansar() {
        System.out.println("Descansando");
    }
}