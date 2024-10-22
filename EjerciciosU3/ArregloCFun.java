class IterarArregloC {

    // Función para imprimir todos los caracteres del arreglo
    public static void imprimirArreglo(char[] arreglo) {
        // Usamos un bucle for
        for (int i = 0; i < arreglo.length; i++) {
            //Mensaje que se imprime en consola 
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }
    }
//método principal
    public static void main(String[] args) {
        // Declarar un arreglo con los caracteres de tu nombre
        char[] caracteresNombre = {'m', 'a', 'u', 'r', 'i', 'c', 'i', 'o'};  

        // Llamar a la función para imprimir los caracteres del arreglo
        imprimirArreglo(caracteresNombre);
    }
}
