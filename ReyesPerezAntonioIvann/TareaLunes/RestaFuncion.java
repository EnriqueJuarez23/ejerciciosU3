import java.util.Scanner; //Importamos la libreria Scanner  
class RestaFuncion{ //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        Scanner re = new Scanner(System.in); //Creamos un objeto en base a la libreria Scanner  
        System.out.println("Dame 2 numeros para realizar la resta: "); //Le pedimos 2 numeros al usuario para la resta 
        //Almacenamos sus respuestas en las variables "n1" y "n2"  
        int n1 = re.nextInt();
        int n2 = re.nextInt();  
        re.close(); //Cerramos el objeto Scanner para liberar los recursos  
        resta(n1, n2); //Llamamos a la funcion resta, pasandole los numeros como argumentos  
    }  
    public static void resta(int n1, int n2){ //Definimos una funcion estatica llamada resta que toma dos enteros como parametros  
        int res = n1 - n2; //Realizamos la operacion  
        System.out.println("El resultado de la resta es: " + res); //Imprimimos el resultado  
    }  
}