package unidad2.Clase10.abstraccion;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println(cuadrado.calcularArea());

        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(10, 20);
        trianguloEquilatero.decirNombre();
        System.out.println(trianguloEquilatero.calcularArea());
    }
}
