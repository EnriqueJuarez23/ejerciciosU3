
//Liberia Scanner
import java.util.Scanner;

class Funcion4 {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Pedir valor
        System.out.println("Ingresa el numero divisor: ");
        // Crear variable y guardar valor
        double a = sc.nextDouble();
        System.out.println("Ingrese el numero dividiendo: ");
        double b = sc.nextDouble();
        // Inicializar la variable r que va guarda el resultado y llama a la funcion
        // dividir
        double r = dividir(a, b);
        // Imprime el resultado de la division
        System.out.println("El resultado de la divicion es: " + r);
    }

    // Crea una funcion llamada dividir y dentro de esa funcion hace la divicion
    public static double dividir(double x, double y) {
        // Hace la division
        return x / y;
    }
}