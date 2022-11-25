package unidad1.Clase5;

import java.util.ArrayList;

public class ArreglosDinamicos {

    public static void main(String[] args) {

        //Creamos una lista vacía
        ArrayList<String> marcas = new ArrayList<>();

        marcas.add("BMW");
        marcas.add("Mazda");
        marcas.add("Renault");

        //Para recorrerlo podemos usar un ciclo 'for' con el tamaño de la lista
        for (int i = 0; i < marcas.size(); i++) {
            //Imprime los elementos de la lista según índice
            System.out.println(marcas.get(i));
        }

        //O podemos recorrerlo con un 'forEach'
        for (String marca : marcas) {
            System.out.println(marca);
        }
    }
}
