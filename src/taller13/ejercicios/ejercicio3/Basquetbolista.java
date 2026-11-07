package taller13.ejercicios.ejercicio3;

public class Basquetbolista extends Equipo implements Jugador {
    public Basquetbolista(String nombreEquipo) {
        super(nombreEquipo);
    }

    @Override
    public void jugar() {
        System.out.println("El basquetbolista esta jugando");
    }
}