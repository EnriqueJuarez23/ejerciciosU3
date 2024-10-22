import java.util.Scanner;

class ValidarNumero {

    // Función para mostrar un mensaje de error
    public static void mostrarError() {
        //Mensaje que se imprime en pantalla de. ERROR.
        System.out.println("Error: El número  debe ser mayor a 20. Inténtalo de nuevo.");
    }
//método principal
    public static void main(String[] args) {
        //Crear objeto
        Scanner sc = new Scanner(System.in);
        //Se declara variable 
        int n;

        // Bucle para seguir solicitando el número hasta que sea mayor a 20
        do {
            System.out.print("Por favor, ingresa un número mayor a 20: ");
            // Almacena el número
            n = sc.nextInt(); 

            // Validar si el número es menor o igual a 20
            if (n <= 20) { 
                // Mostrar mensaje de error si el número no es válido
                mostrarError(); 
            }
            // Continuar pidiendo el número mientras sea menor o igual a 20
        } while (n <= 20);  

        // Mensaje de que es mayor
        System.out.println(" Has ingresado un número mayor a 20: " + n);
    }
}
