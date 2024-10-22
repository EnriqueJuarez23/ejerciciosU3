
//Libreria para usar pila
import java.util.Stack;

class Numeros {
    public static void main(String[] args) {
        // Crear objeto pila
        Stack<Integer> pilaPar = new Stack<Integer>();
        Stack<Integer> pilaImpar = new Stack<Integer>();
        // Itera los numeros del 1 a 30
        for (int i = 1; i <= 30; i++) {
            // Verifica si los numeros son pares
            if (i % 2 == 0) {
                // Guarda solo numeros pares
                pilaPar.push(i);
            } else {
                // Guarda solo numeros impares
                pilaImpar.push(i);
            }
            // Imprime los numeros pares
            System.out.println("Es par: " + pilaPar);
            // Imprime los numeros impares
            System.out.println("Es Impar: " + pilaImpar);
        }
    }
}