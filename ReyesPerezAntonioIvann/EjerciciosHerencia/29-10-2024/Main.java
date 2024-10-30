import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  

class Main {  
    public static void main(String[] args) {  
        List<Persona> personas = new ArrayList<Persona>();  
        Scanner sn = new Scanner(System.in);  

        String setNombre, setApellido;  
        int setEdad, id = 0;  

        do {  
            System.out.print("Ingresa el nombre de la persona: ");  
            setNombre = sn.next();  
            System.out.print("Ingresa el apellido de la persona: ");  
            setApellido = sn.next();  
            System.out.print("Ingresa la edad de la persona: ");  
            setEdad = sn.nextInt();  

            personas.add(id, new Persona(setNombre, setApellido, setEdad));  
            id++;  
        } while (personas.size() <= 2);  
        sn.close();  

        for (int i = 0; i < personas.size(); i++) {  
            if (personas.get(i).equals("kilo")) {  
                personas.remove(i);  
                break;  
            }  
        }  

        for (int j = 0; j < personas.size(); j++) {  
            System.out.println("Persona " + (j + 1));  
            System.out.println(personas.get(j).mostrarPersona());  
        }  
    }  
}