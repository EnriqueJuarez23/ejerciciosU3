import java.util.Stack; //Importamos la libreria Stack
class Main{ //Nombre de la clase
    public static void main(String[] args) { //Metodo principal
        //Creamos objetos con atributos
        Persona p1 = new Persona("Enrique", "Juarez", 20);
        Persona p2 = new Persona("Sandra", "Gutierrez", 20);
        Persona p3 = new Persona("Michelle", "Canseco", 19);
        Persona p4 = new Persona("Jonathan", "Cruz", 19);
        Persona p5 = new Persona("Mauricio", "Hernandez", 21);
        Persona p6 = new Persona("Antonio", "Reyes", 21);
        //Creamos una pila
        Stack<Persona> op = new Stack<>();
        //Metemos nuestros elementos a nuestra pila
        op.push(p1);
        op.push(p2);
        op.push(p3);
        op.push(p4);
        op.push(p5);
        op.push(p6);
        //Ocupamos un for each e iteramos nuestros valores
        for (Persona pe:op){
            System.out.println(pe.nom + " " + pe.ape + " " + pe.ede);
        }
    }
}