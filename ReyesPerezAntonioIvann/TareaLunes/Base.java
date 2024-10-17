import java.util.Scanner; //Importamos la libreria Scanner  
class Base{ //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        Scanner op = new Scanner(System.in); //Creamos un objeto con la clase Scanner  
        System.out.println("Dame el valor de la base: "); //Le pedimos la base al usuario  
        double ba = op.nextDouble(); //Almacenamos su respuesta en la variable "ba"  
        System.out.println("Dame el valor de la altura: "); //Le pedimos la altura al usuario  
        double al = op.nextDouble(); //Almacenamos su respuesta en la variable "al"  
        op.close(); //Cerramos el objeto op para ahorrar recursos  
        triangulo(ba, al); //Llamamos a la funcion triangulo  
    }  
    public static void triangulo(double ba, double al){ //Creamos una funcion llamada triangulo  
        double area = (ba * al)/2; //Realizamos la operacion  
        System.out.println("El area del triangulo es: " + area); //Imprimimos el resultado  
    }  
}