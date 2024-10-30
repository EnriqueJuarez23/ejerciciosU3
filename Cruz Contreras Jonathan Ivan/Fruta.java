
//Libreria Arraylist
import java.util.ArrayList;
import java.util.List;

class Fruta {
    public static void main(String[] args) {
        // Crear una ArrayList para almacenar objetos de tipo Fruta
        List<String> op = new ArrayList<>();
        // Agregar 5 frutas a la lista
        op.add("Uva");
        op.add("Manzana");
        op.add("Naranja");
        op.add("Mandarina");
        op.add("Platano");
        // Itera la ArrayList con un for-each
        for (String pe : op) {
            System.out.println(pe);
        }
    }
}