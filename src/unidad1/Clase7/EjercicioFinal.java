package unidad1.Clase7;

import java.util.Scanner;

public class EjercicioFinal {

    public static void main(String[] args) {

        //Vector: unidimensional
        //Matriz: multidimensional

        //Clase Scanner para pedir datos por consola
        Scanner scanner = new Scanner(System.in);
        //Creamos vector tipo 'String' con dos posiciones (tamaño)
        String[] cadenas = new String[2];

        //Añadimos por consola los datos de la primera cadena
        System.out.println("Por favor ingrese la primera cadena separada por comas");
        //Añadimos los datos al vector en la posición cero
        cadenas[0] = scanner.nextLine();

        //Añadimos por consola los datos de la segunda cadena
        System.out.println("Por favor ingrese la segunda cadena separada por comas");
        //Añadimos los datos al vector en la posición uno
        cadenas[1] = scanner.nextLine();

        //Creamos un vector auxiliar de los elementos del vector principal en la posición cero, donde reemplazamos
        //los espacios y dividimos la cadena por las comas
        String[] aux = cadenas[0].replace(" ", "").split(",");
        //Creamos un vector tipo 'int' con un tamaño igual al tamaño del vector auxiliar
        int[] enteroCadenas0 = new int[aux.length];

        //Iteramos sobre el tamaño del vector auxiliar
        for (int i = 0; i < aux.length; i++) {
            //Añadimos en cada posición del vector los elementos de cada posición del vector auxiliar convertidos en 'Integer'
            enteroCadenas0[i] = Integer.parseInt(aux[i]);
        }

        //En el vector auxiliar añadimos los elementos del vector principal en la posición uno donde reemplazamos los
        //espacios y dividimos la cadena por las comas
        aux = cadenas[1].replace(" ", "").split(",");
        //Creamos un vector tipo 'int' con un tamaño igual al tamaño del vector auxiliar
        int[] enteroCadenas1 = new int[aux.length];

        //Iteramos sobre el tamaño del vector auxiliar
        for (int i = 0; i < aux.length; i++) {
            //Añadimos en cada posición del vector los elementos de cada posición del vector auxiliar convertidos en 'Integer'
            enteroCadenas1[i] = Integer.parseInt(aux[i]);
        }

        //Método de ordenamiento de burbuja
        //Iteramos sobre el tamaño del vector de enteros
        for (int i = 0; i < enteroCadenas0.length; i++) { //'i' es el elemento en la posición cero y va subiendo
            for (int j = 0; j < enteroCadenas0.length; j++) { //'j' es el elemento en la posición uno y va subiendo
                //Si el elemento en la posición 'i' es menor al elemento en la posición 'j'
                if (enteroCadenas0[i] < enteroCadenas0[j]){
                    //Creamos una variable 'int' y añadimos el elemento de la posición 'j'
                    int auxInt = enteroCadenas0[j];
                    //El elemento de la posición 'i' pasa a ser el elemento de la posición 'j'
                    enteroCadenas0[j] = enteroCadenas0[i];
                    //El elemento de la posición 'i' pasa a ser el elemento de la variable
                    enteroCadenas0[i] = auxInt;
                }
            }
        }

        //Repetimos el método de ordenamiento de burbuja para la segunda cadena
        for (int i = 0; i < enteroCadenas1.length; i++) {
            for (int j = 0; j < enteroCadenas1.length; j++) {
                if (enteroCadenas1[i] < enteroCadenas1[j]){
                    int auxInt = enteroCadenas1[j];
                    enteroCadenas1[j] = enteroCadenas1[i];
                    enteroCadenas1[i] = auxInt;
                }
            }
        }

        //Creamos una variable para la respuesta
        String respuesta = "";
        //Iteramos sobre el tamaño de la primer cadena
        for (int i = 0; i < enteroCadenas0.length; i++) {
            //Iteramos sobre el tamaño de la segunda cadena
            for (int j = 0; j < enteroCadenas1.length; j++) {
                //Si el elemento en cada posición de la primer cadena es igual al elemento de cada posición de la
                //segunda cadena
                if (enteroCadenas0[i] == enteroCadenas1[j]){
                    //Añadimos los elementos en la variable 'respuesta' en tipo 'String' separados por comas
                    respuesta += String.valueOf(enteroCadenas0[i]+ ",");
                }
            }
        }

        //Si la variable 'respuesta' está vacía
        if (respuesta.isEmpty()){
            //La respuesta equivale a un mensaje
            respuesta = "No hay numeros repetidos";
            System.out.println(respuesta);
        } else {
            //En caso de que no esté vacía, devolvemos la cadena desde la posición cero hasta el tamaño - 1, para
            //quitar la coma del final
            System.out.println(respuesta.substring(0, respuesta.length() - 1));
        }
    }
}
