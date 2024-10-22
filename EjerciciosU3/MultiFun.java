import java.util.Scanner; 
class MultiplicaciónFuncion{
    //Método principal 
    public static void main(String[] args) {
        //Se crea objeto
        Scanner sc = new Scanner (System.in);
        System.out.println("**Multiplicacion**");
        //Se le pide al usuario un número 
        System.out.println("Ingresa un número");
        //Se ingresa el valor en consola 
        int num1 = sc.nextInt();
        //Se le pide otro número 
        System.out.println("Ingresa otro número");
         //Se ingresa el segundo valor en consola 
        int num2 = sc.nextInt();
        //Se cierra el objeto Scanner 
        sc.close();
        //Se llama el método o función para realizar la multiplicación
        multiplicación (num1, num2);
    }
    //Método/Función que realiza la multiplicación de dos variables 
    public static void multiplicación(int num1, int num2) {
        //Se crea una variable donde se almacena el resultado de la multiplicación
        int resultado = num1 * num2;
        //Se imprime en pantalla el resultado 
        System.out.println("El resultado de la multiplicación de " +  num1 + " * " + num2 + " es = " + resultado);
    }
}