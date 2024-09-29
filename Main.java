public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Alejandra", 32, "Femenino", "Colombiana", 
        "Negociadora");
        Animal animal = new Animal("Toby","Perro", 5, 20, "Domestico");
        Coche coche = new Coche("Toyoya", "TXL", 2021, "Rojo", 120000000);
        Computadora computadora = new Computadora("Asus" , "Tuf Gaming", 16, 1250, 3000000);
        Libro libro = new Libro("Cien años de Soledad", "Gabriel Garcial Marquez", 300, "Realismo Mágico", 100000);

        persona.presentarse();
        System.out.println("Edad en 10 años: " + persona.calcularEdadEn(10));
        System.out.println("Ocupacion: " + persona.obtenerOcupacion());

        animal.hacerSonido();
        animal.comer();
        System.out.println("¿Es mayor que 3 años?: " + animal.esMayorQue(3));

        coche.acelerar();
        coche.frenar();
        System.out.println("Precio con descuento del 10%: $" + coche.obtenerPrecioConDescuento(10));

        computadora.encender();
        computadora.apagar();
        System.out.println("¿Tiene suficiente memoria (mínimo 8 GB)?: " + computadora.esSuficienteMemoria(8));

        libro.leer();
        System.out.println("Tiempo estimado de lectura a 30 paginas por hora: " + libro.tiempoLectura(30)+ "horas");
        System.out.println("¿Es del género Realismo Mágico?: " + libro.esDelGenero("Realismo Mágico"));
        
    }
}
