package unidad1.Clase4;

import java.util.Scanner;

public class EjercicioArreglosUnidimensionales {

    public static void main(String[] args) {

        //Ejercicio agregar notas por consola
        int suma = 0;
        //Creamos el arreglo
        double[] notas = new double[5];
        Scanner sc = new Scanner(System.in);

        //Iteramos sobre las posiciones del arreglo
        for (int i = 0; i < notas.length; i++) {
            //Agregamos las notas por consola
            System.out.println("Ingrese una nota: ");
            //Las añadimos al arreglo
            notas[i] = sc.nextDouble();
            //Si la nota es mayor a 5 y menor a 0
            while ((notas[i] > 5) || (notas[i] < 0)) {
                //Agregamos otra nota
                System.out.println("Nota inválida, ingrese una nota entre 0 y 5");
                notas[i] = sc.nextDouble();
            }
        }

        //Iteramos sobre los elementos del arreglo
        for (int i = 0; i < notas.length; i++) {
            //Los sumamos
            suma += notas[i];
        }
        //Imprimimos el promedio
        System.out.println("El promedio de las notas es: " + (suma / notas.length));
    }
}
