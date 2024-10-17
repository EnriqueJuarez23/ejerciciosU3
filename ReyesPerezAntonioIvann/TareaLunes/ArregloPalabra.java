class ArregloPalabra { //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        String[] utiles = {"Gises", "Colores", "Hojas", "Plumones", "Tijeras", "Plumas", "Pinceles", "Pinturas", "Acuarelas", "Lapices"}; //Declaramos un arreglo de tipo String con diferentes palabras
        palabras(utiles); //Llamamos a la funcion palabras 
    }  
    public static void palabras(String[] arreglo) { //Creamos una funcion llamada palabras  
        //Realizamos la impresion de los numeros concatenando los valores ya establecidos  
        for (int b = 0; b < arreglo.length; b++) {  
            System.out.println(arreglo[b]);  
        }  
    }  
}