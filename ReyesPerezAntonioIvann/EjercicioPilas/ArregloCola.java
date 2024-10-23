//Importamos las librerias LinkedList y Queue
import java.util.LinkedList;
import java.util.Queue;
class ArregloCola{ //Nombre de la clase
    public static void main(String[] args) { //Metodo principal
        int [] numeros = {1,2,3,4,5,6,7,8,9,10}; //Declaramos un arreglo con 10 numeros
        Queue <Integer> cola = new LinkedList<>(); //Creamos una cola
        //Iteramos y guardamos los numeros del arreglo con un for each
        for (int num:numeros){
            cola.add(num);
        }
        //Agregamos 2 numeros a la cola
        cola.add(11);
        cola.add(12);
        //Imprimimos el ultimo numero de la cola
        System.out.println(cola.remove());
        //Imprimimos todos los elementos de la cola
        System.out.println(cola);
        //Verificamos si la cola esta vacia
        if (cola.isEmpty()){
            System.out.println("La cola esta vacia");
        }else{
            System.out.println("La cola no esta vacia");;
        }
    }
}