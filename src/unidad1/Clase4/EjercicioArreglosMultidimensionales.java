package unidad1.Clase4;

import java.util.Scanner;

public class EjercicioArreglosMultidimensionales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedimos por consola la cantidad de alumnos a ingresar
        System.out.println("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = sc.nextInt();
        sc.nextLine();

        //Pedimos por consola la cantidad de notas a ingresar para cada alumno
        System.out.println("Ingrese la cantidad de notas: ");
        int cantidadNotas = sc.nextInt();
        sc.nextLine();

        //Creamos una matriz con tamaño según alumnos y notas + 1 (teniendo en cuenta la columna de nombres de alumnos)
        String[][] alumnos = new String[cantidadAlumnos][cantidadNotas + 1];

        //Iteramos sobre la cantidad de alumnos pasada por consolo
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese nombre del alumno:");
            //Los agregamos a la matriz en la posición [i, 0]
            alumnos[i][0] = sc.nextLine();

        }

        //Iteramos sobre la longitud de la matriz
        for (int i = 0; i < alumnos.length; i++) {
            //Pedimos ingresar por consola las notas para cada alumno
            System.out.println("Ingrese notas del alumno " + alumnos[i][0] + ": ");
            //Iteramos sobre la longitud del arreglo en la posición j
            for (int j = 1; j < alumnos[i].length; j++) {
                //Agregamos los elementos pasados por consola
                alumnos[i][j] = sc.nextLine();
                //Convertimos los elementos a int para verificar que estén entre 0 y 5
                if ((Double.parseDouble(alumnos[i][j]) > 5) || (Double.parseDouble(alumnos[i][j]) < 0)) {
                    //Si no está en el rango, manda mensaje de error y pide una nueva nota
                    System.out.println("Nota inválida, ingrese una nota entre 0 y 5");
                    //Agregamos la nueva nota en el arreglo
                    alumnos[i][j] = sc.nextLine();
                }
            }
        }

        //Iteramos sobre el arreglo para imprimirlo
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("\nNotas de ");
            for (int j = 0; j < alumnos[i].length; j++) {
                System.out.print(alumnos[i][j] + " | ");
            }
        }

        //Iteramos sobre el arreglo
        for (int i = 0; i < alumnos.length; i++) {
            //Creamos una variable de suma total
            double sumatotal = 0;
            //Creamos una variable de promedio
            double promedio = 0;
            for (int j = 1; j < alumnos[i].length; j++) {
                //Sumamos los elementos uno con otro, convirtiendo el arreglo a double
                sumatotal = sumatotal + Double.parseDouble(alumnos[i][j]);
                //Sacamos el promedio de las notas
                promedio = sumatotal / cantidadNotas;
            }
            //Si se obtiene un promedio mayor o igual a 3
            if ((promedio >= 3.0) && (promedio <= 5.0)) {
                //El estudiante aprueba la materia
                System.out.print("\nEl estudiante " + alumnos[i][0] + " aprobó con un promedio de: " + promedio);
            } else {
                //O sino reprueba la materia
                System.out.print("\nEl estudiante " + alumnos[i][0] + " reprobó con un promedio de: " + promedio);
            }
        }
    }
}
