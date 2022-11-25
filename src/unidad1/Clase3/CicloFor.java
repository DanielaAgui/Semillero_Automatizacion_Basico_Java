package unidad1.Clase3;

public class CicloFor {

    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            System.out.println(i);
            if (i == 10)
                //Rompe el ciclo y no ejecuta
                break;
        }

        for(int i = 0; i < 15; i++ ){
            if(i == 10)
                //Se salta el valor que cumple la condición
                continue;
            System.out.println("Contador for: " +i);
        }
    }
}

