package taller12.ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Pato");

        animal.volar();
        animal.nadar();

        Volador volador = animal;
        Nadador nadador = animal;
        volador.volar();
        nadador.nadar();
    }
}