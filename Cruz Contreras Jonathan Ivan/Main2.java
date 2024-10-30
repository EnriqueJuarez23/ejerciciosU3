
//Libreria Queue para usar cola
//Libreria LinkedList para usar lista
import java.util.LinkedList;
import java.util.Queue;

//Clase
class Main2 {
    // Metodo main
    public static void main(String[] args) {
        // Crear objetos persona
        Persona p1 = new Persona("Enrique", "Juarez", (short) 20);
        Persona p2 = new Persona("Sandra", "Gutierrez", (short) 20);
        Persona p3 = new Persona("Michelle", "Canseco", (short) 19);
        Persona p4 = new Persona("Jonathan", "Cruz", (short) 19);
        Persona p5 = new Persona("Mauricio", "Hernandez", (short) 21);
        // Crear objeto cola
        Queue<Persona> op = new LinkedList<>();
        // Meter elementos a la cola
        op.add(p1);
        op.add(p2);
        op.add(p3);
        op.add(p4);
        op.add(p5);
        // Iterracion de la cola
        for (Persona pe : op) {
            System.out.println(pe.nom + " " + pe.ape + " " + pe.ede);
        }
    }
}