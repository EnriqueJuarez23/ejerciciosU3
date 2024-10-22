class IterarArregloPalabras {

    // Función para imprimir todos los elementos 
    public static void imprimirArreglo(String[] arreglo) {
        // Usamos un bucle for
        for (int i = 0; i < arreglo.length; i++) {
        //Mensaje que se imprime en consola (condición)               
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }
    }
//método principal
    public static void main(String[] args) {
        // Declarar un arreglo de 10 palabras
        String[] palabras = {"hola", "mundo", "adios", "programación", "arreglo", "función", "clase", "bucle", "condición", "variable"};

        // Llamar a la función para imprimir los elementos del arreglo
        imprimirArreglo(palabras);
    }
}
