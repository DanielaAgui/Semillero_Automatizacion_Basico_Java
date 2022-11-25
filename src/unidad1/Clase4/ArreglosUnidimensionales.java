package unidad1.Clase4;

public class ArreglosUnidimensionales {

    public static void main(String[] args) {

        //Creamos el arreglo y añadimos los elementos
        int[] numeros = {10, 20, 30, 40};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("----------------------");

        //Creamos el arreglo y establecemos su tamaño
        String[] marcas = new String[4];
        marcas[0] = "BMW";
        marcas[1] = "Ferrari";
        marcas[2] = "Volvo";
        marcas[3] = "Mazda";

        for (int i = 0; i < marcas.length; i++) {
            System.out.println(marcas[i]);
        }
    }
}
