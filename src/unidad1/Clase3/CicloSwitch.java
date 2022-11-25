package unidad1.Clase3;

public class CicloSwitch {

    public static void main(String[] args) {

        //Utilizado para manejar muchas alternativas
        //Debe estar acompañado de un 'break' para que no se ejecute el siguiente bloque
        int num = 10;

        switch (num) {
            case 10:
                System.out.println("El número es 10");
                break;
            case 5:
                System.out.println("El número es 5");
                break;
            default:
                System.out.println("No tengo ese número mapeado");
        }

        String dia = "lunes";

        switch(dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Día laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Fin de semana");
                break;
        }
    }
}

