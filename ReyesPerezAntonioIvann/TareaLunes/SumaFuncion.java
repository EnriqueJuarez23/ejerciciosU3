import java.util.Scanner; //Importamos la libreria Scanner  
class SumaFuncion{ //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        Scanner su = new Scanner(System.in); //Creamos un objeto en base a la libreria Scanner  
        System.out.println("Dame 2 numeros para realizar la suma: "); //Le pedimos 2 numeros al usuario para la suma  
        //Almacenamos sus respuestas en las variables "n1" y "n2"  
        int n1 = su.nextInt(); 
        int n2 = su.nextInt();  
        su.close(); //Cerramos el objeto Scanner para liberar los recursos  
        suma(n1, n2); //Llamamos a la funcion suma, pasandole los numeros como argumentos  
    }  
    public static void suma(int n1, int n2){ //Definimos una funcion estatica llamada suma que toma dos enteros como parametros  
        int res = n1 + n2; //Realizamos la operacion  
        System.out.println("El resultado de la suma es: " + res); //Imprimimos el resultado  
    }  
}