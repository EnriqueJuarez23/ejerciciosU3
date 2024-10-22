
//Liberia Scanner
import java.util.Scanner;

class Funcion8 {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Pedir valor
        System.out.println("Ingresa la base: ");
        // Crear variable y guardar valor
        double b = sc.nextDouble();
        System.out.println("Ingrese la altura: ");
        double al = sc.nextDouble();
        // Inicializar la variable ar que va guarda el resultado y llama a la funcion
        // area
        double ar = area(b, al);
        // Imprime el resultado de la area
        System.out.println("El resultado de la area es: " + ar);
    }

    // Crea una funcion llamada area y dentro de esa funcion hace una multiplicacion y una division
    public static double area(double x, double y) {
        // Hace la multiplicacion y una division
        return (x * y) / 2;
    }
}