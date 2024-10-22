class IterarArregloN {

    // Función para imprimir todos los elementos 
    public static void imprimirArreglo(int[] arreglo) {
        // Usamos un bucle for para recorrer el arreglo
        for (int i = 0; i < arreglo.length; i++) {
       //Mensaje que se imprime en consola (condición)           
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }
    }
//método principal
    public static void main(String[] args) {
        // Declarar un arreglo de 10 números
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Llamar a la función para imprimir los elementos del arreglo
        imprimirArreglo(numeros);
    }
}
