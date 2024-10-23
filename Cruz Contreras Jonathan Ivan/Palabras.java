
//Libreria Stack
import java.util.Stack;

//Clase
class Palabras {
    // Metodo main
    public static void main(String[] args) {
        // Crear un arreglo de 5 palabras
        String[] palabras = { "Hola", "Mundo", "Pilita", "Casa", "Lapiz" };
        // Crear objeto pila
        Stack<String> pila = new Stack<String>();
        // Itera las plabras del arreglo
        for (int i = 0; i < palabras.length; i++) {
            // Mete las palabras a la pila
            pila.push(palabras[i]);
        }
        // Mete 2 elemento a la pila
        pila.push("Numero");
        pila.push("Caracteres");
        // Muestra el ultimo elemento de la pila
        System.out.println("Ultimo elemento: " + pila.peek());
        // Elimina el ultimo elemento
        pila.pop();
        // Imprime el contenido de la pila
        System.out.println("Contenido: " + pila);
        // Valida si la pila esta vacia
        System.out.println(pila.isEmpty());
    }
}