import java.util.Scanner; //Importamos la libreria Scanner  
class Numero{ //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        Scanner op = new Scanner(System.in); //Creamos un objeto con la clase Scanner  
        System.out.println("Dame un numero: "); //Le pedimos un numero al usuario  
        int n1 = op.nextInt(); //Almacenamos su respuesta en la variable "n1"  
        op.close(); //Cerramos el objeto op para ahorrar recursos  
        numero(n1); //Llamamos a la funcion  
    }  
    public static void numero(int n1){ //Creamos una funcion llamada numero  
        //Verificamos que el numero ingresado sea mayor a 20,si no es asi imprimimos mensaje de error  
        if (n1 > 20) {  
            System.out.println("El numero ingresado es mayor a 20");  
        } else {  
            System.out.println("Error.El numero ingresado es menor a 20,intenta de nuevo");  
        }  
    }  
}