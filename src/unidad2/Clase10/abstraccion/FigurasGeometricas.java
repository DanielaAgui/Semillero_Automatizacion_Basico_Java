package unidad2.Clase10.abstraccion;

//Sirve para implementar los metodos en otras clases
public abstract class FigurasGeometricas {
    //Las clases abstractas permiten variables y metodos definidos
    String nombre;

    public void decirNombre() {
        System.out.println("La figura es: " + nombre);
    }

    //Metodo abstracto
    public abstract double calcularArea();
    public abstract double perimetro();
}
