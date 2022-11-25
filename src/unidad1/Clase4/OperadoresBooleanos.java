package unidad1.Clase4;

public class OperadoresBooleanos {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a < b || a % 2 == 0) {
            System.out.println("Operador lógico 'or'");
        }

        if (a < b && a % 2 == 0) {
            System.out.println("Operador lógico 'and'");
        }
    }
}
