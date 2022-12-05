package unidad2.Clase10.abstraccion;

public class TrianguloEquilatero extends FigurasGeometricas{
    int base;
    int altura;

    public TrianguloEquilatero(int base, int altura) {
        nombre = "Triangulo equilatero";
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}

