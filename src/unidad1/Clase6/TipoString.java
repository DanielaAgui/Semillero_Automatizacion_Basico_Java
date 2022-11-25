package unidad1.Clase6;

public class TipoString {

    public static void main(String[] args) {

        String texto = "Hola mundo! ";

        //Devuelve el tamaño del String
        System.out.println(texto.length());

        //Devuelve el String en minúsculas
        System.out.println(texto.toLowerCase());

        //Devuelve el String en mayúsculas
        System.out.println(texto.toUpperCase());

        //Reemplaza el texto dado
        String textoNuevo = texto.replace("Hola", "Hello");
        System.out.println(textoNuevo);

        //Reemplaza la primera ubicación del texto dado
        String texto2 = "Hola mundo, Hola gente!";
        String textoNuevo2 = texto2.replaceFirst("Hola", "Hello");
        System.out.println(textoNuevo2);

        //Reemplaza todas las ubicaciones del texto dado
        String texto3 = "Hola mundo, Hola gente!";
        String textoNuevo3 = texto2.replaceAll("Hola", "Hello");
        System.out.println(textoNuevo3);

        //Separa una cadena según el separador dado
        String[] textoSplit = texto.split(" ");
        for (int i = 0; i < textoSplit.length; i++) {
            System.out.println("[" + textoSplit[i] + "]");
        }

        //Elimina los espacios del inicio y final del texto
        System.out.println(texto.trim());

        //Verifica si la cadena contiene el texto dado
        if (texto.contains("Hola")) {
            System.out.println("Contiene la palabra");
        } else {
            System.out.println("No contiene la palabra");
        }

        //Verifica si la cadena comienza con lo indicado
        System.out.println(texto.startsWith("H"));

        //Verifica si la cadena termina con lo indicado
        System.out.println(texto.endsWith("!"));

        //Verifica si la cadena está vacía
        String textoVacio = "";
        System.out.println(textoVacio.isEmpty());

        //Devuelve el caracter en la posición dada
        System.out.println(texto.charAt(5));

        //Devuelve cada caracter de la cadena
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }

        //Devuelve el índice del caracter dado
        System.out.println(texto.indexOf("a"));

        //Devuelve -1 en caso de que no encuentre el caracter dado
        System.out.println(texto.indexOf("t"));

        //Concatena un nuevo texto
        System.out.println(texto.concat("Otro texto"));

        //Devuelve la cadena desde la posición dada
        System.out.println(texto.substring(2)); //Índice de inicio
        System.out.println(texto.substring(2, 8)); //ïndice de inicio y final (no incluido)

        //Verifica si la cadenc cumple con una expresión regular
        System.out.println(texto.matches("[a-z]"));
    }
}
