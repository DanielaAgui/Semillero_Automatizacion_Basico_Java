package unidad2.Clase9;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Instanciar un objeto
        Carro bmw = new Carro("BMW");
        //Uso de atributos
        bmw.color = "Amarillo";
        System.out.println(bmw.color);

        Carro mazda = new Carro("Mazda", 2005);
        mazda.color = "Rojo";
        //Uso de metodos
        mazda.describirCarro();

        System.out.println("----------------------");

        //En los objetos de clase padre NO podemos usar los metodos de la clase hija
        Padre padre = new Padre("Pepe");
        padre.edad = 36;

        Hijo hijo = new Hijo("Juan", Arrays.asList("Crash", "Smack down"));
        hijo.edad = 12;
        //En el objeto de la clase hija podemos usar los metodos de la clase padre
        hijo.decirNombre();
        hijo.decirVideoJuegos();
    }
}
