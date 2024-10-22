import java.util.Scanner; 
class DivisiónFuncion{
    //Método principal 
    public static void main(String[] args) {
        //Se crea objeto
        Scanner sc = new Scanner (System.in);
        System.out.println("**división**");
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
        //Se llama el método o función para realizar la división
        división (num1, num2);
    }
    //Método/Función que realiza la división de dos variables 
    public static void división(int num1, int num2) {
        //Se crea una variable donde se almacena el resultado de la división
        int resultado = num1 / num2;
        //Se imprime en pantalla el resultado 
        System.out.println("El resultado de la división de " +  num1 + " / " + num2 + " es = " + resultado);
    }
}