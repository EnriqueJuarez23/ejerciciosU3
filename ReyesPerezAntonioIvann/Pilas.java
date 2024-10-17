import java.util.Stack; //Importamos la libreria Stack(Para utilizar pilas)
class Pilas{
    public static void main(String[] args) {
        Stack <Integer> pila = new Stack<Integer>(); //Creamos un objeto con la libreria Stack,ocupamos el metodo constructor 
        System.out.println(pila.isEmpty());
        pila.push(2);
        pila.push(4);
        pila.push(6);
        pila.push(8);
        pila.push(10);
        System.out.println(pila.search(10));
        System.out.println(pila);
        System.out.println(pila.peek());
        for(Integer pilita:pila){
            System.out.println(pilita);
        }
        pila.pop();
        pila.pop();
        System.out.println(pila.peek());
    }
}