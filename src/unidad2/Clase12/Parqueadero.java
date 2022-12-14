package unidad2.Clase12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Parqueadero {

    //Atributo del espacio total del parqueadero
    private int espacioTotal;
    private List<Vehiculo> listaVehiculos;

    public Parqueadero(int espacioTotal) {
        this.espacioTotal = espacioTotal;
        listaVehiculos = new ArrayList<>();
    }

    //Metodo para verificar si la placa existe dentro del parqueadero
    public boolean vehiculoExistente(String placa) {
        //Iteramos sobre la lista de vehiculos
        for (Vehiculo vehiculo : listaVehiculos) {
            //Obtenemos la placa del vehiculo y si es igual a la placa dada por parametro
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                //Devuelve 'true'
                return true;
            }
        }
        //O sino devuelve 'false'
        return false;
    }

    //Metodo para calcular el espacio disponible en el parqueadero
    public int calcularEspacioDisponible() {
        //El espacio ocupado comienza en cero
        int espacioOcupado = 0;

        //Iteramos sobre cada vehiculo en la lista de vehiculos
        for (Vehiculo vehiculo : listaVehiculos) {
            //Obtenemos el espacio ocupado de cada vehiculo y lo vamos sumando al espacio ocupado del parqueadero
            espacioOcupado += vehiculo.getEspacioOcupado();
        }
        //Devolvemos la resta entre el espacio del parqueadero y el espacio ocupado por los vehiculos
        return espacioTotal - espacioOcupado;
    }

    //Metodo para guardar vehiculos en el parqueadero
    public void guardarVehiculo(Vehiculo vehiculos) {
        //Espacio disponible en el parqueadero que se da segun el metodo de 'calcularEspacioDisponible()'
        int espacioDisponible =  calcularEspacioDisponible();

        //Obtenemos las placas de los vehiculos con el metodo 'vehiculoExistente', si retorna 'true'
        if (vehiculoExistente(vehiculos.getPlaca())) {
            //Entonces envia un mensaje
            System.out.println("Ya existe esa placa en el parqueadero");
        }

        //Si el espacio disponible es mayor o igual al espacio ocupado del vehiculo a ingresar
        if (espacioDisponible >= vehiculos.getEspacioOcupado()) {
            //Entonces añadimos el vehiculo a la lista del parqueadero
            listaVehiculos.add(vehiculos);
            //Envia un mensaje de exito con los espacios disponibles
            System.out.println("El vehiculo fue guardado con éxito, quedan " + calcularEspacioDisponible() + " espacio(s)");
        }
        //Si no hay espacio suficiente entonces manda otro mensaje
        else {
            System.out.println("No hay espacio para guardar este vehiculo");
        }
    }

    //Metodo para calcular el precio a pagar del vehiculo
    //Recibe la placa y la fecha de salida del vehiculo
    public int calcularPrecio(String placa, Date fechaSalida) {
        //Si la placa esta dentro del parqueadero
        if (vehiculoExistente(placa)) {
            //Obtenemos el vehiculo segun la placa dada
            Vehiculo vehiculoCalcular = buscarVehiculo(placa);

            //Obtenemos el tiempo en milisegundos de la hora de salida y de la hora de ingreso
            //Restamos para obtener la diferencia de las horas en milisegundos
            long diferenciaMillis = fechaSalida.getTime() - vehiculoCalcular.getHoraIngreso().getTime();
            //Dividimos los milisegundos por 1000 (segundos) y multiplicamos por 3600 (segundos en una hora)
            //Y sacamos el resto de la division (24 horas) para obtener la diferencia en horas
            long diferenciaHoras = (diferenciaMillis / (1000 * 3600)) % 24;
            //Redondeamos la diferencia para tener las horas exactas
            System.out.println("Se redondea las horas hacia arriba: " + Math.ceil(diferenciaHoras));
            //Devolvemos el precio de la hora segun vehiculo multiplicado por las horas en el parqueadero
            return (int) (vehiculoCalcular.getPrecioHora() * diferenciaHoras);
        }
        //Si la placa no se encuentra en el parqueadero, envia un mensaje
        System.out.println("El vehiculo no existe");
        return -1;
    }

    //Metodo para retirar un vehiculo del parqueadero
    public void retirarVehiculo(String placa, Date fechaSalida) {
        //Obtenemos el precio total a pagar por vehiculo con el metodo 'calcularPrecio()'
        int precioTotal = calcularPrecio(placa, fechaSalida);

        //Si el precio a pagar es mayor a cero
        if (precioTotal > 0) {
            //Imprime un mensaje con el total
            System.out.println("El valor a pagar es " + precioTotal);
            //Creamos un objeto con el vehiculo a retirar con el metodo 'buscarVehiculo()'
            Vehiculo vehiculoRetirar = buscarVehiculo(placa);
            //Removemos el vehiculo de la lista de vehiculos del parqueadero
            listaVehiculos.remove(vehiculoRetirar);
            //Enviamos un mensaje
            System.out.println("El vehiculo ha sido retirado");
        }
    }

    //Metodo privado para buscar un vehiculo en el parqueadero
    private Vehiculo buscarVehiculo(String placa) {
        //Iteramos en cada vehiculo de la lista del parqueadero
        for (Vehiculo vehiculo : listaVehiculos) {
            //Obtenemos la placa de cada vehiculo y la comparamos con la placa dada por el usuario
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                //Si se encuentra, devuelve el vehiculo
                return vehiculo;
            }
        }
        //Si no se encuentra, no devuelve nada
        return null;
    }
}