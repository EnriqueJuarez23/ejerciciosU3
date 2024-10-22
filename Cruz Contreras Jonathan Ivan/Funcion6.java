
//Liberia Scanner
import java.util.Scanner;

class Funcion6 {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Pedir valor
        System.out.println("Ingresa la altura: ");
        // Crear variable y guardar valor
        double al = sc.nextDouble();
        System.out.println("Ingrese la base: ");
        double b = sc.nextDouble();
        // Inicializar la variable ar que va guarda el resultado y llama a la funcion area
        double ar = area(al, b);
        // Imprime el resultado de la area
        System.out.println("El resultado de la area es: " + ar);
    }

    // Crea una funcion llamada area y dentro de esa funcion hace una multiplicacion
    public static double area(double x, double y) {
        // Hace la multiplicacion
        return x * y;
    }
}