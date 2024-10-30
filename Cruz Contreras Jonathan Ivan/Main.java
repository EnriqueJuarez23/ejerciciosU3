
//libreria Stack para usar pilas
import java.util.Stack;

//Clase
class Main {
    // Metodo main
    public static void main(String[] args) {
        // Crear objetos persona
        Persona p1 = new Persona("Enrique", "Juarez", (short) 20);
        Persona p2 = new Persona("Sandra", "Gutierrez", (short) 20);
        Persona p3 = new Persona("Michelle", "Canseco", (short) 19);
        Persona p4 = new Persona("Jonathan", "Cruz", (short) 19);
        Persona p5 = new Persona("Mauricio", "Hernandez", (short) 21);
        // Crear objeto pila
        Stack<Persona> op = new Stack<>();
        // Meter elementos a la pila
        op.push(p1);
        op.push(p2);
        op.push(p3);
        op.push(p4);
        op.push(p5);
        // Iterracion de la pila
        for (Persona pe : op) {
            System.out.println(pe.nom + " " + pe.ape + " " + pe.ede);
        }
    }
}