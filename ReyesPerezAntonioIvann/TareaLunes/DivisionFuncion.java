import java.util.Scanner; //Importamos la clase Scanner  
class DivisionFuncion{ //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        Scanner di = new Scanner(System.in); //Creamos un objeto con la clase Scanner  
        System.out.println("Dame 2 numeros para dividir: "); //Le pedimos 2 numeros al usuario para realizar la division 
        //Almacenamos los valores dados por el usuario en las variables "n1" y "n2" 
        double n1 = di.nextDouble();  
        double n2 = di.nextDouble();  
        di.close(); //Cerramos el objeto Scanner para liberar recursos  
        division(n1, n2); //Llamamos a la funcion division, pasandole los 2 numeros como argumentos  
    }  
    public static void division(double n1, double n2){ //Definimos una funcion estatica llamada suma que toma dos enteros como parametros  
        //Colocamos una validacion que verifique que los 2 numeros dados por el usuario sean numeros enteros y en caso de que el segundo numero sea 0 mandara un mensaje de error  
        if (n2 != 0) {  
            System.out.println("El resultado de la division es: " + (n1/n2)); //Imprimimos el resultado  
        } else {  
            System.out.println("No se puede dividir por 0");  
        }  
    }  
}