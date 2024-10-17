class ArregloNumero { //Nombre de la clase  
    public static void main(String[] args) { //Metodo principal  
        int [] num = {0,1,2,3,4,5,6,7,8,9,10}; //Declaramos un arreglo con valores  
        arreglo(num); //Llamamos a la funcion arreglo  
    }  
    public static void arreglo(int[] arreglo) { //Definimos una funcion estatica llamada arreglo  
        //Realizamos la impresion de los numeros concatenando los valores ya establecidos  
        for (int a = 0; a < arreglo.length; a++) {  
            System.out.println(arreglo[a]);  
        }  
    }  
}