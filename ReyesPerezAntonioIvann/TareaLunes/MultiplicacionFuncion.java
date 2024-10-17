import java.util.Scanner; //Importamos la libreria Scanner  
class MultiplicacionFuncion{ //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        Scanner mu = new Scanner(System.in); //Creamos un objeto en base a la libreria Scanner  
        System.out.println("Dame 2 numeros para realizar la multiplicacion"); //Le pedimos 2 numeros al usuario para la multiplicacion  
        //Almacenamos sus respuestas en las variables "n1" y "n2"
        int n1 = mu.nextInt();  
        int n2 = mu.nextInt();  
        mu.close(); //Cerramos el objeto Scanner para liberar los recursos  
        multiplicacion(n1, n2); //Llamamos a la funcion multiplicacion, pasandole los dos numeros como argumentos  
    }  
    public static void multiplicacion(int n1, int n2){ //Definimos una funcion estatica llamada multiplicacion que toma dos enteros como parametros  
        int res = n1 * n2; //Realizamos la operacion  
        System.out.println("El resultado de la multiplicacion es: " + res); //Imprimimos el resultado  
    }  
}