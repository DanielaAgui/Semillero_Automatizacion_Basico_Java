package unidad2.Clase8;

import static java.lang.System.out;

public class MiPrimerMetodo {

    public static void main(String[] args) {
        miPrimerMetodo();
        miPrimerMetodoConParametro("Hola");
        removerComasYEspacios("Hola, como");
    }

    //Creación de método básico
    public static void miPrimerMetodo() {
        out.println("Imprimiendo desde mi primer metodo");
    }

    //Método que recibe parámetros
    public static void miPrimerMetodoConParametro(String mensaje) {
        out.println(mensaje);
    }

    //Método que retorna algo, siempre debe tener la sentencia 'return'
    public static String removerComasYEspacios(String texto) {
        String textoModificado = texto.replace(" ", "");
        textoModificado = textoModificado.replace(",", "");
        return textoModificado;
    }
}
