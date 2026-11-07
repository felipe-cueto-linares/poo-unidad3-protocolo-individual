package taller11.ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos Ruiz", 3000000, 500000);
        Empleado vendedor = new Vendedor("Ana Perez", 1500000, 4000000, 5);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}