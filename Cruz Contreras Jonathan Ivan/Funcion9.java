
//Liberia Scanner
import java.util.Scanner;

class Funcion9 {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Pedir valor
        System.out.println("Ingresa el perímetro: ");
        // Crear variable y guardar valor
        double p = sc.nextDouble();
        System.out.println("Ingrese la apotema: ");
        double ap = sc.nextDouble();
        // Inicializar la variable ar que va guarda el resultado y llama a la funcion
        // area
        double ar = area(p, ap);
        // Imprime el resultado de la area
        System.out.println("El resultado de la area es: " + ar);
    }

    // Crea una funcion llamada area y dentro de esa funcion hace una multiplicacion
    // y una division
    public static double area(double x, double y) {
        // Hace la multiplicacion y una division
        return (x * y) / 2;
    }
}