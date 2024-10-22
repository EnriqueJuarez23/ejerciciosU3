
//Libreria para hucar pilas
import java.util.Stack;

class Nombre {
    public static void main(String[] args) {
        // Crea un objeto de tipo pila
        Stack<Character> nom = new Stack<Character>();
        // Crea una pila con caracteres
        nom.push('J');
        nom.push('O');
        nom.push('N');
        nom.push('A');
        nom.push('T');
        nom.push('H');
        nom.push('A');
        nom.push('N');
        // Imprime el ultimo elemento de la pila (N)
        System.out.println(nom.peek());
        // Crea otra pila
        nom.push('I');
        nom.push('A');
        nom.push('V');
        nom.push('N');
        // Busca una elemento de la pila y imprime en el nummero que esta)
        System.out.println(nom.search('I'));
        // Crea una pila
        nom.push('C');
        nom.push('R');
        nom.push('U');
        nom.push('Z');
        // Elimina los dos ultimo valores
        nom.pop();
        nom.pop();
        // Imprimir el resultado des pues de eliminal
        System.out.println(nom);
        // Crea una pila
        nom.push('C');
        nom.push('O');
        nom.push('N');
        nom.push('T');
        nom.push('R');
        nom.push('E');
        nom.push('R');
        nom.push('A');
        nom.push('S');
        // bucle for itsh
        for (Character pilita : nom) {
            // Itera una pila
            System.out.println(pilita);
        }
    }
}