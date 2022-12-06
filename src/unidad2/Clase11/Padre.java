package unidad2.Clase11;

public class Padre {

    //La variable no puede ser modificada
    final String nombre;
    //Solo pueden ser llamadas por la clase
    public static String apellidos;
    //Constante, debe estar instanciada en su creación
    final static String CONSTANTE_EJEMPLO = "";

    public Padre(String nombre) {
        this.nombre = nombre;
    }

    public void decirNombre() {
        System.out.println("Mi nombre es " + nombre);
    }

    //En un metodo 'static' solo puedo usar variables de tipo 'static'
    //Solo podemos acceder a ellos a través de la clase
    public static void decirApellidos() {
        System.out.println(apellidos);
    }
}
