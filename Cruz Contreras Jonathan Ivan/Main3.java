
//Importamos las librerias
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Nombre de la clase
class Main3 {
    // Metodo principal
    public static void main(String[] args) {
        // Creamos objeto Scanner y List
        Scanner op = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        // Declaramos nuestas variables
        String setNombre, setApellido;
        int setEdad, id = 0;
        // Abrimos un do-while
        do {
            // Les pedimos nombre, apellido y edad al usuario y guardamos sus respuestas
            System.out.println("Ingresa un nombre: ");
            setNombre = op.next();
            System.out.println("Ingresa un apellido: ");
            setApellido = op.next();
            System.out.println("Ingresa una edad: ");
            setEdad = op.nextInt();
            // Agrega el arraylist
            personas.add(id, new Persona(setNombre, setApellido, (short) setEdad));
            // Incrementa el id
            id++;
            // Hace el ciclo
        } while (personas.size() < 3);
        // Creamos un for para eliminar si el usuario escribe kilo, y asi elimina aquien
        // escojamos
        for (int i = 0; i < personas.size(); i++) {
            // Paramos el bucle
            if (personas.get(i).getClass().equals("Kilo")) {
                personas.remove(i);
                break;

            }
        }
        // Itera cada respuesta
        for (int j = 0; j < personas.size(); j++) {
            // Imprime el resultado
            System.out.println(personas.get(j));
        }
    }
}