
//Liberia Scanner
import java.util.Scanner;

class Funcion3 {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Pedir valor
        System.out.println("Ingresa un numero: ");
        // Crear variable y guardar valor
        int a = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int b = sc.nextInt();
        // Inicializar la variable r que va guarda el resultado y llama a la funcion
        // multiplicar
        int r = multiplicar(a, b);
        // Imprime el resultado de la multiplicacion
        System.out.println("El resultado de la multiplicacion es: " + r);
    }

    // Crea una funcion llamada multiplicar y dentro de esa funcion hace la
    // multiplicacion
    public static int multiplicar(int x, int y) {
        // Hace la multiplicacion
        return x * y;
    }
}