
//Liberia Scanner
import java.util.Scanner;

class Funcion1 {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Pedir valor
        System.out.println("Ingresa un numero: ");
        // Crear variable y guardar valor
        int a = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int b = sc.nextInt();
        // Inicializar la variable r que va a guarda el resultado y llama a la funcion
        // sumar
        int r = sumar(a, b);
        // Imprime el resultado de la suma
        System.out.println("El resultado de la suma es: " + r);
    }

    // Crea una funcion llamada sumar y dentro de esa funcion hace la suma
    public static int sumar(int x, int y) {
        // Hace la suma
        return x + y;
    }
}