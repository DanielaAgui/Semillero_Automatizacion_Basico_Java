package unidad1.Clase4;

import java.util.Scanner;

public class ArreglosMultidimensionales {

    public static void main(String[] args) {

        //Creamos una matriz, los corchetes son las dimensiones que tiene
        //Primero son las filas y luego las columnas
        int[][] matriz = {{2, 4}, {1, 3}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }

        System.out.println("----------------------");

        Scanner sc = new Scanner(System.in);
        int[][] matriz2 = new int[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento [" + i + "," + j + "]");
                matriz2[i][j] = sc.nextInt();
            }
        }
    }
}
