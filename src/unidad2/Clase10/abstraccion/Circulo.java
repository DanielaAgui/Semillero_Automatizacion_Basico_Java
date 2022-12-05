package unidad2.Clase10.abstraccion;

public class Circulo implements Perimetro{
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
