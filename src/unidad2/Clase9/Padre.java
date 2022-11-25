package unidad2.Clase9;

public class Padre {
    String nombre;
    int edad;

    //Constructor de la clase padre que requiere un atributo
    public Padre(String nombre) {
        this.nombre = nombre;
    }

    public void decirNombre() {
        System.out.println("Mi nombre es " + nombre);
    }
}
