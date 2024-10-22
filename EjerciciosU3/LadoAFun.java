import java.util.Scanner;

class LadoCuadrado{

    // Función para calcular el área de un cuadrado
    public static int calcularArea(int lado) { 
        // Fórmula del área de un cuadrado (lado*lado)
        return lado * lado; 
    }
//método principal
    public static void main(String[] args) {
        //crear un objeto
        Scanner sc = new Scanner(System.in);

        // Solicitar el lado del cuadrado
        System.out.print("Ingresa el lado del cuadrado: ");
        
        //Ingresa el valor en consola     
        int lado = sc.nextInt();

        // Llamar a la función para calcular el área
        int area = calcularArea(lado);

        // Mostrar el resultado del área
        System.out.println("El área del cuadrado es: " + area);
    }
}
