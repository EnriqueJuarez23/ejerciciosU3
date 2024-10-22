class Funcion10 {
    public static void main(String[] args) {
        // Inicializar variable a y que guarde los numeros en un arreglo
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // LLama la funcion arreglo
        arreglo(a);
    }

    // Crea una funcion llamada arreglo y que itere el areglo
    public static void arreglo(int[] x) {
        // Ciclo for que itera el arreglo
        for (int i = 0; i < x.length; i++) {
            // Imprime los numeros
            System.out.println(x[i]);
        }
    }
}