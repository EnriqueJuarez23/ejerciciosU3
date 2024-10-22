
//Liberia Scanner
import java.util.Scanner;

class Funcion13 {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Inicializar una variable
        int a;
        do {
            // Pedir valor
            System.out.println("Ingresa un numero: ");
            // Crear variable y guardar valor
            a = sc.nextInt();
            // LLamar a la funcion
            validar(a);
        } while (a < 20);
        // Muestra el numero ingresado
        System.out.println("Numero ingresado: " + a);
    }

    // Crea una funcion llamada validar y dentro de esa funcion ver si es mayor a 20
    // el numero pedido
    public static void validar(int x) {
        // Condicion if
        if (x < 20) {
            // Imprime el mensaje si el valor no es mayor a 20
            System.out.println("Error el numero que ingresaste no es mayor a 20, por favor intenta de nuevo");
        }
    }
}