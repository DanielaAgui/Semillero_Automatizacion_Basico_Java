package unidad2.Clase9;

import java.util.List;

public class Hijo extends Padre{

    //Atributos de la clase hijo
    List<String> videoJuegos;

    //Constructor de la clase hija
    //Cuando hay herencia se tienen que poner los atributos requeridos segun la clase padre
    public Hijo(String nombre, List<String> videoJuegos) {
        //Con 'super' llamamos los atributos del constructor de la clase padre
        super(nombre);
        this.videoJuegos = videoJuegos;
    }

    //Método de la clase hija
    public void decirVideoJuegos() {
        System.out.println("Tengo los siguientes videojuegos: ");

        for (String videoJuego : videoJuegos) {
            System.out.println(videoJuego);
        }
    }
}
