package unidad2.Clase10.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Pollito pollito = new Pollito();
        Perro perro = new Perro();

        animal.hacerSonido();
        pollito.hacerSonido();
        perro.hacerSonido();
    }
}
