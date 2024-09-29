public class Computadora {
    private String marca;
    private String modelo;
    private int ram;
    private int almacenamiento;
    private double precio;

    public Computadora(String marca, String modelo, int ram, int almacenamiento, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }

    public void encender() {
        System.out.println("La computadora está encendida.");
    }

    public void apagar() {
        System.out.println("La computadora esta apagada.");
    }
    public boolean esSuficienteMemoria(int minimoRequerido) {
        return ram >= minimoRequerido;
    }

}
