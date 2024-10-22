class Funcion11 {
    public static void main(String[] args) {
        // Inicializar variable a y que guarde los palabras en un arreglo
        String[] a = { "Manzana", "Uva", "Naranja", "Mandarina", "Piña", "Platano", "Coco", "Granada", "Frambuesa",
                "Mora" };
        // LLama la funcion arreglo
        arreglo(a);
    }

    // Crea una funcion llamada arreglo y que itere el areglo
    public static void arreglo(String[] x) {
        // Ciclo for que itera el arreglo
        for (int i = 0; i < x.length; i++) {
            // Imprime los palabras
            System.out.println("Palabra" + i + ": " + x[i]);
        }
    }
}