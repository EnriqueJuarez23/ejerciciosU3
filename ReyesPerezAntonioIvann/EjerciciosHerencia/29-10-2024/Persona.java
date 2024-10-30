class Persona {  
    String nombre;  
    String apellido;  
    int edad;  

    Persona() {  
    }  

    Persona(String nombre, String apellido, int edad) {  
        this.nombre = nombre;  
        this.apellido = apellido;  
        this.edad = edad;  
    }  

    public String mostrarPersona() {  
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad;  
    }  

    @Override  
    public String toString() {  
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";  
    }
}