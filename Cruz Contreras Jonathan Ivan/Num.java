
//Libreria Queue para usar colas
//Libreria LinkedList para usar listas
import java.util.LinkedList;
import java.util.Queue;

//Clase
class Num {
    // Metodo
    public static void main(String[] args) {
        // Declaramos un arreglo de 10 numeros
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Crear un objeto cola
        Queue<Integer> cola = new LinkedList<Integer>();
        // Itera el arreglo con for each
        for (int nume : num) {
            cola.add(nume);
        }
        // Agregamos 2 numeros a la cola
        cola.add(11);
        cola.add(12);
        // Imprime el ultimo elemento de la cola
        System.out.println(cola.peek());
        // Imprime la cola completa
        System.out.println(cola);
        // Verifica si esta vacia
        if (cola.isEmpty()) {
            System.out.println("La cola esta vacia");
        } else {
            System.out.println("La cola tiene elemento");
        }
    }
}