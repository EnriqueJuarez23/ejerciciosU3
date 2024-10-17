class ArregloNombre { //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        String[] nombre = {"Antonio", " Ivann", " Reyes", " Perez"}; //Declaro un arreglo de tipo String con mi nombre  
        palabras(nombre); //Llamamos a la funcion palabras  
    }  
    public static void palabras(String[] arreglo) { //Creamos una funcion llamada palabras  
        //Realizamos la impresion de los numeros concatenando los valores ya establecidos  
        for (int i = 0; i < arreglo.length; i++) {  
            System.out.print(arreglo[i]); //Imprimimos el arreglo
        }  
    }  
}