import java.util.Scanner; //Importamos la clase Scanner  
class ModuloFuncion{ //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        Scanner mo = new Scanner(System.in); //Creamos un objeto a partir de la clase Scanner  
        System.out.println("Ingrese un numero: "); //Le pedimos un numero al usuario  
        int n1 = mo.nextInt(); //Almacenamos el numero dado por el usuario en la variable "n1"  
        System.out.println("Ingrese el valor del modulo: "); //Le pedimos al usuario el valor del modulo  
        int va = mo.nextInt(); //Lo almacenamos en la variable "va"  
        mo.close(); //Cerramos el objeto "mo" para liberar recursos  
        modulo(n1, va); //Llamamos la funcion modulo, pasandole los 2 numeros como argumentos  
    }  
    public static void modulo(int n1, int va){ //Definimos una funcion estatica llamada modulo que toma los valores como parametros  
        int modulo = n1 % va; //Realizamos la operacion  
        System.out.println("El modulo de " + n1 + " es " + modulo); //Imprimimos el resultado  
    }  
}