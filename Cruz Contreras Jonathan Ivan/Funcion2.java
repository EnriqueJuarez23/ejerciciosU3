
//Liberia Scanner
import java.util.Scanner;

class Funcion2 {
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
        // restar
        int r = restar(a, b);
        // Imprime el resultado de la resta
        System.out.println("El resultado de la resta es: " + r);
    }

    // Crea una funcion llamada restar y dentro de esa funcion hace la resta
    public static int restar(int x, int y) {
        // Hace la resta
        return x - y;
    }
}