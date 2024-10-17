import java.util.Scanner; //Importamos la libreria Scanner  
class Lado{ //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        Scanner op = new Scanner(System.in); //Creamos un objeto con la clase Scanner  
        System.out.println("Dame el valor del lado del cuadrado: "); //Le pedimos el valor del lado del cuadrado al usuario  
        int n1 = op.nextInt(); //Almacenamos su respuesta en la variable "n1"  
        op.close(); //Cerramos el objeto "op" para liberar recursos  
        area(n1); //Llamamos a la funcion area  
    }  
    public static void area(int n1){ //Definimos una funcion estatica llamada area que toma los valores como parametros  
        int res = n1 * n1; //Realizamos el calculo del area  
        System.out.println("El valor del area es: " + res); //Imprimimos el resultado  
    }  
}