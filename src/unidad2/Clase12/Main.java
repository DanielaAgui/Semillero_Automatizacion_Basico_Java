package unidad2.Clase12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Parqueadero miParqueadero;

    public static void main(String[] args) {

        //Pedimos al usuario el ingreso de la placa del vehiculo
        System.out.println("Por favor ingrese el tamaño del parqueadero: ");
        int espacioTotal = scanner.nextInt();

        //Creamos el parqueadero añadiendo por parametro el espacio total que tiene
        miParqueadero = new Parqueadero(espacioTotal);

        System.out.println("Bienvenido al parqueadero");
        int opcion;
        while (true) {
            //Imprimimos al usuario las opciones disponibles
            System.out.println("Seleccione una de las siguientes opciones: ");
            System.out.println("1. Buscar un vehiculo");
            System.out.println("2. Ingresar un vehiculo");
            System.out.println("3. Calcular precio de salida");
            System.out.println("4. Retirar vehiculo");
            System.out.println("5. Salir");

            //Pedimos al usuario que ingrese la opcion requerida
            opcion = scanner.nextInt();
            //Segun la opcion dada por el usuario, ejecutamos un metodo
            switch (opcion) {
                case 1:
                    ingresarVehiculo();
                case 2:
                    calcularPrecioSalida();
                case 3:
                    retirarVehiculo();
                case 4:
                    System.out.println("Saliendo del parqueadero");
                    System.exit(0);
            }
        }
    }

    //Metodo para retirar el vehiculo
    private static void retirarVehiculo() {
        //Pedimos al usuario el ingreso de la placa del vehiculo
        System.out.println("Ingrese la placa del vehiculo a retirar: ");
        String placa = scanner.next();
        //Pedimos al usuario el ingreso de la fecha de salida del vehiculo
        Date fechaFinal = pedirFecha();
        //Retiramos el vehiculo con el metodo 'retirarVehiculo()' de la clase 'Parqueadero'
        miParqueadero.retirarVehiculo(placa, fechaFinal);
    }

    //Metodo para calcular el precio a pagar
    private static void calcularPrecioSalida() {
        //Pedimos al usuario el ingreso de la placa del vehiculo
        System.out.println("Ingrese la placa del vehiculo: ");
        String placa = scanner.next();
        //Pedimos al usuario el ingreso de la fecha de salida del vehiculo
        Date fechaFinal = pedirFecha();
        //Imprimimos el precio a pagar calculado con el metodo 'calcularPrecio()' de la clase 'Parqueadero'
        System.out.println(miParqueadero.calcularPrecio(placa, fechaFinal));
    }

    //Metodo para ingresar un vehiculo
    private static void ingresarVehiculo() {
        //Pedimos al usuario el ingreso de la placa del vehiculo
        System.out.println("Ingrese la placa del vehiculo: ");
        String placa = scanner.next();
        int opcion;

        //Si la placa dada existe en el parqueadero
        if (miParqueadero.vehiculoExistente(placa)) {
            //Enviamos un mensaje
            System.out.println("Este vehiculo ya fue ingresado previamente");
        }
        //Si no existe en el parqueadero
        else {
            //Pedimos al usuario que ingrese los datos del vehiculo
            System.out.println("Por favor ingrese el color del vehículo: ");
            String color = scanner.next();

            System.out.println("Por favor ingrese la marca del vehiculo: ");
            String marca = scanner.next();

            System.out.println("Por favor ingrese el modelo del vehículo: ");
            int modelo = scanner.nextInt();

            //Pedimos al usuario que seleccione el tipo de vehiculo a ingresar
            System.out.println("Seleccione el tipo de vehículo a ingresar: ");
            System.out.println("1. Moto");
            System.out.println("2. Carro");
            System.out.println("3. Camioneta");

            opcion = scanner.nextInt();
            switch (opcion) {
                //Segun la opcion dada por el usuario, ingresamos el vehiculo a la lista del parqueadero
                case 1:
                    System.out.println("Por favor ingrese el cilindraje: ");
                    int cilindraje = scanner.nextInt();
                    Vehiculo moto = new Moto(placa, color, marca, modelo, cilindraje);
                    miParqueadero.guardarVehiculo(moto);
                    break;
                case 2:
                    System.out.println("Por favor ingrese el tamaño: ");
                    String tamano = scanner.next();
                    Vehiculo carro = new Carro(placa, color, marca, modelo, tamano);
                    miParqueadero.guardarVehiculo(carro);
                    break;
                case 3:
                    System.out.println("Por favor ingrese el número de puertas: ");
                    int numPuertas = scanner.nextInt();
                    Vehiculo camioneta = new Camioneta(placa, color, marca, modelo, numPuertas);
                    miParqueadero.guardarVehiculo(camioneta);
                    break;
            }
        }
    }

    //Metodo para solicitar la fecha
    private static Date pedirFecha() {
        while (true) {
            //Pedimos al usuario el ingreso de la fecha y hora de salida del vehiculo en un formato
            System.out.println("Por favor ingrese la fecha y hora de salida en formato dd/mm/aaaa HH:mm:ss");
            String fecha = scanner.next();

            //Creamos un formato para recibir fechas y horas
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");

            try {
                //Formateamos la fecha dada por el usuario al formato especificado
                simpleDateFormat.parse(fecha);
            } catch (ParseException e) {
                System.out.println("Por favor ingrese fecha y hora válida");
            }
        }
    }


}
