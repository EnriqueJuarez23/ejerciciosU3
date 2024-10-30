import java.util.Queue; //Impoetamos la libreria Queue
import java.util.LinkedList; //Importamos la libreria LinkedList
class Main2{ //Nombre de la clase
    public static void main(String[] args) { //Metodo principal
        //Creamos nuestros objetos con atributos
        Persona p1 = new Persona("Enrique", "Juarez", 20);
        Persona p2 = new Persona("Sandra", "Gutierrez", 20);
        Persona p3 = new Persona("Michelle", "Canseco", 19);
        Persona p4 = new Persona("Jonathan", "Cruz", 19);
        Persona p5 = new Persona("Mauricio", "Hernandez", 21);
        Persona p6 = new Persona("Antonio", "Reyes", 21);
        //Creamos una cola
        Queue<Persona> sc = new LinkedList <>();
        //Agregamos nuestros elementos a la cola
        sc.add(p1);
        sc.add(p2);
        sc.add(p3);
        sc.add(p4);
        sc.add(p5);
        sc.add(p6);
        //Ocupamos un for each e iteramos nuestros elementos
        for (Persona pe:sc){
            System.out.println(pe.nom + " " + pe.ape + " " + pe.ede);
        }
    }
}