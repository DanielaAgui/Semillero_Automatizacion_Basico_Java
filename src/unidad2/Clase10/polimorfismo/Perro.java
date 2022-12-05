package unidad2.Clase10.polimorfismo;

public class Perro extends Animal {

    //Si no sobreescribimos el metodo, ejecuta el metodo de la clase padre
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}
