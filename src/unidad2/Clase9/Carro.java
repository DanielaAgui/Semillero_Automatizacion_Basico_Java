package unidad2.Clase9;

public class Carro {
    //Atributos
    //Solo pueden ser accedidos a traves del objeto, no de la clase
    String marca;
    String color;
    int tamanoMotor;
    int modelo;

    //Metodo constructor
    public Carro(String marca) {
        //Con 'this' especificamos que hacemos referencia a la variable de la clase
        this.marca = marca;
    }

    //Se pueden tener varios constructores sin repetir los mismos tipos de parametros
    public Carro(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Constructor vacio es un constructor por defecto
    public Carro() {
        marca = "Generico";
        color = "Beige";
        tamanoMotor = 1200;
        modelo = 2005;
    }

    //M�todos
    public void describirCarro() {
        System.out.println("La marca es " + marca);
        System.out.println("El color es " + color);
        System.out.println("El tamano del motor es  " + tamanoMotor);
    }

    public void asignarTamano(int tamano) {
        tamanoMotor = tamano;
    }

    //Sobrecarga de metodos
    //Se pueden tener varios metodos con el mismo nombre siempre y cuando tengan distintos tipos de variable en los par�metros
    public void asignarTamano(double tamano) {
        //Se convierte ya que la variable es de tipo 'int'
        tamanoMotor = (int) tamano;
    }
}
