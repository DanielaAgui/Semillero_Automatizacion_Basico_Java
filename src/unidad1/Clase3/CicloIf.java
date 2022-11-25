package unidad1.Clase3;

import java.util.Scanner;

public class CicloIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int a = sc.nextInt();

        System.out.println("Ingrese un número: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println(b + " es mayor que " + a);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}

