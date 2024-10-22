class Funcion12 {
    public static void main(String[] args) {
        // Inicializar variable a y que guarde los caracteres en un arreglo
        char[] a = { 'J', 'o', 'n', 'a', 't', 'h', 'a', 'n' };
        // LLama la funcion arreglo
        arreglo(a);
    }

    // Crea una funcion llamada arreglo y que itere el areglo
    public static void arreglo(char[] x) {
        // Ciclo for que itera el arreglo
        for (int i = 0; i < x.length; i++) {
            // Imprime los caracteres
            System.out.println("Caracter" + i + ": " + x[i]);
        }
    }
}