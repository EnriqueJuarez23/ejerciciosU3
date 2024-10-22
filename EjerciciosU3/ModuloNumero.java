import java.util.Scanner;

public class ModuloNumero {

    // Función para obtener el módulo de un número
    public static int obtenerModulo(int numero) {
        // Usa Math.abs() para obtener el valor absoluto (módulo)
        return Math.abs(numero); 
    }
//método principal
    public static void main(String[] args) {
        //Crear objeto 
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario un número
        System.out.print("Ingresa un número: ");
        
        //Se ingresa el valor en consola        
        int numero = sc.nextInt();

        // Llamar a la función para obtener el módulo
        int modulo = obtenerModulo(numero);

        // Mostrar el resultado
        System.out.println("El módulo del número es: " + modulo);
    }
}
