package unidad2.Clase10.polimorfismo;

public class Pollito extends Animal{

    //Polimorfismo
    //Sobreescribimos el metodo de la clase padre
    @Override
    public void hacerSonido() {
        System.out.println("Pio pio");
    }
}
