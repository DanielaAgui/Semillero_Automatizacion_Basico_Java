package unidad2.Clase12;

public class Moto extends Vehiculo {

    //Atributo unico de la clase
    private int cilindraje;

    //Constructor con los atributos del padre
    public Moto(String placa, String color, String marca, int modelo, int cilindraje) {
        //Se fija el 'espacioOcupado' ya que no varia
        super(placa, color, marca, modelo, 1);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metodo abstracto del padre
    @Override
    public int getPrecioHora() {
        //Ciclo que devuelve el precio segun caracteristica
        if (cilindraje > 300) {
            return 2000;
        }
        else {
            return 1000;
        }
    }
}
