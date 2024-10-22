import java.util.Scanner;

class AreaRectangulo {

    // Función para calcular el área del rectángulo
    public static int calcularArea(int b, int a) {
        // Fórmula del área del rectángulo
        return b * a;  
    }
    //método principal

    public static void main(String[] args) {
        //Crear el objeto
        Scanner sc = new Scanner(System.in);

        // Solicitar la base del rectángulo
        System.out.print("Ingresa la base del rectángulo: ");
        // Se almacena valor 
        int base = sc.nextInt();

        // Solicitar la altura del rectángulo
        System.out.print("Ingresa la altura del rectángulo: ");
         // Se almacena valor 
        int altura = sc.nextInt();

        // Llamar a la función para calcular el área
        int area = calcularArea(base, altura);

        // Mostrar el resultado del área
        System.out.println("El área del rectángulo es: " + area);
    }
}
