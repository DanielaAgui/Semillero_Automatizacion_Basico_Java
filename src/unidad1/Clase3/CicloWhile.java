package unidad1.Clase3;

import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un mes: ");
        String mes = sc.next();

        //'while' verifica la condición y luego ejecuta la sentencia
        //Con 'equals()' comparamos caracteres
        while (mes.equals("enero")) {
            System.out.println("Ingrese otro mes: ");
            mes = sc.next();
        }

        int num = 15;

        //'do-while' ejecuta la sentencia y luego verifica la condición, si se cumple sigue ejecutando
        do {
            System.out.println("Do-while: " + num);
        }
        while (num < 15);
    }
}

