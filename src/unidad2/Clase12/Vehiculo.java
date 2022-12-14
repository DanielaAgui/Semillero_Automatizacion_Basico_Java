package unidad2.Clase12;

import java.time.Instant;
import java.util.Date;

//Clase abstracta para ser heredada
public abstract class Vehiculo {

    //Atributos
    private final String placa;
    private String color;
    private String marca;
    private int modelo;
    private int precioHora;
    private int espacioOcupado;
    private Date horaIngreso;

    //Constructor
    //No se pide 'precioHora' ya que varia segun el vehiculo
    public Vehiculo(String placa, String color, String marca, int modelo, int espacioOcupado) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.espacioOcupado = espacioOcupado;
        //La hora se pide de forma automatica con la hora del sistema
        this.horaIngreso = Date.from(Instant.now());
    }

    //'getters' y 'setters' para acceder o establecer el valor de los atributos
    public String getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    //Metodo abstracto ya que el precio varia segun caracteristicas de cada vehiculo
    public abstract int getPrecioHora();

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    public void setEspacioOcupado(int espacioOcupado) {
        this.espacioOcupado = espacioOcupado;
    }

    public Date getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaIngreso = horaIngreso;
    }
}
