package unidad1.Clase6;

import java.util.Scanner;

public class EjercicioTipoString {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre de usuario: ");
        String nombreUsuario = sc.nextLine();

        //Verificamos la longitud de la cadena pasada
        if ((nombreUsuario.length() < 4) || (nombreUsuario.length() > 25)) {
            System.out.println("El nombre de usuario debe tener entre 4 y 25 caracteres");
            //Verifica si el substring entre los índices 0 y 1, tiene números
        } else if (nombreUsuario.substring(0, 1).matches("[0-9]")) {
            System.out.println("El nombre de usuario debe comenzar con una letra");
            //Verifica si la cadena termina en guión bajo
        } else if (nombreUsuario.endsWith("_")) {
            System.out.println("El nombre de usuario no puede terminar en guión bajo");
            //Verifica si el nombre de usuario no cumple con la condición
        } else if (!nombreUsuario.matches("\\w*")) {
            System.out.println("El nombre de usuario solo puede contener letras, números o guión bajo");
        } else {
            System.out.println("Nombre de usuario válido");
        }
    }
}

