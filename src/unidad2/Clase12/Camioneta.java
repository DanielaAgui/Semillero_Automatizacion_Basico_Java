package unidad2.Clase12;

public class Camioneta extends Vehiculo {

    //Atributo unico de la clase
    private int numeroPuertas;

    //Constructor con los atributos del padre
    public Camioneta(String placa, String color, String marca, int modelo, int numeroPuertas) {
        //Se fija el 'espacioOcupado' ya que no varia
        super(placa, color, marca, modelo, 4);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    //Metodo abstracto del padre
    @Override
    public int getPrecioHora() {
        //Ciclo que devuelve el precio segun caracteristica
        if (numeroPuertas > 4) {
            return 6000;
        }
        else {
            return 8000;
        }
    }
}
