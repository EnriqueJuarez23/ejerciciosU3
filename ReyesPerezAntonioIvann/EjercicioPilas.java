// Importamos la clase Stack del paquete java.util
import java.util.Stack;
// Nombre de la clase
class EjercicioPilas {
    // Metodo principal
    public static void main(String[] args) {
        // Creamos una pila (Stack) que almacenara caracteres
        Stack<Character> nombre = new Stack<>();
        // Agregamos los caracteres 'A', 'n', 't', 'o', 'n', 'i', 'o' a la pila, que forman el nombre "Antonio"
        nombre.push('A');
        nombre.push('n');
        nombre.push('t');
        nombre.push('o');
        nombre.push('n');
        nombre.push('i');
        nombre.push('o');
        // Mostramos el elemento en la cima de la pila sin eliminarlo (ultimo en ser añadido)
        System.out.println(nombre.peek()); // Output: 'o'
        // Añadimos un espacio (' ') a la pila
        nombre.push(' ');
        // Agregamos los caracteres 'I', 'v', 'a', 'n', 'n' a la pila, que forman el nombre "Ivann"
        nombre.push('I');
        nombre.push('v');
        nombre.push('a');
        nombre.push('n');
        nombre.push('n');
        // Buscamos la posicion de la letra 'I' en la pila, desde la cima hacia abajo
        System.out.println(nombre.search('I')); // Retorna la posición desde la cima
        // Añadimos otro espacio (' ') a la pila
        nombre.push(' ');
        // Agregamos los caracteres 'R', 'e', 'y', 'e', 's' a la pila, que forman "Reyes"
        nombre.push('R');
        nombre.push('e');
        nombre.push('y');
        nombre.push('e');
        nombre.push('s');
        // Quitamos (eliminamos) los dos ultimos caracteres añadidos ('s' y 'e') con pop()
        nombre.pop();
        nombre.pop();
        // Imprimimos el contenido de la pila despues de eliminar los dos últimos elementos
        System.out.println(nombre); // Muestra los caracteres restantes en la pila
        // Iteramos sobre la pila e imprimimos cada caracter
        for(Character completo : nombre){
            System.out.println(completo);
        }
    }
}