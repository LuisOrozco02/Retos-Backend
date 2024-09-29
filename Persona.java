public class Persona {

    private String nombre;
    private int edad;
    private String genero;
    private String nacionalidad;
    private String ocupacion;

    public Persona(String nombre, int edad, String genero, String nacionalidad, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.ocupacion = ocupacion;
    };

    public void presentarse() {
        System.out.println("Hola, mi nombre es" + nombre);
    }

    public int calcularEdadEn(int años) {
        return edad + años;
    }

    public String obtenerOcupacion() {
        return ocupacion;

    }
}
