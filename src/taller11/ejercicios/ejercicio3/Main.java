package taller11.ejercicios.ejercicio3;

public class Main {
    public static void main(String[] args) {
    
        Animal perro = new Perro("Rex");
        Animal gato = new Gato("Misu");

        perro.moverse();
        perro.hacerSonido();
        gato.moverse();
        gato.hacerSonido();
    }
}