public class Coche {

    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;

    public Coche(String marca, String modelo, int año, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.precio = precio;
    }

    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }

    public void frenar() {
        System.out.println("El coche está fretando.");
    }

    public double obtenerPrecioConDescuento(double descuento) {
        return precio - (precio * descuento / 100);
    }

}