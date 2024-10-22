import java.util.Scanner;

class AreaPoligono {

    // Función para calcular el área de un polígono 
    public static double calcularArea(double p, double a) {
        // Fórmula del área del polígono
        return (p * a) / 2;  
    }
    //Método principal
    public static void main(String[] args) {
        //Crear objeto 
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el perímetro del polígono
        System.out.print("Ingresa el perímetro del polígono: ");
        //Ingresa el valor en consola
        double p = sc.nextDouble();

        // Pedir al usuario el apotema del polígono
        System.out.print("Ingresa el apotema del polígono: ");
        //Ingresa el valor en consola 
        double a = sc.nextDouble();

        // Llamar a la función para calcular el área
        double area = calcularArea(p, a);

        // Mostrar el resultado del área
        System.out.println("El área del polígono es: " + area);
    }
}
