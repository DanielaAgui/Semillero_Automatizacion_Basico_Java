package unidad1.Clase2;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        //Suma
        System.out.println(a + b);

        //Resta
        System.out.println(a - b);

        //Multiplicación
        System.out.println(a * b);

        //División
        System.out.println(a / b);

        //Módulo
        System.out.println(a % b);

        //Preincremento
        ++a;
        System.out.println(a);

        //Postincremento
        a++;
        System.out.println(a);

        //Predecremento
        --a;
        System.out.println(a);

        //Postdecremento
        a--;
        System.out.println(a);

        String numeroTexto = "123";
        int parse = Integer.parseInt(numeroTexto);
        System.out.println(parse);
    }
}

