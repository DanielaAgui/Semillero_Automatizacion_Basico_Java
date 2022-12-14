package unidad2.Clase12;

public class Carro extends Vehiculo {

    //Atributo unico de la clase
    private String tamano;

    //Constructor con los atributos del padre
    public Carro(String placa, String color, String marca, int modelo, String tamano) {
        //Se fija el 'espacioOcupado' ya que no varia
        super(placa, color, marca, modelo, 2);
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    //Metodo abstracto del padre
    @Override
    public int getPrecioHora() {
        //Ciclo que devuelve el precio segun caracteristica
        switch(tamano) {
            case "pequeño":
                return 3000;
            case "mediano":
                return 4000;
            case "grande":
                return 5000;
        }
        return 0;
    }
}
