import java.util.Scanner; //Importamos la libreria Scanner  
class AreaRectangulo{ //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        Scanner ar = new Scanner(System.in); //Creamos un objeto con la clase Scanner  
        System.out.println("Dame la altura del rectangulo: "); //Le pedimos la altura al usuario  
        int al = ar.nextInt(); //Almacenamos su valor en la variable "al"  
        System.out.println("Dame la base del rectangulo: "); //Le pedimos la base  
        int ba = ar.nextInt(); //Almacenamos el dato en la variable "ba"  
        ar.close(); //Cerramos el objeto "ar" para liberar recursos  
        area(al, ba); //Llamamos a la funcion area, pasandole 2 numeros como argumentos  
    }  
    public static void area(int al, int ba){ //Definimos una funcion estatica llamada area que toma los valores como parametros  
        int area = ba * al; //Realizamos la operacion  
        System.out.println("El area del rectangulo es: " + area); //Imprimimos el resultado  
    }  
}