
//Liberia Scanner
import java.util.Scanner;

class Funcion5 {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Pedir valor
        System.out.println("Ingrese un numero: ");
        // Crear variable y guardar valor
        int a = sc.nextInt();
        System.out.println("Ingrese el numero divisor: ");
        int b = sc.nextInt();
        // Inicializar la variable r que va guarda el resultado y llama a la funcion modulo
        int r = modulo(a, b);
        // Imprime el resultado de le modulo
        System.out.println("El resultado de la modulo es: " + r);
    }

    // Crea una funcion llamada modulo y dentro de esa funcion hace el modulo
    public static int modulo(int x, int y) {
        // Hace el modulo
        return x % y;
    }
}