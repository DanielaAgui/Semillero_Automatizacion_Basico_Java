package unidad2.Clase10.abstraccion;

import java.lang.reflect.MalformedParameterizedTypeException;

public class Cuadrado extends FigurasGeometricas{
    private int lado;

    public Cuadrado(int lado) {
        //Variable del metodo padre
        //No es necesario llamar la variable con 'super'
        nombre = "Cuadrado";
        this.lado = lado;
    }

    //Se tienen que implementar todos los metodos de la clase abstracta
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }
}
