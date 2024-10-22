import java.util.Scanner;

class AreaTriangulo {

    // Función para calcular el área del triángulo
    public static double calcularArea(double base, double altura) {
         // Fórmula del área de un triángulo
        return (base * altura) / 2; 
    }
// método principal
    public static void main(String[] args) {
        // Se crea el objeto 
        Scanner sc = new Scanner(System.in);

        // Solicitar la base del triángulo
        System.out.print("Ingresa la base del triángulo: ");
         // Se almacena valor 
        double base = sc.nextDouble();

        // Solicitar la altura del triángulo
        System.out.print("Ingresa la altura del triángulo: ");
         // Se almacena valor 
        double altura = sc.nextDouble();

        // Llamar a la función para calcular el área
        double area = calcularArea(base, altura);

        // Mostrar el resultado del área
        System.out.println("El área del triángulo es: " + area);
    }
}
