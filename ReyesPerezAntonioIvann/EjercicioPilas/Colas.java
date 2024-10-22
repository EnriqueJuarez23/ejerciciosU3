import java.util.LinkedList; //Importamos la libreria LinkedList para usar listas
import java.util.Queue; //Importamos la libreria Queue para usar colas
class Colas { //Nombre de la clase
    public static void main(String[] args) { //Metodo principal
        String name = "Antonio Ivann"; //Declaramos una variable de tipo String y le damos un valor
        Queue<Character> cola = new LinkedList<>(); //Creamos una cola para almacenar los caracteres del nombre
        for (int i = 0; i < name.length(); i++) { //Iteramos sobre el nombre y agrega cada caracter a la cola
            cola.add(name.charAt(i)); //Obtiene los caracteres en la posicion 1
        }
        System.out.print(cola); //Imprimimos la cola mostrando todo los caracteres
    }
}