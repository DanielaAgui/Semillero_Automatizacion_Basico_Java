package unidad1.Clase1;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        float a = sc.nextFloat();

        System.out.println("Ingrese numero: ");
        float b = sc.nextFloat();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));

        if (b == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println("Division: " + (a / b));
        }
    }
}
