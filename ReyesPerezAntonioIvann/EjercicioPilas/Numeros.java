import java.util.Stack; //Importamos la libreria Stack
class Numeros { //Nombre de la clase
    public static void main(String[] args) { //Metodo principal
        //Creamos 2 objetos con la libreria Stack
        Stack<Integer> pilaPar = new Stack<Integer>();
        Stack<Integer> pilaImpar = new Stack<Integer>();
        for (int a = 1; a <= 30; a++) { //Iteramos los numeros del 1 al 30
            //Verficamos si los numeros son pares
            if (a % 2 == 0) {
                //Almacenamos solo numeros pares
                pilaPar.push(a);
            } else {
                //Almacenamos solo numeros impares
                pilaImpar.push(a);
            }
            //Imprimimos solo numeros pares
            System.out.println("Es par: " + pilaPar);
            //Imprimimos solo numeros impares
            System.out.println("Es Impar: " + pilaImpar);
        }
    }
}