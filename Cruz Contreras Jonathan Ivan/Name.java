
//Libreria Queue para usar colas
//Libreria LinkedList para usar listas
import java.util.LinkedList;
import java.util.Queue;

class Name {
    public static void main(String[] args) {
        // Inicializa una variable de tipo String y guaedar valor en ella
        String name = "Jonathan";
        // Crea una cola para almacenar los caracteres del nombre
        Queue<Character> colita = new LinkedList<>();
        // Itera sobre el nombre y agrega cada caracter a la cola
        for (int i = 0; i < name.length(); i++) {
            // Obtiene el caracteres en la posicion 1
            colita.add(name.charAt(i));
        }
        // Imprime la cola mostrando todo los caracteres
        System.out.print(colita);
    }
}