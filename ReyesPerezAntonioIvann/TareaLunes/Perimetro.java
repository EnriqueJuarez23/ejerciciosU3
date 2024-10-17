import java.util.Scanner; //Importamos la libreria Scanner  
class Perimetro{ //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        Scanner op = new Scanner(System.in); //Creamos un objeto con la clase Scanner  
        System.out.println("Dame el valor del apotema: "); //Le pedimos el valor del apotema al usuario  
        double n1 = op.nextDouble(); //Almacenamos su respuesta en la variable "n1"  
        System.out.println("Dame el valor del perimetro: "); //Le pedimos el valor del perimetro  
        double n2 = op.nextDouble(); //Almacenamos su respuesta en la variable "n2"  
        op.close(); //Cerramos el objeto op para ahorrar recursos  
        area(n1, n2); //Llamamos a la funcion  
    }  
    public static void area(double n1, double n2){ //Creamos una funcion llamada area  
        double res = (n1 * n2)/2; //Realizamos la operacion  
        System.out.println("El area del poligono es: " + res); //Imprimimos el resultado  
    }  
}