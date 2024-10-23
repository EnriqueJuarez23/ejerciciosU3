import java.util.Stack; //Importamos la libreria Stack
class ArregloPilas{ //Nombre de la clase
    public static void main(String[] args) { //Metodo principal
        String[] palabras = {"Hola","Adios","Pila","Tacos","Tortas"}; //Declaramos un arreglo con 5 palabras
        Stack <String> pila = new Stack<>(); //Creamos una pila
        //Iteramos y guardamos cada palabra con un for each
        for (String palabritas:palabras){
            pila.push(palabritas);
        }
        //Agregamos 2 palabras
        pila.push("Colas");
        pila.push("Java");
        //Imprimimos el ultimo elemento de la pila
        System.out.println(pila.peek());
        //Eliminamos el ultimo elemento de la pila
        pila.pop();
        //Imrpimimos todos los elementos de la pila
        System.out.println(pila);
        //Verificamos si la pila esta vacia
        if (pila.isEmpty()){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("La pila no esta vacia");
        }
    }
}